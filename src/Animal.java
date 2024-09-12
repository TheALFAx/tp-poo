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

    ArrayList<Ave> aves = new ArrayList<>();
    ArrayList<Perros> perro = new ArrayList<>();
    ArrayList<Gatos> gato = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    boolean agregarAnimal(String tipo) {
        System.out.println("Desea agregar un nuevo animal? ");
        System.out.println("Si (1), No (2)");
        int agregar = scanner.nextInt();
        scanner.nextLine();

        if (agregar == 1) {
            System.out.println("Que tipo de animal desea ingresar?");
            System.out.println("Perro (1), Gato(2), Ave(3): ");

            int tipoAnimal = scanner.nextInt();
            scanner.nextLine();

            if (tipoAnimal == 1) {
            System.out.println("Ingrese los");

            }
        }
    }
}
