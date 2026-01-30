package com.example.apilumiere.services;


import com.example.apilumiere.entities.Endereco;
import com.example.apilumiere.repositories.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    private final EnderecoRepository repository;

    public EnderecoService(EnderecoRepository repository) {
        this.repository = repository;
    }

    // Inserir endereço
    public Endereco inserir(Endereco endereco) {
        return repository.save(endereco);
    }

    // Atualizar endereço
    public Endereco atualizar(Endereco endereco) {
        return repository.save(endereco);
    }

    // Deletar endereço
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    // Buscar por ID
    public Endereco buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado"));
    }

    // Listar todos
    public List<Endereco> listarTodos() {
        return repository.findAll();
    }
}
