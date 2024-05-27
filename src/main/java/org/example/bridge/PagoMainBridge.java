package org.example.bridge;

import org.example.bridge.metodoPago.PagoMetodoService;
import org.example.bridge.metodoPago.PagoOnlineServiceImpl;
import org.example.bridge.metodoPago.PagoTerminalServiceImpl;
import org.example.bridge.proveedorPagos.PagoGboProveedorServiceImpl;
import org.example.bridge.proveedorPagos.PaypalProveedorServiceImpl;

public class PagoMainBridge {

    public static void main(String[] args) {
        // Pago en

        System.out.println("PAGO EN PAYPAL ONLINE");
        PagoMetodoService pagoGeneradoPaypal = new PagoOnlineServiceImpl(new PaypalProveedorServiceImpl());
        pagoGeneradoPaypal.pagar(159.89);

        System.out.println();

        System.out.println("PAGO EN TERMINAL");
        PagoMetodoService pagoGeneradoTerminal = new PagoTerminalServiceImpl(new PagoGboProveedorServiceImpl());
        pagoGeneradoTerminal.pagar(489.15);

    }

}
