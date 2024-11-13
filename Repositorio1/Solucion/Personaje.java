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

    // Métodos para actualizar los atributos
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public void setEstaminaMaxima(int estaminaMaxima) {
        this.estaminaMaxima = estaminaMaxima;
    }

    public void setAtaqueFisico(int ataqueFisico) {
        this.ataqueFisico = ataqueFisico;
    }

    public void setAfinidadMagica(int afinidadMagica) {
        this.afinidadMagica = afinidadMagica;
    }

    // Métodos para obtener los atributos
    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public int getEstaminaMaxima() {
        return estaminaMaxima;
    }

    public int getEstaminaActual() {
        return estaminaActual;
    }

    public int getAtaqueFisico() {
        return ataqueFisico;
    }

    public int getAfinidadMagica() {
        return afinidadMagica;
    }

    public void setItemPrimario(Item itemPrimario) {
        this.itemPrimario = itemPrimario;
    }

    public void setItemSecundario(Item itemSecundario) {
        this.itemSecundario = itemSecundario;
    }

    public void imprimirInformacionDePersonaje() {
        System.out.printf("Nombre: %s\nVida Máxima: %d\nEstamina Máxima: %d\nAtaque Físico: %d\nAfinidad Mágica: %d\n",
                nombre, vidaMaxima, estaminaMaxima, ataqueFisico, afinidadMagica);
        Item.imprimirInformacionDeItems(itemPrimario, itemSecundario);
        inventario.imprimirInventario();
    }
}
