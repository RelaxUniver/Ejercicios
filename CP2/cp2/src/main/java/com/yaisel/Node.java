package main.java.com.yaisel;

public class Node {
    
    private Object dato;
    private Node siguiente;

    public Node(Object dato, Node siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Object getDato() {
        return dato;
    }

    public Node getNext() {
        return siguiente;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setNext(Node siguiente) {
        this.siguiente = siguiente;
    }
    
}
