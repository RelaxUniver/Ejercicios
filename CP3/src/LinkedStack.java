public class LinkedStack<E> implements IStack<E> {

    private Node<E> top;

    public LinkedStack() {
        this.top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public E pop() {
        if (top == null) {
            System.out.println("La pila esta vacía.");
            return null;
        }
        E aux = top.getInformacion();
        top = top.getSiguiente();
        return aux;

    }

    @Override
    public void push(E item) {
        Node<E> push = new Node<E>(item);
        if (item == null) {
            System.out.println("No puede ser null el item a agregar.");
            return;
        }
        push.setSiguiente(top);
        top = push;
        return;
    }

    @Override
    public E top() {
        if (top == null) {
            System.out.println("La Pila esta vacía.");
            return null;
        }
        return top.getInformacion();
    }

}
