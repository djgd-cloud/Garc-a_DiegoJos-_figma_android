package es.medac.diegogarcia.garcia_diegojose_figma_android;


public class Producto {

    private final String nombre;
    private final String precio;
    private final int imagen;

    public Producto(String nombre, String precio, int imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public int getImagen() {
        return imagen;
    }
}
