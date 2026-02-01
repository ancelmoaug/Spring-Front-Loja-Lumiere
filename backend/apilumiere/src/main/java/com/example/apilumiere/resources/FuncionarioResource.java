package com.example.apilumiere.resources;


import com.example.apilumiere.entities.Funcionario;
import com.example.apilumiere.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioResource {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public Funcionario inserir(@RequestBody Funcionario funcionario) {
        return funcionarioService.inserir(funcionario);
    }

    @PutMapping("/{id}")
    public Funcionario atualizar(@PathVariable Long id,
                                 @RequestBody Funcionario funcionario) {
        funcionario.setId(id);
        return funcionarioService.atualizar(funcionario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        funcionarioService.deletar(id);
    }

    @GetMapping("/{id}")
    public Funcionario buscarPorId(@PathVariable Long id) {
        return funcionarioService.buscarPorId(id);
    }

    @GetMapping
    public List<Funcionario> listarTodos() {
        return funcionarioService.listarTodos();
    }

    @GetMapping("/cargo/{cargo}")
    public List<Funcionario> buscarPorCargo(@PathVariable String cargo) {
        return funcionarioService.buscarPorCargo(cargo);
    }

    @GetMapping("/nome/{nome}")
    public List<Funcionario> buscarPorNome(@PathVariable String nome) {
        return funcionarioService.buscarPorNome(nome);
    }
}