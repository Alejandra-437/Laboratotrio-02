package com.cmas.labos.controller;

import com.cmas.labos.dto.TareaDTO;
import com.cmas.labos.model.Tarea;
import com.cmas.labos.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @PostMapping
    public Tarea crear(@RequestBody Tarea tarea) {
        return tareaService.crearTarea(tarea);
    }

    @GetMapping
    public List<TareaDTO> obtenerTodas() {
        return tareaService.obtenerTareas();
    }

    @GetMapping("/proyecto/{proyectoId}")
    public List<TareaDTO> obtenerPorProyecto(@PathVariable Long proyectoId) {
        return tareaService.obtenerTareasPorProyecto(proyectoId);
    }
}
