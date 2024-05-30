package org.example.patrones_estructurales.facade.corte;

public class CorteFacade {

    private final CorteService corteService;

    public CorteFacade(CorteService corteService) {
        this.corteService = corteService;
    }

    public void corteExistente(String token) {
        if (corteService.existeCorte(token)) {
            System.out.println("Existe corte abierto");
            return;
        }

        throw new RuntimeException("NO_CONTIENE_CORTE_ABIERTO");
    }

}
