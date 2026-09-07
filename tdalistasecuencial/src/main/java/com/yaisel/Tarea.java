package com.yaisel;

public class Tarea {

    private String tarea;
    private Prioridad prioridad;

    public Tarea(String tarea, Prioridad prioridad) {
        this.tarea = tarea;
        this.prioridad = prioridad;
    }

    public String getTarea() {
        return tarea;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
    
}