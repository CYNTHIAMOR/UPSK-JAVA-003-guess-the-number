import java.util.Random;
import java.util.Scanner;
// importan las clases y métodos necesarios para escribir pruebas
public class GuessTheNumberGame {
    private static Random random;
    private static int targetNumber;

    public GuessTheNumberGame() {
        random = new Random();
        targetNumber = random.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[35m🎮 Welcome to Guess The Number Game! 🎮\u001B[0m");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        System.out.println("\nHola, " + playerName + "! Bienvenido/a a Guess The Number Game!");
        System.out.println("He seleccionado un número aleatorio entre 1 y 100. ¡Intenta adivinarlo!");

        HumanPlayer playerHuman = new HumanPlayer(playerName);
        ComputerPlayer playerComputer = new ComputerPlayer("Computer");

        while (true) {
            System.out.print("\n\u001B[35m🔢 Enter your guess (Ingresa tu suposición): \u001B[0m");
            int guessHuman = playerHuman.makeGuess();
            int guessComputer = playerComputer.makeGuess();

            System.out.println(playerName + " guessed: " + guessHuman);
            System.out.println("Computer guessed: " + guessComputer);
            System.out.println(playerName + "'s guesses: ");
            playerHuman.displayGuesses();

            if (guessHuman == targetNumber) {
                System.out.println("\n🎉 ¡Felicidades, " + playerName + "! ¡Has adivinado el número! 🎉");
                break;
            } else if (guessHuman < targetNumber) {
                System.out.println("\n⬆️ El número es más alto. Inténtalo de nuevo.");
            } else {
                System.out.println("\n⬇️ El número es más bajo. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }

    public static void checkGuess(Player player) {
        int guess = player.makeGuess();
        if (guess == targetNumber) {
            System.out.println(player.getName() + " guessed the number!");
        } else if (guess < targetNumber) {
            System.out.println(player.getName() + " guessed lower.");
        } else {
            System.out.println(player.getName() + " guessed higher.");
        }
    }

    public int getTargetNumber() {
        return targetNumber;
    }
}