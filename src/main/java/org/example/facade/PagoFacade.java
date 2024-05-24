package org.example.facade;

import org.example.facade.categorias.FactoryCategory;
import org.example.facade.categorias.acta.ActaService;
import org.example.facade.categorias.acta.ActaServiceImpl;
import org.example.facade.categorias.vehiculo.VehiculoService;
import org.example.facade.categorias.vehiculo.VehiculoServiceImpl;
import org.example.facade.corte.CorteFacade;
import org.example.facade.estadoCuenta.EstadoCuentaFacade;
import org.example.facade.models.EstadoCuentaDTO;
import org.example.facade.models.PagoDTO;
import org.example.facade.models.TransaccionDTO;
import org.example.facade.pago.PagoService;
import org.example.facade.pago.PagoServiceImpl;
import org.example.facade.pago.PagoTransaccionFacade;

import java.util.List;
import java.util.stream.Collectors;

import static org.example.facade.validators.GeneralValidators.validarMontoYTipoPago;

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

        validarMontoYTipoPago(pagoDTO, estadoCuentaDTO);

        TransaccionDTO transaccionDTO = pagoTransaccionFacade.pagoTransacciones(pagoDTO);

        factoryCategory.redireccionCategoria(pagoDTO.getTipoCategoria(), transaccionDTO);

        return transaccionDTO;
    }

    public List<TransaccionDTO> multiPago(List<PagoDTO> pagos, String token) {
        corteFacade.corteExistente(token);

        return pagos.stream().map(pagoDTO -> {
            EstadoCuentaDTO estadoCuentaDTO = estadoCuentaFacade.buscarEstadoCuentaPor(pagoDTO);
            System.out.println("Estado de cuenta: " + estadoCuentaDTO);

            validarMontoYTipoPago(pagoDTO, estadoCuentaDTO);

            TransaccionDTO transaccionDTO = pagoTransaccionFacade.pagoTransacciones(pagoDTO);

            factoryCategory.redireccionCategoria(pagoDTO.getTipoCategoria(), transaccionDTO);

            return transaccionDTO;
        }).collect(Collectors.toList());
    }

}

