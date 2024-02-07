import java.util.Scanner;

public class HumanPlayer extends PlayerJava {
    public Scanner scanner;
    public String playerName;

    public HumanPlayer() {
        super();
        this.scanner = new Scanner(System.in);
        setPlayerName();
        welcomeMessage();
    }

    public void setPlayerName() {
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