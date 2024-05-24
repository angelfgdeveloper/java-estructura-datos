package org.example.facade.validators;

import java.util.Objects;

public class MontoValidar {

    public static void montosValidosParaPago(Double montoPago, Double montoEstadoCuenta) {
        if (!Objects.equals(montoPago, montoEstadoCuenta)) {
            throw new RuntimeException("Importes distitos para pago: " + montoPago + ", estado cuenta: " + montoEstadoCuenta);
        }

        System.out.println("Montos iguales :D");
    }

}
