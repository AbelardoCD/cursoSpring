package com.example.demo.model;

public class cursoModelo {
    private String nombre;
    private String descripcion;
    private int precio;
    private int hora;


    public cursoModelo(String nombre, String descripcion, int precio, int hora) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.hora = hora;
    }

    public cursoModelo(){}

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

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
