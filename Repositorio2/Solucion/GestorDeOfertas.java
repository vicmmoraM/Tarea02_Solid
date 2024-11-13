package Repositorio2.Solucion;

import java.util.List;

public class GestorDeOfertas {
    public void mostrarOfertas(List<Oferta> ofertas) {
        for (Oferta oferta : ofertas) {
            System.out.println(oferta.toString());
        }
    }

    public void agregarOferta(Oferta nuevaOferta, List<Oferta> ofertas) {
        ofertas.add(nuevaOferta);
        System.out.println("Oferta agregada correctamente.");
    }
}
