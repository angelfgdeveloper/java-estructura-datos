package org.example.listas_enlazadas;

public class ListaEnlazada {
    private Nodo cabeza;
    private Nodo cola;

    public ListaEnlazada(Nodo primerNodo) {
        this.cabeza = primerNodo;
        this.cola = primerNodo;
    }

    public void insertarNodoAlFinal(Nodo nuevoNodo) {
        this.cola.setSiguiente(nuevoNodo);
        this.cola = this.cola.getSiguiente();
    }

    public void borrarNodo(Nodo nodo) {
        nodo.setSiguiente(null);
    }

    public Nodo buscarNodo(int valorABuscar) {
        Nodo nodoActual = this.cabeza;

        while (nodoActual != null) {
            if (nodoActual.getValor() == valorABuscar) {
                return nodoActual;
            }

            nodoActual = nodoActual.getSiguiente();
        }

        return null;
    }

    public void borrarNodoPorValor(int valor) {
        Nodo nodoABorrar = buscarNodo(valor);

        if (nodoABorrar != null) {
            nodoABorrar.setSiguiente(null);
        }
    }

    @Override
    public String toString() {
        return "ListaEnlazada {" +
                " cabeza=" + cabeza +
                ", cola=" + cola + " " +
                '}';
    }
}
