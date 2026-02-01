package com.example.apilumiere.resources;

import com.example.apilumiere.entities.Cliente;
import com.example.apilumiere.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

    private final ClienteService clienteService;

    public ClienteResource(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return clienteService.inserir(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id,
                             @RequestBody Cliente cliente) {
        cliente.setId(id);
        return clienteService.atualizar(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        clienteService.deletar(id);
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteService.buscarPorId(id);
    }

    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteService.listarTodos();
    }

    @GetMapping("/email/{email}")
    public Cliente buscarPorEmail(@PathVariable String email) {
        return clienteService.buscarPorEmail(email);
    }

    @GetMapping("/cpf/{cpf}")
    public Cliente buscarPorCpf(@PathVariable String cpf) {
        return clienteService.buscarPorCpf(cpf);
    }
}
