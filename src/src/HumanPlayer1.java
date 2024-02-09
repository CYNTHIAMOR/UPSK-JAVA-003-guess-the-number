import java.util.Scanner;

class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        scanner = new Scanner(System.in);
    }

    @Override
    public int makeGuess() {
        int guess = scanner.nextInt();
        scanner.nextLine(); // consume newline
        recordGuess(guess);
        return guess;
    }
}
