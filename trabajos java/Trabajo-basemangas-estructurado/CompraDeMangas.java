import java.util.Scanner;

public class CompraDeMangas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreUsuario;
        int opcion, precioTotal;
        double promedio;

        System.out.println("Bienvenido/a");
        System.out.print("Por favor, ingrese su nombre: ");
        nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellidoUsuario = scanner.nextLine();
        System.out.print("Ingrese su direccion: ");
        String direccionUsuario = scanner.nextLine();
        System.out.print("Ingrese su telefono: ");
        String telefonoUsuario = scanner.nextLine();

        System.out.println("Hola, " + nombreUsuario + ". ¿Qué tipo de manga desea escoger?");
        System.out.println("1. Kimetsu No Yaiba - Precio: $60.000");
        System.out.println("2. Tokyo Revengers - Precio: $65.000");
        System.out.println("3. Jujutsu Kaisen - Precio: $70.000");

        precioTotal = 0;

        do {
            System.out.print("Ingrese el número de opción que desea (Si no desea comprar más mangas de la opción 0): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    precioTotal += 60000;
                    System.out.println("Agregado al carrito.\n");
                    break;
                case 2:
                    precioTotal += 65000;
                    System.out.println("Agregado al carrito.\n");
                    break;
                case 3:
                    precioTotal += 70000;
                    System.out.println("Agregado al carrito.\n");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.\n");
                    break;
            }
        } while (opcion != 0);

        System.out.println("Estos son los tipos de mangas que elegiste:");
        if (precioTotal == 0) {
            System.out.println("No seleccionaste ningún tipo de manga.");
        } else {
            if (precioTotal >= 60000) {
                System.out.println("Kimetsu No Yaiba - Precio: $60.000");
            }
            if (precioTotal >= 65000) {
                System.out.println("Tokyo Revengers - Precio: $65.000");
            }
            if (precioTotal >= 70000) {
                System.out.println("Jujutsu Kaisen - Precio: $70.000");
            }
            System.out.println("Precio Total: $" + precioTotal);
        }
        
        promedio = precioTotal / 2.0;
        System.out.println("Promedio de compra: " + promedio);
    }
}
