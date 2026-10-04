package com.yaisel;

public class Main {

    public static void main(String[] args) {

        ListaProfesor lista = new ListaProfesor();

        lista.agregar(new Profesor("Juan",     28, "Instructor"));
        lista.agregar(new Profesor("María",    45, "Titular"));
        lista.agregar(new Profesor("Carlos",   26, "Instructor"));
        lista.agregar(new Profesor("Ana",      35, "Asistente"));
        lista.agregar(new Profesor("Luis",     24, "Instructor"));
        lista.agregar(new Profesor("Sofía",    50, "Titular"));
        lista.agregar(new Profesor("Pedro",    30, "Auxiliar"));
        lista.agregar(new Profesor("Elena",    27, "Instructor"));

        System.out.println("Total de profesores: " + lista.getCantidad());

        System.out.println("\n--- a) Instructores con más de 26 años (próximos a cambio) ---");
        ListaProfesor prox = lista.ProxCambio();
        Nodo aux = prox.getInicio();
        while (aux != null) {
            Profesor p = aux.getDato();
            System.out.println(p.getNombre() + " - " + p.getEdad() + " años");
            aux = aux.getNext();
        }
        System.out.println("Total: " + prox.getCantidad());

        System.out.println("\n--- b) Profesores ordenados por edad (mayor a menor) ---");
        ListaProfesor ordenados = lista.MostrarLista();
        aux = ordenados.getInicio();
        while (aux != null) {
            Profesor p = aux.getDato();
            System.out.println(p.getNombre() + " - " + p.getEdad()
                    + " años - " + p.getCategoria());
            aux = aux.getNext();
        }

        System.out.println("\n--- c) Cantidad de profesores por categoría ---");
        System.out.println(lista.CantProfesores());

        System.out.println("\n--- Prueba de validación de categoría ---");
        try {
            new Profesor("Test", 40, "Decano");
            System.out.println("ERROR: debió lanzar excepción");
        } catch (IllegalArgumentException ex) {
            System.out.println("OK: " + ex.getMessage());
        }
    }
}