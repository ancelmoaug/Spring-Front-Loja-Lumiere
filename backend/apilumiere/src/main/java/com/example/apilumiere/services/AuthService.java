package com.example.apilumiere.services;

import com.example.apilumiere.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UsuarioService usuarioService;

    public AuthService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public Usuario login(String email, String senha) {
        Usuario usuario = usuarioService.buscarPorEmail(email);

        if (!usuario.getSenha().equals(senha)) {
            throw new RuntimeException("Senha inválida");
        }

        return usuario;
    }
}
