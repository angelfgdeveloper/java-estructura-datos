package org.example.bridge.proveedorPagos;

public class PaypalProveedorServiceImpl implements PagoProveedorService {

    public PaypalProveedorServiceImpl() {
    }

    @Override
    public boolean generarPago(Double total) {
        System.out.println("Generando pago Paypal de $" + total);

        if (total < 0.0) {
            System.out.println("Fallo el proceso del pago... ;(");
            return false;
        }

        System.out.println("Pago exitoso... :D");
        return true;
    }

}
