public class Gatos extends Animal {
    Boolean enojo = true;

    public Gatos(String nombre, String raza, String edad, String sexo, Boolean enojo) {
        super(nombre, raza, edad, sexo, enojo);
    }

    public void estaEnojado() {
        if (this.enojo) {
            System.out.println(this.getNombre() + " está enojado/a, los perros le dan miedo e ira. * Grr *");
        } else {
            System.out.println(this.getNombre() + " no está enojado/a, los perros le agradan!");
        }

    }

    public void hacerSonido() {
        System.out.println(this.getNombre() + " está maullando.");
    }
}
