package org.example.decorator.base;

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
