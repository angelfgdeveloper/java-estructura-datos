package org.example.bridge.metodoPago;

import org.example.bridge.proveedorPagos.PagoProveedorService;

public class PagoOnlineServiceImpl extends PagoMetodoService {

    public PagoOnlineServiceImpl(PagoProveedorService pagoProveedorService) {
        super(pagoProveedorService);
    }

    @Override
    public void pagar(Double total) {
        System.out.println("Pago online abstract con $" + total);

        boolean generoPago = pagoProveedorService.generarPago(total);
        System.out.println("Pago online " + (generoPago ? "generado correctamente" : "fallido"));
    }

}
