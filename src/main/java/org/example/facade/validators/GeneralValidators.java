package org.example.facade.validators;

import org.example.facade.models.EstadoCuentaDTO;
import org.example.facade.models.PagoDTO;

import static org.example.facade.validators.FormaPagoValidar.tipoPago;
import static org.example.facade.validators.MontoValidar.montosValidosParaPago;

public class GeneralValidators {

    public static void validarMontoYTipoPago(PagoDTO pagoDTO, EstadoCuentaDTO estadoCuenta) {
        montosValidosParaPago(pagoDTO.getImporte(), estadoCuenta.getImporte());
        tipoPago(pagoDTO.getTipoPago().name());
    }

}
