import java.util.Scanner;
public class Perros extends Animal {
    Boolean enojo = true;

    public Perros(String nombre, String raza, String edad, String sexo, Boolean enojo) {
        super(nombre, raza, edad, sexo, enojo);
    }

    public void estaEnojado() {
        if (this.enojo) {
            System.out.println(this.getNombre() + " está enojado/a, los gatos no le agradan. * Woof!! *");
        } else {
            System.out.println(this.getNombre() + " no está enojado/a, los gatos le agradan!");
        }

    }

    public void hacerSonido() {
        System.out.println(this.getNombre() + " está ladrando.");
    }
}
