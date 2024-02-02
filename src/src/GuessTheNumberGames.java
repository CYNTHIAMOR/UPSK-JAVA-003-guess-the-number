import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGames {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random r = new Random();

        PlayerJava player1 = new HumanPlayer(); // Utilizamos la interfaz PlayerJava para permitir polimorfismo
        PlayerJava player2 = new PlayerJava();

        int intentosJugador1 = 0;
        int intentosJugador2 = 0;

        boolean ganoJugador1 = false;
        boolean ganoJugador2 = false;

        do {
            int eleccionJugador1 = player1.makeGuess();
            intentosJugador1++;

            if (player2.getNumber() > eleccionJugador1) {
                System.out.println("El número que buscas es mayor ❌\uD83E\uDD74");
            } else if (player2.getNumber() < eleccionJugador1) {
                System.out.println("El número que buscas es menor ❌\uD83E\uDD74");
            } else {
                ganoJugador1 = true;
            }

            System.out.println("La Computadora está pensando...");
            int numJugador2 = player2.getNumber();
            intentosJugador2++;

            System.out.println("La Computadora ha escogido el número " + numJugador2);

            if (numJugador2 > player1.getNumber()) {
                System.out.println("El número que la Computadora busca es mayor ❌\uD83E\uDD74"+"***********************");
            } else if (numJugador2 < player1.getNumber()) {
                System.out.println("El número que la Computadora busca es menor ❌\uD83E\uDD74");
            } else {
                ganoJugador2 = true;
            }

        } while (!ganoJugador1 && !ganoJugador2);

        if (ganoJugador1) {
            System.out.println("¡Felicidades, Jugador 1! \uD83D\uDC4D Has adivinado el número en " + intentosJugador1 + " intentos.");
        } else {
            System.out.println("¡Felicidades, Computadora! \uD83D\uDC4D Has adivinado el número en " + intentosJugador2 + " intentos.");
            System.out.println("***********************");
            System.out.println("*     Fin del Juego    *");
            System.out.println("***********************");

        }
    }
}
