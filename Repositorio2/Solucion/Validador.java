package Repositorio2.Solucion;

public class Validador {
    public static boolean esCorreoValido(String correo) {
        return correo.contains("@") && correo.contains(".");
    }
}
