package com.yaisel;

public class ListaSecuencial<T> implements TDALista<T> {

    private Object[] array;
    private int longitud = 0;
    private int capacidad;

    public ListaSecuencial(int capacidad) {
        this.capacidad = capacidad;
        this.array = new Object[capacidad];
    }

    @Override
    public void insertar(T object, int i) {
        if (((0 <= i) && (i <= this.longitud)) && (this.longitud < this.capacidad)) {
            if (i < this.longitud) {
                for (int j = longitud; i<j; j--) {
                        array[j] = array[j-1];
                }
                array[i] = object;
            } else {
                array[i] = object;
            }
            longitud++;
        }
    }

    @Override
    public T obtener(int i) {
        if (((0 <= i) && (i < this.longitud))) {
            return (T) array[i];
        }
        throw new IndexOutOfBoundsException("Posición Invalida");
    }

    @Override
    public void eliminar(int i) {
        if (((0 <= i) && (i < this.longitud))) {
            array[i] = null;
            for (int j = i; j<longitud; j++) {
                if (j < longitud-1) {
                    array[j] = array[j+1];
                }
            }
            longitud--;
        }
    }

    @Override
    public int longitud() {
        return this.longitud;
    }

    @Override
    public boolean vacia() {
        return longitud == 0;
    }

}
