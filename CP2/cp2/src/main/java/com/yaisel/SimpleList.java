package com.yaisel;

public class SimpleList {

    private Node inicio;
    private int cantidad;

    public SimpleList() {
        this.inicio = null;
        this.cantidad = 0;
    }

    public Node getInicio() {
        return inicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setInicio(Node inicio) {
        this.inicio = inicio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public void rotarElUltimoElemento () {
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

        public void concatenarLista(SimpleList lista) {
        if (lista == null || lista.getInicio() == null) {
            return;
        }
        if (this.inicio == null) {
            this.inicio = lista.getInicio();
            return;
        }
        Node actual = this.inicio;
        while (true) {
            if(actual.getNext() != null) {
                actual = actual.getNext();
            } else {
                actual.setNext(lista.getInicio());
                break;
            }
        }
    }

}