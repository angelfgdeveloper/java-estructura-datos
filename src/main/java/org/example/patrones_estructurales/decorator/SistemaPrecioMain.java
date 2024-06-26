package org.example.patrones_estructurales.decorator;

import org.example.patrones_estructurales.decorator.base.BasePrecioComponent;
import org.example.patrones_estructurales.decorator.base.PrecioService;
import org.example.patrones_estructurales.decorator.tipos.DescuentoPrecio;
import org.example.patrones_estructurales.decorator.tipos.ImpuestoPrecio;

public class SistemaPrecioMain {

    public static void main(String[] args) {

        PrecioService precioBaseService = new BasePrecioComponent(1552.89);
        PrecioService precioConDescuento = new DescuentoPrecio(precioBaseService, 500.89);
        PrecioService precioConImpuesto = new ImpuestoPrecio(precioConDescuento, 0.20);

        System.out.println("Total base: " + precioBaseService.obtenerTotal());
        System.out.println("Descuento del total: " + precioConDescuento.obtenerTotal()); // 1052.0
        System.out.println("Impuesto del total: " + precioConImpuesto.obtenerTotal()); // con impuesto 1262.3999999999999

    }

}
