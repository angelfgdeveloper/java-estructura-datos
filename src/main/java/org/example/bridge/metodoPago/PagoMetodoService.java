package org.example.bridge.metodoPago;

import org.example.bridge.proveedorPagos.PagoProveedorService;

// Abstraccion
public abstract class PagoMetodoService {
    protected PagoProveedorService pagoProveedorService;

    public PagoMetodoService(PagoProveedorService pagoProveedorService) {
        this.pagoProveedorService = pagoProveedorService;
    }

    public abstract void pagar(Double total);

}
