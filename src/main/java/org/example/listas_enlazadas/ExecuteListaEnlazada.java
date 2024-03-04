package org.example.listas_enlazadas;

public class ExecuteListaEnlazada {

    public static void execute() {
        System.out.println("Lista enlazada");

        Nodo nodo_padre = new Nodo(0);
        Nodo nodo_final_1 = new Nodo(1);
        Nodo nodo_final_2 = new Nodo(2);
        Nodo nodo_final_3 = new Nodo(3);

        System.out.println("nodo_padre " + nodo_padre);
        System.out.println("nodo_final_1 " + nodo_final_1);
        System.out.println("nodo_final_2 " + nodo_final_2);
        System.out.println("nodo_final_3 " + nodo_final_3);

        ListaEnlazada listaEnlazada = new ListaEnlazada(nodo_padre);

        System.out.println("listaEnlazada 1\n" + listaEnlazada);

        listaEnlazada.insertarNodoAlFinal(nodo_final_1);

        System.out.println("\nlistaEnlazada 2\n" + listaEnlazada);

        listaEnlazada.insertarNodoAlFinal(nodo_final_2);

        System.out.println("\nlistaEnlazada 3\n" + listaEnlazada);

        listaEnlazada.insertarNodoAlFinal(nodo_final_3);

        System.out.println("\nlistaEnlazada 4\n" + listaEnlazada);

        Nodo nodoEncontrado = listaEnlazada.buscarNodo(2);

        System.out.println("\nlistaEnlazada - nodoEncontrado \n" + nodoEncontrado);

        listaEnlazada.borrarNodo(nodo_final_2);

        System.out.println("\nlistaEnlazada 5 nodo eliminado\n" + listaEnlazada);

        listaEnlazada.borrarNodoPorValor(1);

        System.out.println("\nlistaEnlazada 6 nodo eliminado por valor\n" + listaEnlazada);


        /**
         * Vista de una lista enlazada
         *
         * {
         *     "cabeza": {
         *         "valor": 0,
         *         "siguiente": {
         *             "valor": 1,
         *             "siguiente": {
         *                 "valor": 2,
         *                 "siguiente": null,
         *                 "anterior": null
         *             },
         *             "anterior": null
         *         },
         *         "anterior": null
         *     },
         *     "cola": {
         *         "valor": 2,
         *         "siguiente": null,
         *         "anterior": null
         *     }
         * }
         *
         */

    }

}
