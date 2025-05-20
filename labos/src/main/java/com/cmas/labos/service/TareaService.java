package com.cmas.labos.service;

import com.cmas.labos.dto.TareaDTO;
import com.cmas.labos.model.Tarea;
import com.cmas.labos.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TareaService {
    @Autowired
    private TareaRepository tareaRepo;

    public Tarea crearTarea(Tarea tarea) {
        return tareaRepo.save(tarea);
    }

    public List<TareaDTO> obtenerTareas() {
        return tareaRepo.findAll().stream()
                .map(this::convertirATareaDTO)
                .collect(Collectors.toList());
    }

    public List<TareaDTO> obtenerTareasPorProyecto(Long proyectoId) {
        return tareaRepo.findByProyectoId(proyectoId).stream()
                .map(this::convertirATareaDTO)
                .collect(Collectors.toList());
    }

    private TareaDTO convertirATareaDTO(Tarea tarea) {
        return new TareaDTO(
                tarea.getId(),
                tarea.getTitulo(),
                tarea.isCompletada(),
                tarea.getProyecto().getId()
        );
    }


}
