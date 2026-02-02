package com.example.apilumiere.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class ProdutoBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Double precoBase;

    @ManyToOne
    private Categoria categoria;

    @OneToMany(mappedBy = "produtoBase")
    private List<VariacaoProduto> variacoes;

    // ===== GETTERS E SETTERS =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<VariacaoProduto> getVariacoes() {
        return variacoes;
    }

    public void setVariacoes(List<VariacaoProduto> variacoes) {
        this.variacoes = variacoes;
    }
}
