package com.yaisel;

public class Profesor {

    private String nombre;
    private int edad;
    private String categoria;

    public Profesor(String nombre, int edad, String categoria) {
        this.nombre = nombre;
        this.edad = edad;

        if (!categoria.matches("^(Instructor|Asistente|Auxiliar|Titular)$")) {
            throw new IllegalArgumentException("Categoría docente inválida.");
        }
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCategoria(String categoria) {
        if (!categoria.matches("^(Instructor|Asistente|Auxiliar|Titular)$")) {
            throw new IllegalArgumentException("Categoría docente inválida.");
        }
        this.categoria = categoria;
    }
}