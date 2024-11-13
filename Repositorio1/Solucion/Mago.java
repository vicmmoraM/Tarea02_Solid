public class Mago extends Personaje implements ClasePersonaje, AtaqueMago {
    public Mago(String nombre, char sexo) {
        super(nombre, sexo);
        configurarAtributos();
    }

    @Override
    public void configurarAtributos() {
        this.vidaMaxima = 700;
        this.estaminaMaxima = 500;
        this.ataqueFisico = 50;
        this.afinidadMagica = 300;
    }

    @Override
    public String getNombreClase() {
        return "Mago";
    }

    @Override
    public void atacar() {
        atacarMagia();
    }

    @Override
    public void atacarMagia() {
        System.out.println(nombre + " lanza un hechizo mágico.");
    }
}
