package org.example.patrones_estructurales.facade.corte;

import java.util.UUID;

public class CorteServiceImpl implements CorteService {

    public CorteServiceImpl() {
    }

    @Override
    public boolean existeCorte(String token) {
        System.out.println("Buscando usuario del token...");
        System.out.println("Usuario con id: " + UUID.randomUUID());
        return true;
    }

}
