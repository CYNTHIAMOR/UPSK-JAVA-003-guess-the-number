import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGames {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random r = new Random();

        int min = 1;
        int max = 100;

        int numJugador1 = r.nextInt(max - min) + min;
        int numJugador2;

        int intentosJugador1 = 0;
        int intentosJugador2 = 0;

        boolean ganoJugador1 = false;
        boolean ganoJugador2 = false;

        do {
            System.out.println("Jugador 1, ingresa un número del 1 al 100:");
            int eleccionJugador1 = leer.nextInt();
            intentosJugador1++;

            if (numJugador1 > eleccionJugador1) {
                System.out.println("El número que buscas es mayor ❌\uD83E\uDD74");
            } else if (numJugador1 < eleccionJugador1) {
                System.out.println("El número que buscas es menor ❌\uD83E\uDD74");
            } else {
                ganoJugador1 = true;
            }

            System.out.println("Jugador 2 (Computadora) está pensando...");
            numJugador2 = r.nextInt(max - min) + min;
            intentosJugador2++;

            System.out.println("La Computadora ha escogido el número " + numJugador2);

            if (numJugador2 > numJugador1) {
                System.out.println("El número que la Computadora busca es mayor ❌\uD83E\uDD74");
            } else if (numJugador2 < numJugador1) {
                System.out.println("El número que la Computadora busca es menor ❌\uD83E\uDD74");
            } else {
                ganoJugador2 = true;
            }

        } while (!ganoJugador1 && !ganoJugador2);

        if (ganoJugador1) {
            System.out.println("¡Felicidades, Jugador 1! \uD83D\uDC4D Has adivinado el número en " + intentosJugador1 + " intentos.");
        } else {
            System.out.println("¡Felicidades, Jugador 2 (Computadora)! \uD83D\uDC4D Has adivinado el número en " + intentosJugador2 + " intentos.");
        }
    }
}
