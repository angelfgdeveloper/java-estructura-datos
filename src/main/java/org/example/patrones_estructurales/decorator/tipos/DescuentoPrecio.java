package org.example.patrones_estructurales.decorator.tipos;

import org.example.patrones_estructurales.decorator.base.PrecioService;

public class DescuentoPrecio extends PrecioDecorator {

    private Double descuento;

    public DescuentoPrecio(PrecioService precioService, Double descuento) {
        super(precioService);
        this.descuento = descuento;
    }

    public Double obtenerTotal() {
        return precioService.obtenerTotal() - descuento;
    }

}
