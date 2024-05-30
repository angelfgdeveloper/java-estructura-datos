package org.example.patrones_estructurales.composite;

import org.example.patrones_estructurales.composite.base.DesarrolladorDTO;
import org.example.patrones_estructurales.composite.base.GerenteDTO;

public class EmpleadosMainComposite {

    // Permite componer objetos como una estructura en forma de arbol
    public static void main(String[] args) {

        GerenteDTO manager1 = new GerenteDTO("Michael Scott", "Manager");

        DesarrolladorDTO dev1 = new DesarrolladorDTO("John Doe", "Pro developer");
        DesarrolladorDTO dev2 = new DesarrolladorDTO("Jane Smith", "Entry developer");

        manager1.addEmployee(dev1);
        manager1.addEmployee(dev2);
        manager1.mostrarDetalles();

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        GerenteDTO generalManager = new GerenteDTO("Dwight Schrute", "General Manager");

        DesarrolladorDTO dev3 = new DesarrolladorDTO("Robert Brown", "Senior developer");

        generalManager.addEmployee(dev3);
        generalManager.addEmployee(manager1);

        generalManager.mostrarDetalles();
    }

    // Respuesta
    /**
     *
     * UUID: 59c151b9-8f33-4b67-ae3a-5db470325760, Nombre: Michael Scott, Ocupación: Manager
     * UUID: 8c3053f5-f9fd-4429-836f-74cb2140b36d, Nombre: John Doe, Ocupación: Pro developer
     * UUID: cc7acbfc-0db7-4cc9-afb1-876b7de59fc2, Nombre: Jane Smith, Ocupación: Entry developer
     *
     * --------------------
     *
     * UUID: 6794c31b-7bc0-4d8d-afd7-18c8067272fd, Nombre: Dwight Schrute, Ocupación: General Manager
     * UUID: 333d6107-a9a0-4334-ad9e-c9f91f21fa83, Nombre: Robert Brown, Ocupación: Senior developer
     * UUID: 59c151b9-8f33-4b67-ae3a-5db470325760, Nombre: Michael Scott, Ocupación: Manager
     * UUID: 8c3053f5-f9fd-4429-836f-74cb2140b36d, Nombre: John Doe, Ocupación: Pro developer
     * UUID: cc7acbfc-0db7-4cc9-afb1-876b7de59fc2, Nombre: Jane Smith, Ocupación: Entry developer
     *
     */

}
