package org.example.decorator.tipos;

import org.example.decorator.base.PrecioDecorator;
import org.example.decorator.base.PrecioService;

public class ImpuestoPrecio extends PrecioDecorator {

    private Double impuesto;

    public ImpuestoPrecio(PrecioService precioService, Double impuesto) {
        super(precioService);
        this.impuesto = impuesto;
    }

    public Double obtenerTotal() {
        return precioService.obtenerTotal() * (1 + impuesto);
    }

}
