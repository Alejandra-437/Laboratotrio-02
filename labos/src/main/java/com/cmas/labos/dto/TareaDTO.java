package com.cmas.labos.dto;

public class TareaDTO {
    private Long id;
    private String titulo;
    private boolean completada;
    private Long proyectoId;

    // Constructor
    public TareaDTO(Long id, String titulo, boolean completada, Long proyectoId) {
        this.id = id;
        this.titulo = titulo;
        this.completada = completada;
        this.proyectoId = proyectoId;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isCompletada() {
        return completada;
    }

    public Long getProyectoId() {
        return proyectoId;
    }
}
