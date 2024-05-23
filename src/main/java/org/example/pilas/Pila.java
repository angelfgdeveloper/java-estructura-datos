package org.example.pilas;

import java.util.Stack;

public class Pila {

    public static void main(String[] args) {
        String cadena = "((a)*d)"; // true
        boolean validCharacter = isValidString(cadena);

        System.out.println("La cadena : '" + cadena + "' es " + validCharacter);
    }

    public static boolean isValidString(String cadena) {
        Stack<String> pila = new Stack<>();

        for (String character : cadena.split("")) {
            if (character.equals(")")) {
                if (pila.isEmpty()) {
                    return false;
                }

                pila.pop();
            } else if (character.equals("(")) {
                pila.push("(");
            }
        }

        System.out.println("Pila: " + pila);

        return pila.empty();
    }

}
