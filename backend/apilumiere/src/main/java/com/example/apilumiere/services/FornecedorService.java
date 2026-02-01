package com.example.apilumiere.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.apilumiere.entities.Fornecedor;
import com.example.apilumiere.repositories.FornecedorRepository;

@Service
public class FornecedorService {

    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    public List<Fornecedor> listar() {
        return repository.findAll();
    }

    public Fornecedor salvar(Fornecedor fornecedor) {
        return repository.save(fornecedor);
    }

    public Fornecedor buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fornecedor não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
