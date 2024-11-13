public class Asesino extends Personaje{
    public Asesino(String nombre, char sexo) {
        super(nombre, sexo);
        configurarAtributos();
    }

    private void configurarAtributos() {
        this.vidaMaxima = 400;
        this.estaminaMaxima = 1000;
        this.ataqueFisico = 200;
        this.afinidadMagica = 150;
    }
}
