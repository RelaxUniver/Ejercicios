package com.yaisel;

public class Nodo {

    private Profesor dato;
    private Nodo next;

    public Nodo(Profesor dato) {
        this.dato = dato;
        this.next = null;
    }

    public Profesor getDato() {
        return dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setDato(Profesor dato) {
        this.dato = dato;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}