package org.example.patrones_estructurales.decorator.tipos;

import org.example.patrones_estructurales.decorator.base.PrecioService;

public abstract class PrecioDecorator implements PrecioService {

    protected PrecioService precioService;

    public PrecioDecorator(PrecioService precioService) {
        this.precioService = precioService;
    }

    @Override
    public Double obtenerTotal() {
        return precioService.obtenerTotal();
    }

}
