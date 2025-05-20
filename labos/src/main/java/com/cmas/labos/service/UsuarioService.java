package com.cmas.labos.service;

import com.cmas.labos.model.Usuario;
import com.cmas.labos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarioRepo.findAll();
    }
}
