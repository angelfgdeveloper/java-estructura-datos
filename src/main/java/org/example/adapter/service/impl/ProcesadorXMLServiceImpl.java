package org.example.adapter.service.impl;

import org.example.adapter.libraryXML.XMLProcessor;
import org.example.adapter.models.PersonDTO;
import org.example.adapter.service.ProcesadorDatosService;

import java.util.List;

public class ProcesadorXMLServiceImpl implements ProcesadorDatosService<PersonDTO> {

    public ProcesadorXMLServiceImpl() {
    }

    @Override
    public List<PersonDTO> getProcessDataList(String xmlData) {
        return XMLProcessor.parseXMLToList(xmlData);
    }

    @Override
    public PersonDTO getProcessData(String xmlData) {
        return XMLProcessor.parseXMLToDTO(xmlData);
    }

}
