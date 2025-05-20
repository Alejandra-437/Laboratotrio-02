package com.cmas.labos.controller;

import com.cmas.labos.model.Usuario;
import com.cmas.labos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioService.crearUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> obtenerTodos() {
        return usuarioService.obtenerUsuarios();
    }
}
