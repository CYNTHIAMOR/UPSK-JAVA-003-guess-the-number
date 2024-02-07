import java.util.Scanner;

public class HumanPlayerTest extends PlayerJava {

    private Scanner scanner;
    private String playerName;

    public HumanPlayerTest() {
        super();
        this.scanner = new Scanner(System.in);
        setPlayerName();
        welcomeMessage();
    }

    public HumanPlayerTest(Scanner scanner) {
        super();
        this.scanner = scanner;
        setPlayerName();
        welcomeMessage();
    }

    private void setPlayerName() {
        System.out.println("\nIngresa tu nombre:");
        this.playerName = scanner.nextLine();
    }

    private void welcomeMessage() {
        System.out.println("Bienvenido a Guess The Number Games, " + getPlayerName() + "!");
        System.out.println("🎮👾👋💻");
    }

    public int makeGuess() {
        System.out.println("\nIngresa un número del 1 al 100:");
        return scanner.nextInt();
    }

    public String getPlayerName() {
        return playerName;
    }
}
