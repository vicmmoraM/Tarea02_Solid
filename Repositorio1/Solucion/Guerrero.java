public class Guerrero extends Personaje implements ClasePersonaje {
    public Guerrero(String nombre, char sexo) {
        super(nombre, sexo);
        configurarAtributos();
    }

    @Override
    public void configurarAtributos() {
        this.vidaMaxima = 800;
        this.estaminaMaxima = 300;
        this.ataqueFisico = 200;
        this.afinidadMagica = 0;
    }

    @Override
    public String getNombreClase() {
        return "Guerrero";
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza un ataque físico poderoso.");
    }
}
