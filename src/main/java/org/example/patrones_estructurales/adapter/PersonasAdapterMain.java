package org.example.patrones_estructurales.adapter;

import org.example.patrones_estructurales.adapter.service.impl.ProcesadorXMLServiceImpl;

public class PersonasAdapterMain {

    public static void main(String[] args) {
        String personasXML = getDataPeopleXML();
        String personaXML = getDataPersonXML();

        ProcesadorXMLServiceImpl procesadorXMLService = new ProcesadorXMLServiceImpl();
        procesadorXMLService.getProcessDataList(personasXML).forEach(System.out::println);

        System.out.println("------------------------------");
        System.out.println("Persona: " + procesadorXMLService.getProcessData(personaXML));
    }

    private static String getDataPeopleXML() {
        return "<people>" +
                    "<person>" +
                        "<name>John Doe</name>" +
                        "<age>30</age>" +
                    "</person>" +
                    "<person>" +
                        "<name>Jane Smith</name>" +
                        "<age>25</age>" +
                    "</person>" +
                "</people>";
    }

    private static String getDataPersonXML() {
        return"<person>" +
                    "<name>Jane Smith</name>" +
                    "<age>25</age>" +
                "</person>";
    }

}