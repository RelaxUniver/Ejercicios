package com.yaisel;

public interface TDALista<T> {

    public void insertar(Object object, int i);
    public Object obtener(int i);
    public void eliminar(int i);
    public int longitud();
    public boolean vacía();

}
