package com.example.apilumiere.services;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.apilumiere.entities.VariacaoProduto;
import com.example.apilumiere.repositories.VariacaoProdutoRepository;

@Service
public class VariacaoProdutoService {

    private final VariacaoProdutoRepository repository;

    public VariacaoProdutoService(VariacaoProdutoRepository repository) {
        this.repository = repository;
    }

    public List<VariacaoProduto> listarTodas() {
        return repository.findAll();
    }

    public VariacaoProduto salvar(VariacaoProduto variacao) {
        return repository.save(variacao);
    }
}
