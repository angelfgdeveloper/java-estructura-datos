package org.example.patrones_estructurales.decorator.base;

// Concrete Component
public class BasePrecioComponent implements PrecioService {

    private final Double total;

    public BasePrecioComponent(Double total) {
        this.total = total;
    }

    @Override
    public Double obtenerTotal() {
        return total;
    }

}
