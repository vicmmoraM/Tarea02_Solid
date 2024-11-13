import java.util.ArrayList;

public abstract class Personaje {
    protected String nombre;
    protected char sexo;
    protected int vidaMaxima;
    protected int vidaActual;
    protected int estaminaMaxima;
    protected int estaminaActual;
    protected int ataqueFisico;
    protected int afinidadMagica;
    protected Inventario inventario;
    protected int nivel;
    protected int EXP;
    protected ArrayList<Item> vestuario;
    protected Item itemPrimario;
    protected Item itemSecundario;

    public Personaje(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.inventario = new Inventario(10);
        this.vidaActual = this.vidaMaxima;
        this.estaminaActual = this.estaminaMaxima;
        this.vestuario = new ArrayList<>(5);
    }

    // Método de ataque abstracto que cada subclase implementará
    public abstract void atacar();

    public void setItemPrimario(Item itemPrimario) {
        this.itemPrimario = itemPrimario;
    }

    public void setItemSecundario(Item itemSecundario) {
        this.itemSecundario = itemSecundario;
    }

    public void imprimirInformacionDePersonaje() {
        System.out.printf("Nombre: %s\nSexo: %s\nVida: %d/%d\nEstamina: %d/%d\nAtaque Fisico: %d\nAfinidad Magica: %d\n",
                nombre, sexo, vidaActual, vidaMaxima, estaminaActual, estaminaMaxima, ataqueFisico, afinidadMagica);
        Item.imprimirInformacionDeItems(itemPrimario, itemSecundario);
        inventario.imprimirInventario();
    }
}
