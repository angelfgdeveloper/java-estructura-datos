package org.example.patrones_estructurales.facade.estadoCuenta;

import org.example.patrones_estructurales.facade.models.EstadoCuentaDTO;
import org.example.patrones_estructurales.facade.models.PagoDTO;

public class EstadoCuentaFacade {

    private final EstadoCuentaService estadoCuentaService;

    public EstadoCuentaFacade(EstadoCuentaService estadoCuentaService) {
        this.estadoCuentaService = estadoCuentaService;
    }

    public EstadoCuentaDTO buscarEstadoCuentaPor(PagoDTO pagoDTO) {

        if (pagoDTO.getReferencia() != null) {
            if (!pagoDTO.getReferencia().isEmpty()) {
                return estadoCuentaService.buscarEstadoCuentaPorReferencia(pagoDTO.getReferencia());
            }
        }

        if (pagoDTO.getLoteId() != null) {
            return estadoCuentaService.buscarEstadoCuentaPorLoteId(pagoDTO.getLoteId());
        }

        throw new RuntimeException("No existe estado de cuenta");
    }


}
