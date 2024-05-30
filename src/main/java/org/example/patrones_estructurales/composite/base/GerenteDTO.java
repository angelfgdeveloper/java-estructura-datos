package org.example.patrones_estructurales.composite.base;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GerenteDTO implements EmpleadoService {
    private final String uuid;
    private final String nombre;
    private final String puesto;
    private final List<EmpleadoService> empleados = new ArrayList<>();

    public GerenteDTO(String nombre, String puesto) {
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

    public List<EmpleadoService> getEmpleados() {
        return empleados;
    }

    public void addEmployee(EmpleadoService desarrollador) {
        empleados.add(desarrollador);
    }

    public void removeEmployee(EmpleadoService desarrollador) {
        empleados.remove(desarrollador);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("UUID: " + uuid + ", Nombre: " + nombre + ", Ocupación: " + puesto);
        empleados.forEach(EmpleadoService::mostrarDetalles);
    }

    @Override
    public String toString() {
        return "GerenteDTO{" +
                "uuid='" + uuid + '\'' +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
