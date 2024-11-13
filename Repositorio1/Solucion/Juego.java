public class Juego {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Carlos", 'M');
        Mago mago = new Mago("Jesus", 'M');
        Cazador cazador = new Cazador("Ana", 'F');
        Asesino asesino = new Asesino("Luna", 'F');

        guerrero.imprimirInformacionDePersonaje();
        mago.imprimirInformacionDePersonaje();
        cazador.imprimirInformacionDePersonaje();
        asesino.imprimirInformacionDePersonaje();
    }
}

