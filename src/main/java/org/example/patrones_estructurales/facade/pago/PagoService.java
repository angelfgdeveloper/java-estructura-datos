package org.example.patrones_estructurales.facade.pago;

import org.example.patrones_estructurales.facade.models.PagoDTO;
import org.example.patrones_estructurales.facade.models.TransaccionDTO;

public interface PagoService {
    TransaccionDTO pagar(PagoDTO pagoDTO);
}
