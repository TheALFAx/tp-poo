import Veterinaria.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Ave> aves = new ArrayList<>();
        ArrayList <Perros> perros = new ArrayList<>();
        ArrayList <Gatos> gatos = new ArrayList<>();

        Animal.agregarAnimal(aves, perros, gatos);
        Animal.mostrarAnimal(aves, perros, gatos);

        System.out.println("Espero que disfrute la compañía de los animalitos!");
        System.out.println("- Veterinaria los Pibes. -");
    }

}