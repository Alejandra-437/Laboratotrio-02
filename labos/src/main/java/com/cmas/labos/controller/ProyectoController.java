package com.cmas.labos.controller;

import com.cmas.labos.dto.ProyectoDTO;
import com.cmas.labos.model.Proyecto;
import com.cmas.labos.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {
    @Autowired
    private ProyectoService proyectoService;

    @PostMapping
    public Proyecto crear(@RequestBody Proyecto proyecto) {
        return proyectoService.crearProyecto(proyecto);
    }

    @GetMapping
    public List<ProyectoDTO> obtenerTodos() {
        return proyectoService.obtenerProyectos();
    }
}
