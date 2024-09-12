import java.util.Scanner;
import java.util.ArrayList;

private ''

abstract class Animal {
    private String nombre;
    private String raza;
    private String edad;
    private String sexo;
    private Boolean enojo;

    public Animal(String nombre, String raza, String edad, String sexo, Boolean enojo) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.enojo = enojo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getEnojo() {
        return this.enojo;
    }

    public void setEnojo(Boolean enojo) {
        this.enojo = enojo;
    }

    public void hacerSonido() {
        System.out.println(this.getNombre() + " texto ");
    }

    public void estaEnojado() {
        if (this.enojo) {
            System.out.println(this.getNombre() + " está enojado.");
        } else {
            System.out.println(this.getNombre() + " no está enojado.");
        }

    }


    public static void cargarAnimal(){
        Scanner sc = new Scanner(System.in);
       ArrayList<Gatos> listagatos = new ArrayList<>();
       ArrayList<Perros> listaperros = new ArrayList<>();
        ArrayList<Ave> listaaves = new ArrayList<>();

        String eleccion;
        System.out.println("Deseas agregar un animal?");
        eleccion = sc.nextLine();
        while (eleccion.toLowerCase().equals("si")){
            System.out.println("Ingresa los datos del animal");
            System.out.println("**Nombre del animal**");
            String nombre = sc.nextLine();
            System.out.println("**Raza del animal:**");
            String raza = sc.nextLine();
            System.out.println("**Edad del animal**:");
            String edad = sc.nextLine();
            System.out.println("**Género del animal**:");
            String genero = sc.nextLine();
            System.out.println("**¿Está enojado?** (true/false):");
            boolean enojo = sc.nextBoolean();

            System.out.println("Que tipo de animal es?");
            System.out.println("Selecciona:\n" +
                    "1: Gato \n" +
                    "2: Perro \n" +
                    "3: Aves \n" );
            int eleccion_animal = sc.nextInt();

            switch (eleccion_animal){

                case 1:
                    Gatos gatito = new Gatos(nombre, raza, edad, genero, enojo);
                    listagatos.add(gatito);
                    System.out.println("Gato agregado exitosamente.");
                    System.out.println("Cantidad de Gatos en el Array: " + listagatos.size());
                    break;

                case 2:
                    Perros perrito = new Perros(nombre, raza, edad, genero, enojo);
                    listaperros.add(perrito);
                    System.out.println("Perro agregado exitosamente.");
                    System.out.println("Cantidad de Perros en el Array: " + listaperros.size());
                    break;
                case 3:
                    Ave avecita = new Ave(nombre, raza, edad, genero, enojo);
                    listaaves.add(avecita);
                    System.out.println("Ave agregado exitosamente.");
                    System.out.println("Cantidad de Aves en el Array: " + listaaves.size());
                    break;

            }
            break;
        }
    }
}
