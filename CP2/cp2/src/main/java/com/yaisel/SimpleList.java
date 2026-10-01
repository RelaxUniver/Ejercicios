package com.yaisel;

import main.java.com.yaisel.Node;

public class SimpleList {

    private Node inicio;
    private int cantidad;

    public SimpleList() {
        this.inicio = null;
        this.cantidad = 0;
    }

    public void eliminarDuplicados() {

        Node actual = this.inicio;
        try {
            if (actual == null) {
                throw new NullPointerException("La lista esta vacia.");
            }
        } catch (Exception e) {
            return;
        }
        Node anterior = actual;
        Node buscar = actual.getNext();

        if (buscar == null) {
            System.out.println("No existe repetidos en la Lista Simple.");
            return;
        }

        while (true) {
            if (buscar != null && actual.getDato().equals(buscar.getDato())) {
                anterior.setNext(buscar.getNext());
                Node avance = buscar.getNext();
                buscar.setNext(null);
                buscar = avance;
            } else {
                if (buscar != null) {
                    buscar = buscar.getNext();
                    anterior = anterior.getNext();
                }
            }
            if (buscar == null) {
                actual = actual.getNext();
                if (actual == null) {
                    break;
                }
                buscar = actual.getNext();
                anterior = actual;
            }
        }

    }

    public void rotarUnElementoDerecha () {
        try {
            if (this.inicio == null) {
                throw new NullPointerException("La lista esta vacia.");
            }
        } catch (Exception e) {
            return;
        }
        Node anterior = this.inicio;
        Node ultimo = this.inicio.getNext();

        if (ultimo == null) {
            System.out.println("Solo contiene un elemento.");
            return;
        }

        while(true) {
            if (ultimo.getNext() != null) {
                anterior = ultimo;
                ultimo = ultimo.getNext();
            } else {
                anterior.setNext(ultimo.getNext());
                ultimo.setNext(this.inicio);
                break;
            }
        }
        this.inicio = ultimo;
    }

}