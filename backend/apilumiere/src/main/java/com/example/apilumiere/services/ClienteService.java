package com.example.apilumiere.services;

import com.example.apilumiere.entities.Cliente;
import com.example.apilumiere.repositories.ClienteRepository;
import com.example.apilumiere.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final UsuarioRepository usuarioRepository;

    public ClienteService(ClienteRepository clienteRepository,
                          UsuarioRepository usuarioRepository) {
        this.clienteRepository = clienteRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public Cliente inserir(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente buscarPorEmail(String email) {
        return (Cliente) usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public Cliente buscarPorCpf(String cpf) {
        return (Cliente) usuarioRepository.findByCpf(cpf)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public List<Cliente> buscarPorNome(String nome) {
        return usuarioRepository.findByNomeContainingIgnoreCase(nome)
                .stream()
                .filter(u -> u instanceof Cliente)
                .map(u -> (Cliente) u)
                .toList();
    }
}
