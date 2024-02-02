// Clase HumanPlayer
import java.util.Scanner;

public class HumanPlayer extends PlayerJava {
    private Scanner scanner;

    public HumanPlayer() {
        super();
        this.scanner = new Scanner(System.in);
    }

    public int makeGuess() {
        System.out.println("Ingresa un número del 1 al 100:");
        return scanner.nextInt();
    }
}
