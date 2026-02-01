package com.example.apilumiere.services;


import com.example.apilumiere.entities.DadosBancarios;
import com.example.apilumiere.repositories.DadosBancariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadosBancariosService {

    private final DadosBancariosRepository repository;

    public DadosBancariosService(DadosBancariosRepository repository) {
        this.repository = repository;
    }

    public DadosBancarios inserir(DadosBancarios dados) {
        return repository.save(dados);
    }

    public DadosBancarios atualizar(DadosBancarios dados) {
        return repository.save(dados);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public DadosBancarios buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dados bancários não encontrados"));
    }

    public List<DadosBancarios> listarTodos() {
        return repository.findAll();
    }
}
