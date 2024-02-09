import java.util.Random;

abstract class Player {
    protected String name;
    protected int[] guesses;
    protected int guessIndex;

    public Player(String name) {
        this.name = name;
        this.guesses = new int[100];
        this.guessIndex = 0;
    }

    public abstract int makeGuess();

    public String getName() {
        return name;
    }

    public int[] getGuesses() {
        return guesses;
    }

    public void recordGuess(int guess) {
        guesses[guessIndex++] = guess;
    }

    public void displayGuesses() {
        for (int i = 0; i < guessIndex; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
    }

    public void setRandom(Random randomMock) {
    }
}