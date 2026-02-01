package com.example.apilumiere.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "funcionarios")
@PrimaryKeyJoinColumn(name = "usuario_id")
public class Funcionario extends Usuario {

    private String cargo;
    private LocalDate dataAdmissao;
    private double salario;

    public Funcionario() {
        super();
    }

    /*public Funcionario(Usuario usuario, String cargo, LocalDate dataAdmissao, double salario) {
        super(usuario);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }*/

    // getters e setters

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
