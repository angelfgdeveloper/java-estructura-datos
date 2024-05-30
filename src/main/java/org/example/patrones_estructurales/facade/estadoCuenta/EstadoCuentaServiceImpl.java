package org.example.patrones_estructurales.facade.estadoCuenta;

import org.example.patrones_estructurales.facade.models.EstadoCuentaDTO;

import java.util.UUID;

public class EstadoCuentaServiceImpl implements EstadoCuentaService {

    public EstadoCuentaServiceImpl() {
    }

    @Override
    public EstadoCuentaDTO buscarEstadoCuentaPorLoteId(Long loteId) {
        System.out.println("Busqueda por loteId...");
        return new EstadoCuentaDTO(UUID.randomUUID().toString(), 1087.20, UUID.randomUUID().toString(), loteId);
    }

    @Override
    public EstadoCuentaDTO buscarEstadoCuentaPorReferencia(String referencia) {
        System.out.println("Busqueda por referencia...");
        return new EstadoCuentaDTO(UUID.randomUUID().toString(), 1087.20, referencia, 123456L);
    }

}
