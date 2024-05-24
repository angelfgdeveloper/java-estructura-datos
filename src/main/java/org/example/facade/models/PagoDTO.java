package org.example.facade.models;

import org.example.facade.enums.TipoCategoria;
import org.example.facade.enums.TipoPago;

public class PagoDTO {
    private final Long loteId;
    private final String referencia;
    private final String banco;
    private final Double importe;
    private final TipoPago tipoPago;
    private final TipoCategoria tipoCategoria;

    public PagoDTO(Long loteId, String referencia, String banco, Double importe, TipoPago tipoPago, TipoCategoria tipoCategoria) {
        this.loteId = loteId;
        this.referencia = referencia;
        this.banco = banco;
        this.importe = importe;
        this.tipoPago = tipoPago;
        this.tipoCategoria = tipoCategoria;
    }

    public Long getLoteId() {
        return loteId;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getBanco() {
        return banco;
    }

    public Double getImporte() {
        return importe;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public TipoCategoria getTipoCategoria() {
        return tipoCategoria;
    }

    @Override
    public String toString() {
        return "PagoDTO{" +
                "loteId=" + loteId +
                ", referencia='" + referencia + '\'' +
                ", banco='" + banco + '\'' +
                ", importe=" + importe +
                ", tipoPago=" + tipoPago +
                ", tipoCategoria='" + tipoCategoria + '\'' +
                '}';
    }

}