package com.yaisel;

public class ListaEnlazadaSimple<T> {

    private Nodo<T> cabeza = null;
    private int cantidad = 0;

    public ListaEnlazadaSimple(Nodo<T> cabeza, int cantidad) {
        this.cabeza = cabeza;
        this.cantidad = cantidad;
    }

    public Nodo<T> getYo() {
        return cabeza;
    }



    public int getCantidad() {
        return cantidad;
    }



    public void setYo(Nodo<T> yo) {
        this.cabeza = yo;
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
            nuevo.setNext(this.cabeza);
            this.cabeza = nuevo;
            cantidad++;
            return;
        }

        Nodo<T> actual = this.cabeza;
        
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
            return this.cabeza.getDato();
        }

        Nodo<T> actual = this.cabeza;
        for (int i = 0; i<posicion; i++) {
            actual = actual.getNext();
        }
        return actual.getDato();
    }

    
    public void eliminar(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    
    public int longitud() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'longitud'");
    }

    
    public void vacia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vacia'");
    }



    

}
