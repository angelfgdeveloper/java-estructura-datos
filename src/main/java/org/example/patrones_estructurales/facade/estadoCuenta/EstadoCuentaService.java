package org.example.patrones_estructurales.facade.estadoCuenta;

import org.example.patrones_estructurales.facade.models.EstadoCuentaDTO;

public interface EstadoCuentaService {
    EstadoCuentaDTO buscarEstadoCuentaPorLoteId(Long loteId);
    EstadoCuentaDTO buscarEstadoCuentaPorReferencia(String referencia);
}
