import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GuessTheNumberGameTest {
    @Mock
    HumanPlayer humanPlayerMock;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCheckGuess() {
        // Simulamos la entrada del jugador humano como 50
        String input = "50\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Configuramos el comportamiento esperado del jugador humano
        when(humanPlayerMock.makeGuess()).thenReturn(50);

        // Creamos una instancia de GuessTheNumberGame y llamamos al método checkGuess con el jugador humano mockeado
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.checkGuess(humanPlayerMock);


    }
}
