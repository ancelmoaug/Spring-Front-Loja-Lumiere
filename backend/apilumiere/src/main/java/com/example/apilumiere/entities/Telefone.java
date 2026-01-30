package com.example.apilumiere.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "telefones")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    public Telefone() {}

    public Telefone(String numero) {
        this.numero = numero;
    }

    public Telefone(Long id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    /* getters e setters */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
