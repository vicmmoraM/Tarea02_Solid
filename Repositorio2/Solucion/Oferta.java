package Repositorio2.Solucion;

public class Oferta {
    private int precio;

    public int getPrecio() {
        return precio;
    }

    private ValidadorOferta validador = new ValidadorBasicoOferta();

    public boolean validarOferta() {
        return validador.esOfertaValida(this);
    }

}
