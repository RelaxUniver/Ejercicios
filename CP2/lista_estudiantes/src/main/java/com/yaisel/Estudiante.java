package com.yaisel;

public class Estudiante {
    
    private int carneI;
    private String nombre;
    private String apellido;
    private String sexo;
    private String year;
    private boolean militante;
    private boolean becado;
    
    public Estudiante(int carneI, String nombre, String apellido, String sexo, String year, boolean militante,
            boolean becado) {
        this.carneI = carneI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        if (!year.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|20\\d{2})$")) {
            throw new IllegalArgumentException("Formato de la fecha incorrecto.");
        }   
        this.year = year;
        this.militante = militante;
        this.becado = becado;
    }

    public int getCarneI() {
        return carneI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public String getYear() {
        return year;
    }

    public boolean isMilitante() {
        return militante;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setCarneI(int carneI) {
        this.carneI = carneI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMilitante(boolean militante) {
        this.militante = militante;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

}
