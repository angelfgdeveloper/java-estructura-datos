package org.example.facade.validators;

import org.example.facade.enums.TipoPago;

import java.util.Arrays;

public class FormaPagoValidar {

    public static void tipoPago(String tipoPago) {
        boolean existeTipoPago = Arrays.stream(TipoPago.values()).anyMatch(tipo -> tipo.name().equals(tipoPago.toUpperCase()));

        if (!existeTipoPago) {
            throw new RuntimeException("El metodo de pago no existe");
        }

        System.out.println("Tipo de pago: " + tipoPago);
    }

}
