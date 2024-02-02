// Clase PlayerJava
import java.util.Random;

public class PlayerJava {
    private int number;

    public PlayerJava() {
        Random random = new Random();
        this.number = random.nextInt(100) + 1;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int makeGuess() {
        return 0;
    }
}
