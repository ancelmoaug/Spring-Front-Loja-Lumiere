package com.example.apilumiere.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apilumiere.entities.ProdutoBase;

public interface ProdutoBaseRepository extends JpaRepository<ProdutoBase, Long> {
}
