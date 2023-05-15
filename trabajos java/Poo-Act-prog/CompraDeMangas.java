import java.util.ArrayList;
import java.util.Scanner;

public class CompraDeMangas {
    private String nombreUsuario, apellidoUsuario, direccionUsuario, telefonoUsuario;
    private ArrayList<Manga> mangasSeleccionados;
    private double precioTotal;
    private double promedio;

    public CompraDeMangas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido/a");
        System.out.println("Por favor, ingrese su nombre:");
        nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese su apellido:");
        apellidoUsuario = scanner.nextLine();
        System.out.println("Ingrese su direccion:");
        direccionUsuario = scanner.nextLine();
        System.out.println("Ingrese su telefono:");
        telefonoUsuario = scanner.nextLine();
        mangasSeleccionados = new ArrayList<>();
    }

    public void seleccionarMangas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, " + nombreUsuario + ", ¿Qué tipo de manga desea escoger?");
        System.out.println("1. Kimetsu No Yaiba - Precio: $60.000");
        System.out.println("2. Tokyo Revengers - Precio: $65.000");
        System.out.println("3. Jujutsu Kaisen - Precio: $70.000");

        int opcion;
        do {
            System.out.println("Ingrese el número de opción que desea (Si no desea comprar más mangas, ingrese 0):");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mangasSeleccionados.add(new Manga("Kimetsu No Yaiba", 60000));
                    System.out.println("Agregado al carrito.");
                    System.out.println();
                    break;
                case 2:
                    mangasSeleccionados.add(new Manga("Tokyo Revengers", 65000));
                    System.out.println("Agregado al carrito.");
                    System.out.println();
                    break;
                case 3:
                    mangasSeleccionados.add(new Manga("Jujutsu Kaisen", 70000));
                    System.out.println("Agregado al carrito.");
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    public void mostrarMangasSeleccionadas() {
        System.out.println("Estos son los tipos de mangas que elegiste:");

        if (mangasSeleccionados.isEmpty()) {
            System.out.println("No seleccionaste ningún tipo de manga.");
        } else {
            for (Manga manga : mangasSeleccionados) {
                System.out.println(manga.getNombre() + " - Precio: $" + manga.getPrecio());
                precioTotal += manga.getPrecio();
            }
            System.out.println("Precio Total: $" + precioTotal);
        }
    }

    public void calcularPromedio() {
        promedio = precioTotal / mangasSeleccionados.size();
        System.out.println("Promedio de compra: $" + promedio);
    }

    public static void main(String[] args) {
        CompraDeMangas compraDeMangas = new CompraDeMangas();
        compraDeMangas.seleccionarMangas();
        compraDeMangas.mostrarMangasSeleccionadas();
        compraDeMangas.calcularPromedio();
    }
}