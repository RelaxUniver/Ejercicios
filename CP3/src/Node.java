public class Node<E> {
    private E informacion;
    private Node<E> siguiente;
    
    public Node(E informacion) {
        this.informacion = informacion;
        this.siguiente = null;
    }

    public Node(E informacion, Node<E> siguiente) {
        this.informacion = informacion;
        this.siguiente = siguiente;
    }

    public E getInformacion() {
        return informacion;
    }

    public Node<E> getSiguiente() {
        return siguiente;
    }

    public void setInformacion(E informacion) {
        this.informacion = informacion;
    }

    public void setSiguiente(Node<E> siguiente) {
        this.siguiente = siguiente;
    }

}
