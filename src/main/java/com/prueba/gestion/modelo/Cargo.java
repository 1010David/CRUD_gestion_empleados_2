package com.prueba.gestion.modelo;


import jakarta.persistence.*;

@Entity
@Table(name = "cargo")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private Integer nivelJerarquico;
    private Double salarioBase;

    // Constructor, getters y setters

    public Cargo() {
        // Constructor sin argumentos
    }



    public Cargo(String nombre, String descripcion, Integer nivelJerarquico, Double salarioBase) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelJerarquico = nivelJerarquico;
        this.salarioBase = salarioBase;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNivelJerarquico() {
        return nivelJerarquico;
    }

    public void setNivelJerarquico(Integer nivelJerarquico) {
        this.nivelJerarquico = nivelJerarquico;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

