package com.yaisel;

public class ListaProfesor {

    private Nodo inicio = null;
    private int cantidad = 0;

    public ListaProfesor() {
    }

    public void agregar(Profesor p) {
        Nodo nuevo = new Nodo(p);

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

    public ListaProfesor ProxCambio() {

        Nodo actual = inicio;
        ListaProfesor prox = new ListaProfesor();
        Nodo ultimo = null;

        while (actual != null) {

            Profesor p = actual.getDato();

            if (p.getCategoria().equals("Instructor") && p.getEdad() > 26) {

                Nodo nuevo = new Nodo(p);

                if (prox.getInicio() == null) {
                    prox.setInicio(nuevo);
                } else {
                    ultimo.setNext(nuevo);
                }
                ultimo = nuevo;
                prox.setCantidad(prox.getCantidad() + 1);
            }

            actual = actual.getNext();
        }

        return prox;
    }

    public ListaProfesor MostrarLista() {

        Nodo actual = inicio;
        ListaProfesor ordenados = new ListaProfesor();

        while (actual != null) {

            Nodo nuevo = new Nodo(actual.getDato());

            if (ordenados.getInicio() == null ||
                    actual.getDato().getEdad() > ordenados.getInicio().getDato().getEdad()) {

                nuevo.setNext(ordenados.getInicio());
                ordenados.setInicio(nuevo);

            } else {
               
                Nodo aux = ordenados.getInicio();

                while (aux.getNext() != null &&
                        actual.getDato().getEdad() <= aux.getNext().getDato().getEdad()) {
                    aux = aux.getNext();
                }

                nuevo.setNext(aux.getNext());
                aux.setNext(nuevo);
            }

            ordenados.setCantidad(ordenados.getCantidad() + 1);
            actual = actual.getNext();
        }

        return ordenados;
    }

    public String CantProfesores() {

        Nodo actual = inicio;
        int instructores = 0;
        int asistentes = 0;
        int auxiliares = 0;
        int titulares = 0;

        while (actual != null) {

            String cat = actual.getDato().getCategoria();

            if (cat.equals("Instructor")) {
                instructores++;
            } else if (cat.equals("Asistente")) {
                asistentes++;
            } else if (cat.equals("Auxiliar")) {
                auxiliares++;
            } else if (cat.equals("Titular")) {
                titulares++;
            }

            actual = actual.getNext();
        }

        return "Instructores: " + instructores +
               "\nAsistentes: " + asistentes +
               "\nAuxiliares: " + auxiliares +
               "\nTitulares: " + titulares;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}