package com.prueba.gestion.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String ubicacion;

    @ManyToOne
    @JoinColumn(name = "jefe_departamento")
    private Empleado jefeDepartamento;

    // Constructor, getters y setters

    public Departamento() {
        // Constructor sin argumentos
    }


    public Departamento(String nombre, String descripcion, String ubicacion, Empleado jefeDepartamento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.jefeDepartamento = jefeDepartamento;
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Empleado getJefeDepartamento() {
        return jefeDepartamento;
    }

    public void setJefeDepartamento(Empleado jefeDepartamento) {
        this.jefeDepartamento = jefeDepartamento;
    }
}
