import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTenis {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        List<Tenis> listaTenis = new ArrayList<>();

        boolean salir = false;

        while(!salir){
            mostrarMenu();

            try {
                salir = ejecutarOperacion(consola, listaTenis);
            } catch(Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("***** Tenis *****");
        System.out.println();
        System.out.println("""
                1. Agregar tenis
                2. Listar tenis
                3. Salir
                """);
        System.out.print("Elige una opción: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Tenis> listaTenis){
        int opcion = Integer.parseInt(consola.nextLine());
        var salir = false;

        System.out.println();

        switch (opcion) {
            case 1 -> {
                System.out.print("Nombre: ");
                String nombre = consola.nextLine();
                System.out.print("Genero: ");
                char genero = consola.next().charAt(0);
                System.out.print("Precio: ");
                double precio = consola.nextDouble();
                System.out.print("Talla: ");
                double talla = consola.nextDouble();
                consola.nextLine();
                System.out.print("Color: ");
                String color = consola.nextLine();
                Tenis tenis = new Tenis(nombre, genero, precio, talla, color);
                listaTenis.add(tenis);
                System.out.println("Tenis agregado exitosamente");
                System.out.println();
            }
            case 2 -> {
                System.out.println("Lista de tenis:");
                listaTenis.forEach(System.out::println);
                System.out.println();
            }
            case 3 -> {
                System.out.println("¡Hasta la próxima!");
                salir = true;
            }
            default -> {
                System.out.println("Opción inválida: " + opcion);
                System.out.println();
            }
        }

        return salir;
    }
}
