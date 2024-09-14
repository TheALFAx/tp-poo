import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


abstract class Animal {
    private String nombre;
    private String edad;
    private String sexo;
    private String raza;


    public Animal(String nombre, String edad, String sexo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getRaza() {
        return this.raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    //declaracion de metodos
    //Los declaro static para poder anunciarlo en main sin tener que instanciar el mismo.
    public static void agregarAnimal(ArrayList<Ave> aves, ArrayList<Perros> perros, ArrayList<Gatos> gatos) {
        Scanner scanner = new Scanner(System.in);
        boolean seguirAgregando = true;
        // uso un while para poder agregar varios animales
        while (seguirAgregando) {
            System.out.println("Desea agregar un nuevo animal? ");
            System.out.println("Si (1), No (2): ");
            int agregar = scanner.nextInt();
            scanner.nextLine();

            if (agregar == 1) {
                System.out.println("Que tipo de animal desea ingresar?: ");
                System.out.println("Perro (1), Gato (2), Ave (3): ");

                int tipoAnimal = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese los datos del animal: ");

                System.out.println("Nombre: ");
                String nombre = scanner.nextLine();

                System.out.println("Edad (en meses): ");
                String edad = scanner.nextLine();

                System.out.println("Sexo: ");
                String sexo = scanner.nextLine();

                System.out.println("Raza: ");
                String raza = scanner.nextLine();

                switch (tipoAnimal) {
                    case 1:
                        Perros perro = new Perros(nombre, edad, sexo, raza);
                        perros.add(perro);
                        System.out.println(nombre + " fue agregado exitosamente!");
                        break;

                    case 2:
                        Gatos gato = new Gatos(nombre, edad, sexo, raza);
                        gatos.add(gato);
                        System.out.println(nombre + " fue agregado exitosamente!");
                        break;

                    case 3:
                        Ave ave = new Ave(nombre, edad, sexo, raza);
                        aves.add(ave);
                        System.out.println(nombre + " fue agregado exitosamente!");

                    default:
                        System.out.println("Tipo de animal no valido.");

                }
            } else if (agregar == 2) {
                System.out.println("De acuerdo.");
                seguirAgregando = false; //salgo del bucle

            } else {
                System.out.println("Opcion incorrecta, intente nuevamente.");

            }
        }

    }

    //iterador para recorrer el arrayList, mostrandome en pantalla cada uno de los datos ingresados.
    public static void mostrarAnimal(ArrayList<Ave> aves, ArrayList<Perros> perros, ArrayList<Gatos> gatos){
        System.out.println("Perros ingresados: ");
        //defino el tipo de datos que va a tratar el iterador, en este caso, <Perros>.
        //perros es un objeto del array de ArrayList<Perros>
        Iterator<Perros> iteradorPerros = perros.iterator();
        //el .hasNext() verifica si hay elementos en la lista que no hayan sido recorridos.
        while (iteradorPerros.hasNext()){
            //el .next() devuelve el siguiente elemento de la lista, asignandolo a la variable perro en Perros.
            Perros perro = iteradorPerros.next();
            System.out.println("Nombre: " + perro.getNombre() + ", Edad: " + perro.getEdad() + " (meses), Sexo:" +
                    perro.getSexo() + ", Raza: " + perro.getRaza() + ".");
        }
        System.out.println("Gatos ingresados: ");
        Iterator<Gatos> iteradorGatos = gatos.iterator();
        while (iteradorGatos.hasNext()){
            Gatos gato = iteradorGatos.next();
            System.out.println("Nombre: " + gato.getNombre() + ", Edad: " + gato.getEdad() + " (meses), Sexo:" +
                    gato.getSexo() + ", Raza: " + gato.getRaza() + ".");
        }
        System.out.println("Aves ingresadas: ");
        Iterator<Ave> iteradorAves = aves.iterator();
        while (iteradorAves.hasNext()){
            Ave ave = iteradorAves.next();
            System.out.println("Nombre: " + ave.getNombre() + ", Edad: " + ave.getEdad() + " (meses), Sexo:" +
                    ave.getSexo() + ", Raza: " + ave.getRaza() + ".");
        }

    }
}
