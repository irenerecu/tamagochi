import java.util.Scanner ;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menuPrincipal();
        } while (opcion != 0);
        System.out.println("¡Adiós!");
    }

    private static int menuPrincipal() { // [cite: 69, 70]
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;

        // Bucle para validar que la opción sea correcta (0-4) [cite: 73]
        while (opcion < 0 || opcion > 4) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: "); // [cite: 80]

            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
            } else {
                teclado.next(); //
            }
        }
        return opcion; //
    }
}