package org.example.facade.pago;

import org.example.facade.models.PagoDTO;
import org.example.facade.models.TransaccionDTO;

public interface PagoService {
    TransaccionDTO pagar(PagoDTO pagoDTO);
}
