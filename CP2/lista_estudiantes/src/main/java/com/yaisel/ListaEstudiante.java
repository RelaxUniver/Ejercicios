package com.yaisel;

public class ListaEstudiante {

    private Nodo inicio = null;
    private int cantidad = 0;

    public ListaEstudiante() {
    }

    public void agregar(Estudiante e) {
        Nodo nuevo = new Nodo(e);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
        }

        cantidad++;
    }

    public ListaEstudiante cumpleanos(String mes) {

        Nodo actual = inicio;
        ListaEstudiante cumple = new ListaEstudiante();
        Nodo ultimo = null;

        while (actual != null) {

            String mesEstudiante = actual.getDato().getYear().substring(3, 5); // "08"

            if (mesEstudiante.equals(mes)) {

                Nodo nuevo = new Nodo(actual.getDato());

                if (cumple.getIncio() == null) {

                    cumple.setIncio(nuevo);
                } else {

                    ultimo.setNext(nuevo);
                }
                ultimo = nuevo;
                cumple.setCantidad(cumple.getCantidad() + 1);
            }

            actual = actual.getNext();
        }

        return cumple;
    }

    public ListaEstudiante CantMilitantes() {

        Nodo actual = inicio;
        ListaEstudiante militantes = new ListaEstudiante();

        while (actual != null) {

            if (actual.getDato().isMilitante()) {

                Nodo nuevo = new Nodo(actual.getDato());

                if (militantes.getIncio() == null ||
                        esMenor(actual.getDato().getYear(), militantes.getIncio().getDato().getYear())) {

                    nuevo.setNext(militantes.getIncio());
                    militantes.setIncio(nuevo);

                } else {

                    Nodo aux = militantes.getIncio();

                    while (aux.getNext() != null &&
                            !esMenor(actual.getDato().getYear(), aux.getNext().getDato().getYear())) {
                        aux = aux.getNext();
                    }

                    nuevo.setNext(aux.getNext());
                    aux.setNext(nuevo);
                }

                militantes.setCantidad(militantes.getCantidad() + 1);
            }

            actual = actual.getNext();
        }

        return militantes;
    }

    public int CantBecados() {

        Nodo actual = inicio;
        int contador = 0;

        while (actual != null) {

            if (actual.getDato().isBecado()) {
                contador++;
            }

            actual = actual.getNext();
        }

        return contador;
    }

    private boolean esMenor(String fecha1, String fecha2) {
        int year1 = Integer.parseInt(fecha1.substring(6));
        int year2 = Integer.parseInt(fecha2.substring(6));
        return year1 < year2;
    }

    public Nodo getIncio() {
        return inicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setIncio(Nodo incio) {
        this.inicio = incio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}