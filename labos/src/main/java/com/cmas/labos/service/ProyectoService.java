package com.cmas.labos.service;

import com.cmas.labos.dto.ProyectoDTO;
import com.cmas.labos.dto.TareaDTO;
import com.cmas.labos.model.Proyecto;
import com.cmas.labos.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProyectoService {
    @Autowired
    private ProyectoRepository proyectoRepo;

    public Proyecto crearProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public List<ProyectoDTO> obtenerProyectos() {
        return proyectoRepo.findAll().stream().map(proyecto -> {
            List<TareaDTO> tareas = proyecto.getTareas().stream()
                    .map(t -> new TareaDTO(t.getId(), t.getTitulo(), t.isCompletada(), proyecto.getId()))
                    .collect(Collectors.toList());

            return new ProyectoDTO(
                    proyecto.getId(),
                    proyecto.getNombre(),
                    proyecto.getDescripcion(),
                    proyecto.getUsuario().getNombre(),
                    tareas
            );
        }).collect(Collectors.toList());
    }
}
