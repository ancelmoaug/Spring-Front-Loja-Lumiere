package com.example.apilumiere.resources;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.apilumiere.entities.ProdutoBase;
import com.example.apilumiere.services.ProdutoBaseService;

@RestController
@RequestMapping("/produtos")
public class ProdutoBaseResource {

    private final ProdutoBaseService service;

    public ProdutoBaseResource(ProdutoBaseService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProdutoBase> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public ProdutoBase criar(@RequestBody ProdutoBase produto) {
        return service.salvar(produto);
    }
}
