package org.example.patrones_estructurales.adapter.service.impl;

import org.example.patrones_estructurales.adapter.libraryXML.XMLProcessor;
import org.example.patrones_estructurales.adapter.models.PersonDTO;
import org.example.patrones_estructurales.adapter.service.ProcesadorDatosService;

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
