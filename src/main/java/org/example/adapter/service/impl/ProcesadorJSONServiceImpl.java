package org.example.adapter.service.impl;

import org.example.adapter.models.PersonDTO;
import org.example.adapter.service.ProcesadorDatosService;

import java.util.Collections;
import java.util.List;

public class ProcesadorJSONServiceImpl implements ProcesadorDatosService<PersonDTO> {

    @Override
    public List<PersonDTO> getProcessDataList(String data) {
        return Collections.emptyList();
    }

    @Override
    public PersonDTO getProcessData(String data) {
        return null;
    }

}
