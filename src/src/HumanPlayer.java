import java.util.Scanner;

public class HumanPlayer extends PlayerJava {
    private Scanner scanner;
    private String playerName;

    public HumanPlayer() {
        super();
        this.scanner = new Scanner(System.in);
        setPlayerName();
    }

    private void setPlayerName() {
        System.out.println("Ingresa tu nombre:");
        this.playerName = scanner.nextLine();
    }

    public String getPlayerName() {
        return playerName;
    }

    public int makeGuess() {
        System.out.println("Bienvenido a Guess The Number Games, " + getPlayerName() + "!");
        System.out.println("🎮👾👋 💻");
        System.out.println("Ingresa un número del 1 al 100:");
        return scanner.nextInt();
    }
}

