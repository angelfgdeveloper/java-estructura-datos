package org.example.patrones_estructurales.bridge.metodoPago;

import org.example.patrones_estructurales.bridge.proveedorPagos.PagoProveedorService;

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
