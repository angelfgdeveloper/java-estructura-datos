package org.example.patrones_estructurales.facade.pago;

import org.example.patrones_estructurales.facade.models.PagoDTO;
import org.example.patrones_estructurales.facade.models.TransaccionDTO;

public class PagoTransaccionFacade {

    private final PagoService pagoService;

    public PagoTransaccionFacade(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    public TransaccionDTO pagoTransacciones(PagoDTO pagoDTO) {
        return pagoService.pagar(pagoDTO);
    }

}
