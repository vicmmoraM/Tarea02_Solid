package Repositorio2.Solucion;

public class ConversorDatos {
    public static int convertirStringAInt(String numero) {
        try {
            return Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a entero: " + e.getMessage());
            return 0;
        }
    }
}
