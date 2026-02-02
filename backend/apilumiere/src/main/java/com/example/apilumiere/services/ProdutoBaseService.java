package com.example.apilumiere.services;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.apilumiere.entities.ProdutoBase;
import com.example.apilumiere.repositories.ProdutoBaseRepository;

@Service
public class ProdutoBaseService {

    private final ProdutoBaseRepository repository;

    public ProdutoBaseService(ProdutoBaseRepository repository) {
        this.repository = repository;
    }

    public List<ProdutoBase> listarTodos() {
        return repository.findAll();
    }

    public ProdutoBase salvar(ProdutoBase produto) {
        return repository.save(produto);
    }
}
