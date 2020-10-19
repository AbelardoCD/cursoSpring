package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="curso")
public class curso {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="native")
    @Column(name = "id")
     private int id;
    @Column(name = "nombre")
     private String nombre;



    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
     private int precio;

    @Column(name = "hora")
    private int hora;

    public curso(){
    }
    public curso(int id, String nombre, String descripcion, int precio,int hora) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.hora = hora;

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", hora=" + hora +
                '}';
    }
}
