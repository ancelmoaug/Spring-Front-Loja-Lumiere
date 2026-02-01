package com.example.apilumiere.resources;

import com.example.apilumiere.entities.Usuario;
import com.example.apilumiere.services.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthResource {
    private final AuthService authService;

    public AuthResource(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario request) {
        return authService.login(request.getEmail(), request.getSenha());
    }
}
