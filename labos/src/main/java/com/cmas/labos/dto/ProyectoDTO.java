package com.cmas.labos.dto;

import java.util.List;

public class ProyectoDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private String nombreUsuario; // Podemos incluir el nombre del usuario si es útil
    private List<TareaDTO> tareas;

    // Constructor
    public ProyectoDTO(Long id, String nombre, String descripcion, String nombreUsuario, List<TareaDTO> tareas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nombreUsuario = nombreUsuario;
        this.tareas = tareas;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public List<TareaDTO> getTareas() {
        return tareas;
    }

    public void setTareas(List<TareaDTO> tareas) {
        this.tareas = tareas;
    }
}
