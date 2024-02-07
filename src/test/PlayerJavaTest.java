import java.util.Random;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerJavaTest {

    @Test
    public void PlayerJava() {
        // Arrange
        PlayerJava player = new PlayerJava();

        // Act

        // Assert
        assertNotNull(player);
        assertTrue(player.getNumber() >= 1 && player.getNumber() <= 100);
    }
}

