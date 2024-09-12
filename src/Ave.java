public class Ave extends Animal {
    Boolean enojo = false;

    public Ave(String nombre, String raza, String edad, String sexo, Boolean enojo) {
        super(nombre, raza, edad, sexo, enojo);
    }

    public void hacerSonido() {
        System.out.println(this.getNombre() + " está cantando. * Pio Pio *");
    }
}
