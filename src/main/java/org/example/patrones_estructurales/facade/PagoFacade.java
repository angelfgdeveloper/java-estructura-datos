package org.example.patrones_estructurales.facade;

import org.example.patrones_estructurales.facade.categorias.FactoryCategory;
import org.example.patrones_estructurales.facade.categorias.acta.ActaService;
import org.example.patrones_estructurales.facade.categorias.acta.ActaServiceImpl;
import org.example.patrones_estructurales.facade.categorias.vehiculo.VehiculoService;
import org.example.patrones_estructurales.facade.categorias.vehiculo.VehiculoServiceImpl;
import org.example.patrones_estructurales.facade.corte.CorteFacade;
import org.example.patrones_estructurales.facade.estadoCuenta.EstadoCuentaFacade;
import org.example.patrones_estructurales.facade.models.EstadoCuentaDTO;
import org.example.patrones_estructurales.facade.models.PagoDTO;
import org.example.patrones_estructurales.facade.models.TransaccionDTO;
import org.example.patrones_estructurales.facade.pago.PagoService;
import org.example.patrones_estructurales.facade.pago.PagoServiceImpl;
import org.example.patrones_estructurales.facade.pago.PagoTransaccionFacade;
import org.example.patrones_estructurales.facade.validators.GeneralValidators;

import java.util.List;
import java.util.stream.Collectors;

public class PagoFacade {

    private final EstadoCuentaFacade estadoCuentaFacade;
    private final CorteFacade corteFacade;

    private final FactoryCategory factoryCategory;
    private final PagoTransaccionFacade pagoTransaccionFacade;

    public PagoFacade(EstadoCuentaFacade estadoCuentaFacade, CorteFacade corteFacade) {
        this.estadoCuentaFacade = estadoCuentaFacade;
        this.corteFacade = corteFacade;

        ActaService actaService = new ActaServiceImpl();
        VehiculoService vehiculoService = new VehiculoServiceImpl();

        factoryCategory = new FactoryCategory(actaService, vehiculoService);

        PagoService pagoService = new PagoServiceImpl();
        pagoTransaccionFacade = new PagoTransaccionFacade(pagoService);
    }

    public TransaccionDTO generarPago(PagoDTO pagoDTO, String token) {
        corteFacade.corteExistente(token);

        EstadoCuentaDTO estadoCuentaDTO = estadoCuentaFacade.buscarEstadoCuentaPor(pagoDTO);
        System.out.println("Estado de cuenta: " + estadoCuentaDTO);

        GeneralValidators.validarMontoYTipoPago(pagoDTO, estadoCuentaDTO);

        TransaccionDTO transaccionDTO = pagoTransaccionFacade.pagoTransacciones(pagoDTO);

        factoryCategory.redireccionCategoria(pagoDTO.getTipoCategoria(), transaccionDTO);

        return transaccionDTO;
    }

    public List<TransaccionDTO> multiPago(List<PagoDTO> pagos, String token) {
        corteFacade.corteExistente(token);

        return pagos.stream().map(pagoDTO -> {
            EstadoCuentaDTO estadoCuentaDTO = estadoCuentaFacade.buscarEstadoCuentaPor(pagoDTO);
            System.out.println("Estado de cuenta: " + estadoCuentaDTO);

            GeneralValidators.validarMontoYTipoPago(pagoDTO, estadoCuentaDTO);

            TransaccionDTO transaccionDTO = pagoTransaccionFacade.pagoTransacciones(pagoDTO);

            factoryCategory.redireccionCategoria(pagoDTO.getTipoCategoria(), transaccionDTO);

            return transaccionDTO;
        }).collect(Collectors.toList());
    }

}

