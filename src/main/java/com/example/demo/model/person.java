package com.example.demo.model;

public class person {
    private String nombre;
    private int edad;

    public person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public person() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
