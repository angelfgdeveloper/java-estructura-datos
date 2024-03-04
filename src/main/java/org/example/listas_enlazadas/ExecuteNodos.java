package org.example.listas_enlazadas;

public class ExecuteNodos {

    public static void execute() {

        Nodo nodo_Padre = new Nodo(0);
        Nodo nodo_1 = new Nodo(1);
        Nodo nodo_2 = new Nodo(2);
        Nodo nodo_3 = new Nodo(3);
        Nodo nodo_4 = new Nodo(40);

        System.out.println("nodo_padre " + nodo_Padre);
        System.out.println("nodo_1 " + nodo_1);
        System.out.println("nodo_2 " + nodo_2);
        System.out.println("nodo_3 " + nodo_3);
        System.out.println("nodo_4 " + nodo_4);

        nodo_Padre.agregarNodoSiguiente(nodo_1);
        nodo_Padre.agregarNodoAnterior(nodo_2);

        nodo_1.agregarNodoSiguiente(nodo_3);
        nodo_2.agregarNodoSiguiente(nodo_4);

        System.out.println("\n\nnodo padre completo\n" + nodo_Padre);

        nodo_4.actualizarValor(4);

        System.out.println("\n\nnodo padre completo\n" + nodo_Padre);

        /**
         * Vista de un Nodo
         *
         * {
         *     "valor": 0,
         *     "siguiente": {
         *         "valor": 1,
         *         "siguiente": {
         *             "valor": 3,
         *             "siguiente": null,
         *             "anterior": null
         *         },
         *         "anterior": null
         *     },
         *     "anterior": {
         *         "valor": 2,
         *         "siguiente": {
         *             "valor": 4,
         *             "siguiente": null,
         *             "anterior": null
         *         },
         *         "anterior": null
         *     }
         * }
         *
         */

    }

}
