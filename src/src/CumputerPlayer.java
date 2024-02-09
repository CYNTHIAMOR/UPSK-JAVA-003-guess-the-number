import org.junit.jupiter.api.Test;
import java.util.Random;
import java.util.Scanner;
import org.junit.jupiter.api.ClassOrderer;
class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        random = new Random();
    }

    @Override
    public int makeGuess() {
        int guess = random.nextInt(100) + 1;
        recordGuess(guess);
        return guess;
    }
}