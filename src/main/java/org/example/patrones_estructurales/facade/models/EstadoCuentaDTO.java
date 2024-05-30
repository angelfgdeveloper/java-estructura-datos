package org.example.patrones_estructurales.facade.models;

public class EstadoCuentaDTO {
    private final String id;
    private final Double importe;
    private final String referencia;
    private final Long loteId;

    public EstadoCuentaDTO(String id, Double importe, String referencia, Long loteId) {
        this.id = id;
        this.importe = importe;
        this.referencia = referencia;
        this.loteId = loteId;
    }

    public String getId() {
        return id;
    }

    public Double getImporte() {
        return importe;
    }

    public String getReferencia() {
        return referencia;
    }

    public Long getLoteId() {
        return loteId;
    }

    @Override
    public String toString() {
        return "EstadoCuentaDTO{" +
                "id=" + id +
                ", importe=" + importe +
                ", referencia='" + referencia + '\'' +
                ", loteId=" + loteId +
                '}';
    }

}
