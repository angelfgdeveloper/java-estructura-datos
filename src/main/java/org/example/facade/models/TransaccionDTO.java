package org.example.facade.models;

import java.time.LocalDateTime;

public class TransaccionDTO {
    private final String id;
    private final LocalDateTime fechaPago;
    private final Double importe;
    private final String banco;

    public TransaccionDTO(String id, LocalDateTime fechaPago, Double importe, String banco) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.importe = importe;
        this.banco = banco;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public Double getImporte() {
        return importe;
    }

    public String getBanco() {
        return banco;
    }

    @Override
    public String toString() {
        return "TransaccionDTO{" +
                "id='" + id + '\'' +
                ", fechaPago=" + fechaPago +
                ", importe=" + importe +
                ", banco='" + banco + '\'' +
                '}';
    }

}
