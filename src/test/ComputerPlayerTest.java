import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class ComputerPlayerTest {
    private ComputerPlayer player;
    private Random randomMock;

    @Before
    public void setUp() {
        randomMock = mock(Random.class);
        player = new ComputerPlayer("Computer");
        player.setRandom(randomMock);
    }

    @Test
    public void testComputerPlayerMakeGuess() {
        // Configurar el comportamiento esperado del mock de Random
        when(randomMock.nextInt(anyInt())).thenReturn(41);

        // Realizar la suposición del jugador
        int guess = player.makeGuess();

        // Verificar la interacción con el mock de Random
        verify(randomMock).nextInt(100);

        // Verificar si la suposición es correcta
        assertEquals(42, guess);
    }
}
class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name) {
        super(name);
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public int makeGuess() {
        int guess = random.nextInt(100) + 1;
        guesses[guess - 1] = guess;
        return guess;
    }
}
