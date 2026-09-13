package com.yaisel;

public class Nodo<T> {

    private T dato;
    private Nodo<T> next = null;

    public Nodo(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }
    
} 