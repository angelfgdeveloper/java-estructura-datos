package org.example.facade.pago;

import org.example.facade.models.PagoDTO;
import org.example.facade.models.TransaccionDTO;

public class PagoTransaccionFacade {

    private final PagoService pagoService;

    public PagoTransaccionFacade(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    public TransaccionDTO pagoTransacciones(PagoDTO pagoDTO) {
        return pagoService.pagar(pagoDTO);
    }

}
