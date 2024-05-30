package org.example.patrones_estructurales.facade.validators;

import org.example.patrones_estructurales.facade.models.EstadoCuentaDTO;
import org.example.patrones_estructurales.facade.models.PagoDTO;

import static org.example.patrones_estructurales.facade.validators.FormaPagoValidar.tipoPago;
import static org.example.patrones_estructurales.facade.validators.MontoValidar.montosValidosParaPago;

public class GeneralValidators {

    public static void validarMontoYTipoPago(PagoDTO pagoDTO, EstadoCuentaDTO estadoCuenta) {
        montosValidosParaPago(pagoDTO.getImporte(), estadoCuenta.getImporte());
        tipoPago(pagoDTO.getTipoPago().name());
    }

}
