public abstract class Item {
    private String nombre;
    private String descripcion;
    private int costo;

    public Item(String nombre, String descripcion, int costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public static void imprimirInformacionDeItems(Item itemPrimario, Item itemSecundario) {
        String itemP = (itemPrimario != null) ? itemPrimario.getNombre() : "No hay un item primario";
        String itemS = (itemSecundario != null) ? itemSecundario.getNombre() : "No hay un item secundario";
        
        System.out.printf("Item Primario: %s%nItem Secundario: %s%n", itemP, itemS);
    }
}
