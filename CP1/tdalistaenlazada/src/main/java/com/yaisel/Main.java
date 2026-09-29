package com.yaisel;

public class Main {
    
    public static void main(String[] args) {
        
        ListaEnlazadaSimple<String> listaEnlazadaSimple = new ListaEnlazadaSimple<>();

        System.out.println();
        System.out.println("¿Está vacía?" + (listaEnlazadaSimple.vacia() ? " Si." : " No"));
        System.out.println();
        Nodo<String> primero = new Nodo<String>("A-10");
        listaEnlazadaSimple.insertar(primero.getDato(), 0);
        listaEnlazadaSimple.insertar("B-20", 1);
        listaEnlazadaSimple.insertar("C-30", 1);
        listaEnlazadaSimple.insertar("D-40", 0);
        Nodo<String> actual = listaEnlazadaSimple.getPrimero();
        for (int i = 0; i<listaEnlazadaSimple.getCantidad(); i++) {
            System.out.println(actual.getDato()+" ");
            actual = actual.getNext();
        }
        System.out.println();
        System.out.println("Obtener: " + listaEnlazadaSimple.obtener(2));
        listaEnlazadaSimple.eliminar(1);
        System.out.println();
        actual = listaEnlazadaSimple.getPrimero();
        for (int i = 0; i<listaEnlazadaSimple.getCantidad(); i++) {
            System.out.println(actual.getDato()+" ");
            actual = actual.getNext();
        }
        System.out.println();
        listaEnlazadaSimple.insertar("E-50", 3);
        actual = listaEnlazadaSimple.getPrimero();
        for (int i = 0; i<listaEnlazadaSimple.getCantidad(); i++) {
            System.out.println(actual.getDato()+" ");
            actual = actual.getNext();
        }
        // Caso de Error: System.out.println("Obtener: " + (listaEnlazadaSimple.obtener(5)==null ? "No existe" : "Si existe"));
        System.out.println("Longitud " + listaEnlazadaSimple.longitud());
    }
}
