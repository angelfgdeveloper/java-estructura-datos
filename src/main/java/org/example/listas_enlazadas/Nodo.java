package org.example.listas_enlazadas;

public class Nodo {
    private int valor;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }

    public void agregarNodoSiguiente(Nodo nodoSiguiente) {
        this.siguiente = nodoSiguiente;
    }

    public void agregarNodoAnterior(Nodo nodoAnterior) {
        this.anterior = nodoAnterior;
    }

    public void actualizarValor(int nuevoValor) {
        this.valor = nuevoValor;
        // return this.valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor +
                ", siguiente=" + siguiente +
                ", anterior=" + anterior +
                '}';
    }
}
