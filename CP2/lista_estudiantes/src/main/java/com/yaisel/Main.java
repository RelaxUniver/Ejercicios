package com.yaisel;

public class Main {

    public static void main(String[] args) {

        ListaEstudiante lista = new ListaEstudiante();

        lista.agregar(new Estudiante(9501, "Juan",   "Pérez",  "M", "15/08/1995", true,  true));
        lista.agregar(new Estudiante(9802, "María",  "López",  "F", "20/03/1998", false, true));
        lista.agregar(new Estudiante(9703, "Carlos", "Ruiz",   "M", "10/08/1997", true,  false));
        lista.agregar(new Estudiante(9904, "Ana",    "Torres", "F", "05/12/1999", true,  true));
        lista.agregar(new Estudiante(9605, "Luis",   "Gómez",  "M", "25/07/1996", false, false));
        lista.agregar(new Estudiante(2006, "Sofía",  "Díaz",   "F", "12/03/2000", true,  false));

        System.out.println("Total de estudiantes: " + lista.getCantidad());

        System.out.println("\n--- a) Estudiantes que cumplen años en agosto ---");
        ListaEstudiante cumple = lista.cumpleanos("08");
        Nodo aux = cumple.getIncio();
        while (aux != null) {
            Estudiante e = aux.getDato();
            System.out.println(e.getNombre() + " " + e.getApellido()
                    + " (" + e.getYear() + ")");
            aux = aux.getNext();
        }
        System.out.println("Total que cumplen en agosto: " + cumple.getCantidad());

        System.out.println("\n--- b) Militantes ordenados por año (menor a mayor) ---");
        ListaEstudiante militantes = lista.CantMilitantes();
        aux = militantes.getIncio();
        while (aux != null) {
            Estudiante e = aux.getDato();
            System.out.println(e.getNombre() + " " + e.getApellido()
                    + " - Año: " + e.getYear().substring(6));
            aux = aux.getNext();
        }
        System.out.println("Total de militantes: " + militantes.getCantidad());

        System.out.println("\n--- c) Cantidad de becados ---");
        int becados = lista.CantBecados();
        System.out.println("Becados: " + becados);

        System.out.println("\n--- Prueba de validación de fecha ---");
        try {
            new Estudiante(1234, "Test", "Test", "M", "1995-08-15", false, false);
            System.out.println("ERROR: debió lanzar excepción");
        } catch (IllegalArgumentException ex) {
            System.out.println("OK: " + ex.getMessage());
        }
    }
}