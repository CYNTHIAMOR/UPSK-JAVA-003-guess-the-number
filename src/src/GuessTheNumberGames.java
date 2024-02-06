import java.util.ArrayList;
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

        ArrayList<Integer> numerosUsadosJugador1 = new ArrayList<>();
        ArrayList<Integer> numerosUsadosJugador2 = new ArrayList<>();

        do {
            int eleccionJugador1 = player1.makeGuess();
            intentosJugador1++;
            numerosUsadosJugador1.add(eleccionJugador1);

            if (player2.getNumber() > eleccionJugador1) {
                System.out.println("\t El número que buscas es mayor ❌\uD83E\uDD74");
            } else if (player2.getNumber() < eleccionJugador1) {
                System.out.println("\t El número que buscas es menor ❌\uD83E\uDD74");
            } else {
                ganoJugador1 = true;
            }

            System.out.println("\n La Computadora está pensando...");
            int numJugador2 = player2.getNumber();
            intentosJugador2++;
            numerosUsadosJugador2.add(numJugador2);

            System.out.println("\t La Computadora ha escogido el número " + numJugador2);

            if (numJugador2 > player1.getNumber()) {
                System.out.println("\t El número que la Computadora busca es mayor ❌\uD83E\uDD74");
            } else if (numJugador2 < player1.getNumber()) {
                System.out.println("\t  El número que la Computadora busca es menor ❌\uD83E\uDD74");
            } else {
                ganoJugador2 = true;
            }

        } while (!ganoJugador1 && !ganoJugador2);

        if (ganoJugador1) {
            System.out.println("¡Felicidades, Jugador 1! \uD83D\uDC4D Has adivinado el número en " + intentosJugador1 + " intentos.");
            System.out.println("Intentos con los números: " + numerosUsadosJugador1);
            System.out.println("***********************************************************************");
            System.out.println("****                    FIN DEL JUEGO                               ***");
            System.out.println("***********************************************************************");
        } else {
            System.out.println("¡Felicidades, Computadora! \uD83D\uDC4D Has adivinado el número en " + intentosJugador2 + " intentos."+"Fin del juego");
            System.out.println("Intentos con los números: " + numerosUsadosJugador2);
            System.out.println("***********************************************************************");
            System.out.println("****                    FIN DEL JUEGO                               ***");
            System.out.println("***********************************************************************");
        }
    }
}
