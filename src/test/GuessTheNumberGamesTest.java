import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GuessTheNumberGamesTest {

    @Test
    void testPlayGame() {
        PlayerJava player1 = new PlayerJava() {
            @Override
            public int makeGuess() {
                return 50; // Simulamos la elección del jugador 1 como 50
            }
        };
        PlayerJava player2 = new PlayerJava() {
            @Override
            public int getNumber() {
                return 50; // Simulamos que el número del jugador 2 es 50
            }
        };

        GuessTheNumberGames game = new GuessTheNumberGames(player1, player2);
        String result = game.playGame();

        assertEquals("¡Felicidades, Jugador 1! \uD83D\uDC4D Has adivinado el número en 1 intentos." +
                "\nIntentos con los números: [50]" +
                "\n*************************" +
                "\n**                    FIN DEL JUEGO                               *" +
                "\n*************************", result);
    }
}
