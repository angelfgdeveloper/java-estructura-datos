package org.example.facade.pago;

import org.example.facade.models.PagoDTO;
import org.example.facade.models.TransaccionDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public class PagoServiceImpl implements PagoService {

    public PagoServiceImpl() {
    }

    @Override
    public TransaccionDTO pagar(PagoDTO pagoDTO) {
        System.out.println("Pagando y afectacion de tablas");
        return new TransaccionDTO(UUID.randomUUID().toString(), LocalDateTime.now(), pagoDTO.getImporte(), pagoDTO.getBanco());
    }

}
