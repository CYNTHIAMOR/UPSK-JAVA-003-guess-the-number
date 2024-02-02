// Clase Main
public class Main {
    public static void main(String[] args) {
        HumanPlayer player1 = new HumanPlayer();
        PlayerJava player2 = new PlayerJava();

        int attemptsPlayer1 = 0;
        int attemptsPlayer2 = 0;

        boolean wonPlayer1 = false;
        boolean wonPlayer2 = false;

        do {
            int guessPlayer1 = player1.makeGuess();
            attemptsPlayer1++;

            if (player2.getNumber() > guessPlayer1) {
                System.out.println("El número que buscas es mayor ❌\uD83E\uDD74");
            } else if (player2.getNumber() < guessPlayer1) {
                System.out.println("El número que buscas es menor ❌\uD83E\uDD74");
            } else {
                wonPlayer1 = true;
            }

            System.out.println("La Computadora está pensando...");
            int guessPlayer2 = player2.getNumber();
            attemptsPlayer2++;

            System.out.println("La Computadora ha escogido el número " + guessPlayer2);

            if (guessPlayer2 > player1.getNumber()) {
                System.out.println("El número que la Computadora busca es mayor ❌\uD83E\uDD74");
            } else if (guessPlayer2 < player1.getNumber()) {
                System.out.println("El número que la Computadora busca es menor ❌\uD83E\uDD74");
            } else {
                wonPlayer2 = true;
            }

        } while (!wonPlayer1 && !wonPlayer2);

        if (wonPlayer1) {
            System.out.println("¡Felicidades, Jugador 1! \uD83D\uDC4D Has adivinado el número en " + attemptsPlayer1 + " intentos.");
        } else {
            System.out.println("¡Felicidades, Computadora! \uD83D\uDC4D Has adivinado el número en " + attemptsPlayer2 + " intentos.");
        }
    }
}
