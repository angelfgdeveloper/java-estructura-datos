package org.example.patrones_estructurales.bridge.proveedorPagos;

public class PagoGboProveedorServiceImpl implements PagoProveedorService {

    public PagoGboProveedorServiceImpl() {
    }

    @Override
    public boolean generarPago(Double total) {
        System.out.println("Generando pago Gbo de $" + total);

        if (total < 0.0) {
            System.out.println("Fallo el proceso del pago... ;(");
            return false;
        }

        System.out.println("Pago exitoso... :D");
        return true;
    }

}
