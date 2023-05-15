import java.util.Scanner;
class Manga {
    private String nombre;
    private double precio;

    public Manga(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}