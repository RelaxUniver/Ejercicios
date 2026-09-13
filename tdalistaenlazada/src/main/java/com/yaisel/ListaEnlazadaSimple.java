package com.yaisel;

public class ListaEnlazadaSimple<T> {

    private Nodo<T> primero = null;
    private int cantidad = 0;

    public ListaEnlazadaSimple() {
    }

    public Nodo<T> getPrimero() {
        return primero;
    }



    public int getCantidad() {
        return cantidad;
    }



    public void setYo(Nodo<T> yo) {
        this.primero = yo;
    }



    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void insertar(T dato, int posicion) {

        if (posicion < 0 || posicion > this.cantidad) {
            throw new IndexOutOfBoundsException("La posición no es valida.");
        }

        if (posicion == 0) {
            Nodo<T> nuevo = new Nodo<>(dato);
            nuevo.setNext(this.primero);
            this.primero = nuevo;
            cantidad++;
            return;
        }

        Nodo<T> actual = this.primero;
        
        for (int i = 0; i<posicion - 1; i++) {
            actual = actual.getNext();
        }

        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setNext(actual.getNext());
        actual.setNext(nuevo);
        cantidad++;
        
    }

    
    public T obtener(int posicion) {
        if (posicion < 0 || posicion >= this.cantidad) {
            throw new IndexOutOfBoundsException("La posición no es valida.");
        }

        if (posicion == 0) {
            return this.primero.getDato();
        }

        Nodo<T> actual = this.primero;
        for (int i = 0; i<posicion; i++) {
            actual = actual.getNext();
        }
        return actual.getDato();
    }

    
    public void eliminar(int posicion) {
        if (posicion < 0 || posicion >= this.cantidad) {
            throw new IndexOutOfBoundsException("La posición no es valida.");
        }
        if(posicion == 0) {
            this.primero = this.primero.getNext();
            cantidad--;
            return;
        }

        Nodo<T> actual = this.primero;
        for (int i = 0; i<posicion-1; i++) {
            actual = actual.getNext();
        }

        actual.setNext(actual.getNext().getNext());
        cantidad--;
    }

    
    public int longitud() {
        return this.cantidad;
    }

    
    public boolean vacia() {
        return this.cantidad==0;
    }



    

}
