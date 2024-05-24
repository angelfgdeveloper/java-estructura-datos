package org.example.facade;

import org.example.facade.corte.CorteFacade;
import org.example.facade.corte.CorteService;
import org.example.facade.corte.CorteServiceImpl;
import org.example.facade.enums.TipoCategoria;
import org.example.facade.enums.TipoPago;
import org.example.facade.estadoCuenta.EstadoCuentaFacade;
import org.example.facade.estadoCuenta.EstadoCuentaService;
import org.example.facade.estadoCuenta.EstadoCuentaServiceImpl;
import org.example.facade.models.PagoDTO;
import org.example.facade.models.TransaccionDTO;

import java.util.Arrays;
import java.util.List;

public class PagoMain {

    public static PagoFacade pagoFacade() {
        EstadoCuentaService estadoCuentaService = new EstadoCuentaServiceImpl();
        EstadoCuentaFacade estadoCuentaFacade = new EstadoCuentaFacade(estadoCuentaService);

        CorteService corteService = new CorteServiceImpl();
        CorteFacade corteFacade = new CorteFacade(corteService);

        return new PagoFacade(estadoCuentaFacade, corteFacade);
    }

    public static void main(String[] args) {
        PagoFacade pagoFacade = pagoFacade();

        PagoDTO pagoDTO = new PagoDTO(12312L, "5dsf456dsf456dff4dq", "BBVA", 1087.20, TipoPago.TARJETA_DEBITO, TipoCategoria.ACTA);
        TransaccionDTO transaccionDTO = pagoFacade.generarPago(pagoDTO, "ABC-123");

        System.out.println("Pago realizado: " + transaccionDTO);

        System.out.println();
        System.out.println();

        List<PagoDTO> pagos = Arrays.asList(
            new PagoDTO(32123L, "rewhgyrdkjgk8789yjn", "SANTANDER", 1087.20, TipoPago.TARJETA_DEBITO, TipoCategoria.ACTA),
            new PagoDTO(89789L, "56bn41dt89n1dg56dbhf", "BANAMEX", 1087.20, TipoPago.MONEDA_NACIONAL, TipoCategoria.VEHICULO)
        );

        pagoFacade.multiPago(pagos, "ABC-132").forEach(transaccion -> System.out.println("Pago realizado: " + transaccion));

    }

}
