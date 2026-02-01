package com.example.apilumiere.repositories;


import com.example.apilumiere.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findByCargo(String cargo);
    List<Funcionario> findByNomeContainingIgnoreCase(String nome);
}