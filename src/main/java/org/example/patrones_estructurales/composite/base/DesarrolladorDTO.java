package org.example.patrones_estructurales.composite.base;

import java.util.UUID;

public class DesarrolladorDTO implements EmpleadoService {

    private final String uuid;
    private final String nombre;
    private final String puesto;

    public DesarrolladorDTO(String nombre, String puesto) {
        this.uuid = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public String getUuid() {
        return uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("UUID: " + uuid + ", Nombre: " + nombre + ", Ocupación: " + puesto);
    }

    @Override
    public String toString() {
        return "DesarrolladorDTO{" +
                "uuid='" + uuid + '\'' +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }

}
