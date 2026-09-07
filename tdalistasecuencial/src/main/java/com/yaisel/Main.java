package main.java.com.yaisel;

import com.yaisel.ListaSecuencial;
import com.yaisel.TDALista;
import com.yaisel.Tarea;
import com.yaisel.Prioridad;

public class Main {
    public static void main(String[] args) {
        
        TDALista<Tarea> lista = new ListaSecuencial<>(10);
        System.out.println("Metodo: " + lista.vacia());
        lista.insertar(new Tarea("T-101", Prioridad.BAJA), 0);
        lista.insertar(new Tarea("T-202", Prioridad.ALTA), 1);
        lista.insertar(new Tarea("T-305", Prioridad.MEDIA), 1);
        System.out.println("Obtener: " + lista.obtener(2));
        lista.eliminar(0);
        lista.insertar(new Tarea("T-410", Prioridad.BAJA), 2);
        lista.insertar(new Tarea("T-999", Prioridad.MEDIA), 5);
        lista.eliminar(10);
        System.out.println(lista.longitud());

    }

}
