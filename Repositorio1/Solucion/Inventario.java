import java.util.ArrayList;

public class Inventario {
    private int capacidad;
    private ArrayList<Item> contenido;

    public Inventario(int capacidad) {
        this.capacidad = capacidad;
        this.contenido = new ArrayList<>(capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<Item> getContenido() {
        return contenido;
    }

    public void agregarItem(Item item) {
        if (contenido.size() < capacidad) {
            contenido.add(item);
        }
    }

    public void imprimirInventario() {
        System.out.println("Inventario:");
        for (Item item : contenido) {
            System.out.println(" - " + item.getNombre());
        }
    }
}

