package com.example.apilumiere.entities;

import jakarta.persistence.*;

@Entity
public class MedidaTamanho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer busto;
    private Integer cintura;
    private Integer quadril;
    private Integer manga;

    // ===== GETTERS E SETTERS =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBusto() {
        return busto;
    }

    public void setBusto(Integer busto) {
        this.busto = busto;
    }

    public Integer getCintura() {
        return cintura;
    }

    public void setCintura(Integer cintura) {
        this.cintura = cintura;
    }

    public Integer getQuadril() {
        return quadril;
    }

    public void setQuadril(Integer quadril) {
        this.quadril = quadril;
    }

    public Integer getManga() {
        return manga;
    }

    public void setManga(Integer manga) {
        this.manga = manga;
    }
}
