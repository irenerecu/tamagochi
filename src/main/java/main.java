
import java.util.Scanner;

public class main {

        //Variables inicializadas a 6
        static int saciedad = 6;
        static int energia = 6;
        static int diversion = 6;
        static int higiene = 6;

        public static void main(String[] args) {
        int opcion;
        do {
            opcion = menuPrincipal();
            //paso 7
            if (opcion == 1) {
                mostrarEstado();
            }
            //paso 8 - comer con error de +5 puntos //paso 9 - corregiod a +3
            else if (opcion == 2) {
                if (saciedad < 10) {
                    saciedad = saciedad + 4; // Error intencionado: sumamos 5 en lugar de 3

                    // Aseguramos que no pase de 10
                    if (saciedad > 10) saciedad = 10;

                    diversion = diversion - 1;
                    System.out.println("Has alimentado al Tamagotchi.");
                    mostrarEstado(); // AÑADIDO
                } else {
                    System.out.println("No tengo hambre");
                }
            }
            //paso 10
            else if (opcion == 3) {
                if (diversion < 10) {
                    diversion = diversion + 3;
                    if (diversion > 10) diversion = 10;

                    saciedad = saciedad - 2; // Jugar da hambre
                    energia = energia - 2;   // Jugar cansa

                    System.out.println("¡A jugar! El Tamagotchi se divierte.");
                    mostrarEstado();
                } else {
                    System.out.println("Ahora no me apetece jugar.");
                }
            }
            // [Paso 11] Opción 4: Dormir
            else if (opcion == 4) {
                if (energia < 10) {
                    energia += 3; // Incremento de 3
                    if (energia > 10) energia = 10;
                    saciedad -= 3; // Disminuye saciedad en 3
                    diversion -= 2; // Disminuye diversión en 2
                    System.out.println("Zzz... El Tamagotchi está durmiendo.");
                    mostrarEstado();
                } else {
                    System.out.println("No tengo sueño ahora mismo");
                }
            }
            else if (opcion == 5) {
                if (higiene < 10) {
                    higiene = 10; // Queda totalmente limpio
                    energia -= 1; // Bañarse cansa un poco
                    System.out.println("¡Burbujas! El Tamagotchi está reluciente.");
                    mostrarEstado();
                } else {
                    System.out.println("Ya está limpio, no quiere mojarse.");
                }
            }

        } while (opcion != 0);
        System.out.println("¡Adiós!");
    }
        // Metodo para mostrar el sprite según el estado
        private static void mostrarEstado() {
            System.out.println("\n--- ESTADO DEL TAMAGOTCHI ---");
            System.out.println("Saciedad: " + saciedad + " | Energía: " + energia + " | Diversión: " + diversion + " | Higiene: " + higiene);

            if (saciedad <= 0 || energia <= 0 || diversion <= 0) { // Fin del juego
                System.out.println("(x_x): (Game Over )");
                System.out.println("/I_I\\");
            } else if (diversion <= 4) { // Triste
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
    private static int menuPrincipal() {
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;

        // Bucle para validar que la opción sea correcta (0-4)
        while (opcion < 0 || opcion > 5) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("5. Bañar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
            } else {
                teclado.next(); //
            }
        }
        return opcion; //
    }
}