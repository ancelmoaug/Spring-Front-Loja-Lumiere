package com.example.apilumiere.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.apilumiere.domain.Categoria;
import com.example.apilumiere.repositories.CategoriaRepository;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public List<Categoria> listar() {
        return repository.findAll();
    }

    public Categoria salvar(Categoria categoria) {
        return repository.save(categoria);
    }
}

