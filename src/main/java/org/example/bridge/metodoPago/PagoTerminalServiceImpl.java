package org.example.bridge.metodoPago;

import org.example.bridge.proveedorPagos.PagoProveedorService;

public class PagoTerminalServiceImpl extends PagoMetodoService {

    public PagoTerminalServiceImpl(PagoProveedorService pagoProveedorService) {
        super(pagoProveedorService);
    }

    @Override
    public void pagar(Double total) {
        System.out.println("Pago terminal abstract con $" + total);

        boolean generoPago = pagoProveedorService.generarPago(total);
        System.out.println("Pago terminal " + (generoPago ? "generado correctamente" : "fallido"));
    }

}
