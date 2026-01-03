
import java.util.Scanner;

public class main {

        //Variables inicializadas a 6
        static int energia = 6;
        static int diversion = 6;

        public static void main(String[] args) {
        int opcion;
        do {
            opcion = menuPrincipal();
            //paso 7
            if (opcion == 1) {
                mostrarEstado();
            }
        } while (opcion != 0);
        System.out.println("¡Adiós!");
    }
        // Metodo para mostrar el sprite según el estado
        private static void mostrarEstado() {
            System.out.println("\n--- ESTADO DEL TAMAGOTCHI ---");
            System.out.println("Saciedad: " + saciedad + " | Energía: " + energia + " | Diversión: " + diversion);

            if (saciedad <= 0 || energia <= 0 || diversion <= 0) { // Fin del juego [cite: 39, 91]
                System.out.println("(x_x): (Game Over )");
                System.out.println("/I_I\\");
            } else if (diversion <= 4) { // Triste [cite: 26, 88]
                System.out.println("(-,-) Estoy aburrido / ¡Juega conmigo!");
            } else if (energia <= 4) { // Cansado [cite: 32, 89]
                System.out.println("(-_-) Zzz");
            } else if (saciedad <= 4) { // Hambriento [cite: 34, 90]
                System.out.println("(·_·) Tengo hambre!");
                System.out.println("/|x|\\");
            } else { // Contento [cite: 24, 87]
                System.out.println("(^.^) ¡Estoy feliz!");
            }
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