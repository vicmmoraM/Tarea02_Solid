package Repositorio2.Solucion;

public class VendedorUsuario extends Usuario {
    public VendedorUsuario(String nombre, String correo) {
        super(nombre, correo);
    }

    public void publicarVehiculo(Vehiculo vehiculo) {
        System.out.println("Publicando vehículo: " + vehiculo);
    }
}
