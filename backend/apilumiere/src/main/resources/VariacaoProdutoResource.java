package com.example.apilumiere.resources;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.apilumiere.entities.VariacaoProduto;
import com.example.apilumiere.services.VariacaoProdutoService;

@RestController
@RequestMapping("/variacoes")
public class VariacaoProdutoResource {

    private final VariacaoProdutoService service;

    public VariacaoProdutoResource(VariacaoProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public List<VariacaoProduto> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public VariacaoProduto criar(@RequestBody VariacaoProduto variacao) {
        return service.salvar(variacao);
    }
}
