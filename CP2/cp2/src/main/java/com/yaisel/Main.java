package com.yaisel;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("1. ELIMINAR DUPLICADOS");
        System.out.println();

        System.out.println("Caso A: Lista vacia");
        SimpleList lista1 = new SimpleList();
        System.out.print("ANTES: ");
        Node aux = lista1.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        lista1.eliminarDuplicados();
        System.out.print("DESPUES: ");
        aux = lista1.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Caso B: Un solo elemento");
        SimpleList lista2 = new SimpleList();
        lista2.setInicio(new Node("A", null));
        lista2.setCantidad(1);
        System.out.print("ANTES: ");
        aux = lista2.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        lista2.eliminarDuplicados();
        System.out.print("DESPUES: ");
        aux = lista2.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Caso C: Sin duplicados");
        SimpleList lista3 = new SimpleList();
        Node n4 = new Node("D", null);
        Node n3 = new Node("C", n4);
        Node n2 = new Node("B", n3);
        Node n1 = new Node("A", n2);
        lista3.setInicio(n1);
        lista3.setCantidad(4);
        System.out.print("ANTES: ");
        aux = lista3.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        lista3.eliminarDuplicados();
        System.out.print("DESPUES: ");
        aux = lista3.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Caso D: Con duplicados");
        SimpleList lista4 = new SimpleList();
        Node d7 = new Node("A", null);
        Node d6 = new Node("D", d7);
        Node d5 = new Node("B", d6);
        Node d4 = new Node("C", d5);
        Node d3 = new Node("A", d4);
        Node d2 = new Node("B", d3);
        Node d1 = new Node("A", d2);
        lista4.setInicio(d1);
        lista4.setCantidad(7);
        System.out.print("ANTES: ");
        aux = lista4.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        lista4.eliminarDuplicados();
        System.out.print("DESPUES: ");
        aux = lista4.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println();
        System.out.println("2. ROTAR ULTIMO ELEMENTO A LA DERECHA");
        System.out.println();

        System.out.println("Caso A: Lista vacia");
        SimpleList lista5 = new SimpleList();
        System.out.print("ANTES: ");
        aux = lista5.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        lista5.rotarElUltimoElemento();
        System.out.print("DESPUES: ");
        aux = lista5.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Caso B: Un solo elemento");
        SimpleList lista6 = new SimpleList();
        lista6.setInicio(new Node("A", null));
        lista6.setCantidad(1);
        System.out.print("ANTES: ");
        aux = lista6.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        lista6.rotarElUltimoElemento();
        System.out.print("DESPUES: ");
        aux = lista6.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Caso C: Multiples elementos");
        SimpleList lista7 = new SimpleList();
        Node r4 = new Node("D", null);
        Node r3 = new Node("C", r4);
        Node r2 = new Node("B", r3);
        Node r1 = new Node("A", r2);
        lista7.setInicio(r1);
        lista7.setCantidad(4);
        System.out.print("ANTES: ");
        aux = lista7.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        lista7.rotarElUltimoElemento();
        System.out.print("DESPUES: ");
        aux = lista7.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println();
        System.out.println("3. CONCATENAR LISTAS");
        System.out.println();

        System.out.println("Caso A: Ambas con datos");
        SimpleList lista8 = new SimpleList();
        Node c4 = new Node("D", null);
        Node c3 = new Node("C", c4);
        Node c2 = new Node("B", c3);
        Node c1 = new Node("A", c2);
        lista8.setInicio(c1);
        lista8.setCantidad(4);
        SimpleList lista9 = new SimpleList();
        Node c8 = new Node("H", null);
        Node c7 = new Node("G", c8);
        Node c6 = new Node("F", c7);
        Node c5 = new Node("E", c6);
        lista9.setInicio(c5);
        lista9.setCantidad(4);
        System.out.print("Original ANTES: ");
        aux = lista8.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.print("Parametro: ");
        aux = lista9.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        lista8.concatenarLista(lista9);
        System.out.print("Original DESPUES: ");
        aux = lista8.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Caso B: Original vacia + Parametro con datos");
        SimpleList lista10 = new SimpleList();
        SimpleList lista11 = new SimpleList();
        Node c11c = new Node("G", null);
        Node c11b = new Node("F", c11c);
        Node c11a = new Node("E", c11b);
        lista11.setInicio(c11a);
        lista11.setCantidad(3);
        System.out.print("Original ANTES: ");
        aux = lista10.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.print("Parametro: ");
        aux = lista11.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        lista10.concatenarLista(lista11);
        System.out.print("Original DESPUES: ");
        aux = lista10.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Caso C: Original con datos + Parametro vacio");
        SimpleList lista12 = new SimpleList();
        Node c12c = new Node("C", null);
        Node c12b = new Node("B", c12c);
        Node c12a = new Node("A", c12b);
        lista12.setInicio(c12a);
        lista12.setCantidad(3);
        SimpleList lista13 = new SimpleList();
        System.out.print("Original ANTES: ");
        aux = lista12.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.print("Parametro: ");
        aux = lista13.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        lista12.concatenarLista(lista13);
        System.out.print("Original DESPUES: ");
        aux = lista12.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Caso D: Original con datos + Parametro null");
        SimpleList lista14 = new SimpleList();
        Node c14c = new Node("C", null);
        Node c14b = new Node("B", c14c);
        Node c14a = new Node("A", c14b);
        lista14.setInicio(c14a);
        lista14.setCantidad(3);
        System.out.print("Original ANTES: ");
        aux = lista14.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
        System.out.println("Parametro: null");
        lista14.concatenarLista(null);
        System.out.print("Original DESPUES: ");
        aux = lista14.getInicio();
        if (aux == null)
            System.out.println("[vacia]");
        else {
            while (aux != null) {
                System.out.print(aux.getDato());
                if (aux.getNext() != null)
                    System.out.print(" -> ");
                aux = aux.getNext();
            }
            System.out.println();
        }
    }
}