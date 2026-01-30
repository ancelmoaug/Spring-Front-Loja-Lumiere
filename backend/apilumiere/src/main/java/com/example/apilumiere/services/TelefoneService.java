package com.example.apilumiere.services;


import com.example.apilumiere.entities.Telefone;
import com.example.apilumiere.repositories.TelefoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefoneService {

    private final TelefoneRepository repository;

    public TelefoneService(TelefoneRepository repository) {
        this.repository = repository;
    }

    public Telefone inserirTelefone(Telefone telefone) {
        return repository.save(telefone);
    }

    public Telefone atualizar(Telefone telefone) {
        return repository.save(telefone);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Telefone buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Telefone não encontrado"));
    }

    public List<Telefone> listarTodos() {
        return repository.findAll();
    }
}
