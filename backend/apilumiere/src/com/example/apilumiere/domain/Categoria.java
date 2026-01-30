package com.example.apilumiere.domain;

import jakarta.persistence.*;

@Entity
public class Categoria {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;

        private String descricao;

        // getters e setters//
}

