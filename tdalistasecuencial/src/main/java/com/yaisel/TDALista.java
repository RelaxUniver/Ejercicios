package com.yaisel;

public interface TDALista<T> {

    public void insertar(T object, int i);
    public T obtener(int i);
    public void eliminar(int i);
    public int longitud();
    public boolean vacia();

}
