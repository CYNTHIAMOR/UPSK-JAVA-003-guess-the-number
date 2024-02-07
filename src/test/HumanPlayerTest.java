import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanPlayerTest {
    @Test
    public void getPlayerName(){
        HumanPlayer humanPlayer = new HumanPlayer();

        // Act

        // Assert
        assertNotNull(humanPlayer);
        assertNotNull(humanPlayer.getScanner());
        assertNotNull(humanPlayer.getPlayerName());
    }

}