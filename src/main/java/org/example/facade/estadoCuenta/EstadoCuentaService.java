package org.example.facade.estadoCuenta;

import org.example.facade.models.EstadoCuentaDTO;

public interface EstadoCuentaService {
    EstadoCuentaDTO buscarEstadoCuentaPorLoteId(Long loteId);
    EstadoCuentaDTO buscarEstadoCuentaPorReferencia(String referencia);
}
