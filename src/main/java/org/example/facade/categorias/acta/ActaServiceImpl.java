package org.example.facade.categorias.acta;

public class ActaServiceImpl implements ActaService {

    public ActaServiceImpl() {
    }

    @Override
    public void afectacionesActa() {
        System.out.println("Afectacion de tablas en actas...");
    }

    @Override
    public void save(String transaccionId) {
        System.out.println("Guardado de transaccionId " + transaccionId);
    }

}
