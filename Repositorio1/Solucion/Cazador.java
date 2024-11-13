public class Cazador extends Personaje implements ClasePersonaje {
    public Cazador(String nombre, char sexo) {
        super(nombre, sexo);
        configurarAtributos();
    }

    @Override
    public void configurarAtributos() {
        this.vidaMaxima = 600;
        this.estaminaMaxima = 1000;
        this.ataqueFisico = 100;
        this.afinidadMagica = 100;
    }

    @Override
    public String getNombreClase() {
        return "Cazador";
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un ataque con su arco.");
    }
} 
    

