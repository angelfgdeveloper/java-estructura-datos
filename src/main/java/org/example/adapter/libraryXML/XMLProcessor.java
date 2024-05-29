package org.example.adapter.libraryXML;

import org.example.adapter.models.PersonDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLProcessor {

    private static boolean validateXML(String xml) {
        // Patrón para encontrar etiquetas de apertura y cierre
        Pattern pattern = Pattern.compile("<([\\w-]+)>(.*?)</\\1>");
        Matcher matcher = pattern.matcher(xml);

        // Contador para asegurar que todas las etiquetas de apertura tengan su correspondiente cierre
        int count = 0;

        while (matcher.find()) {
            count++;
        }

        return count % 2 == 0; // Si el contador es par, el XML es válido
    }

    public static List<PersonDTO> parseXMLToList(String xml) {
        List<PersonDTO> personas = new ArrayList<>();
        // Patrón para extraer el contenido entre etiquetas
        Pattern pattern = Pattern.compile("<person>(.*?)</person>");
        Matcher matcher = pattern.matcher(xml);

        while (matcher.find()) {
            String personData = matcher.group(1);
            String name = extractTagValue(personData, "name");
            int age = Integer.parseInt(Objects.requireNonNull(extractTagValue(personData, "age")));
            personas.add(new PersonDTO(name, age));
        }
        return personas;
    }

    public static PersonDTO parseXMLToDTO(String xml) {
        PersonDTO personDTO = new PersonDTO();
        // Patrón para extraer el contenido entre etiquetas
        Pattern pattern = Pattern.compile("<person>(.*?)</person>");
        Matcher matcher = pattern.matcher(xml);

        while (matcher.find()) {
            String personData = matcher.group(1);
            String name = extractTagValue(personData, "name");
            int age = Integer.parseInt(Objects.requireNonNull(extractTagValue(personData, "age")));

            personDTO = new PersonDTO(name, age);
        }

        return personDTO;
    }

    private static String extractTagValue(String xml, String tagName) {
        Pattern pattern = Pattern.compile("<" + tagName + ">(.*?)</" + tagName + ">");
        Matcher matcher = pattern.matcher(xml);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

}
