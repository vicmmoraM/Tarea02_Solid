package Repositorio2.Solucion;

public class ValidadorBasicoOferta implements ValidadorOferta {
    @Override
    public boolean esOfertaValida(Oferta oferta) {
        return oferta.getPrecio() > 0;
    }
}
