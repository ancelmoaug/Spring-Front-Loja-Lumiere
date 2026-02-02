package com.example.apilumiere.entities;

import jakarta.persistence.*;

@Entity
public class Tamanho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeTamanho;

    @OneToOne
    private MedidaTamanho medidaTamanho;

    // ===== GETTERS E SETTERS =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeTamanho() {
        return nomeTamanho;
    }

    public void setNomeTamanho(String nomeTamanho) {
        this.nomeTamanho = nomeTamanho;
    }

    public MedidaTamanho getMedidaTamanho() {
        return medidaTamanho;
    }

    public void setMedidaTamanho(MedidaTamanho medidaTamanho) {
        this.medidaTamanho = medidaTamanho;
    }
}
