package org.example.patrones_estructurales.facade.categorias;

import org.example.patrones_estructurales.facade.categorias.acta.ActaService;
import org.example.patrones_estructurales.facade.categorias.vehiculo.VehiculoService;
import org.example.patrones_estructurales.facade.enums.TipoCategoria;
import org.example.patrones_estructurales.facade.models.TransaccionDTO;

public class FactoryCategory {

    private final ActaService actaService;
    private final VehiculoService vehiculoService;

    public FactoryCategory(ActaService actaService, VehiculoService vehiculoService) {
        this.actaService = actaService;
        this.vehiculoService = vehiculoService;
    }

    public void redireccionCategoria(TipoCategoria tipoCategoria, TransaccionDTO transaccionDTO) {

        switch (tipoCategoria) {
            case ACTA:
                actaService.afectacionesActa();
                actaService.save(transaccionDTO.getId());
                break;
            case VEHICULO:
                vehiculoService.afectacionesVehiculo();
                break;
            default:
                System.out.println("No existe ese tipo de categoria");
        }

    }

}
