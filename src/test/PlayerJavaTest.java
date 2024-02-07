import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerJavaTest {

    private PlayerJava player;

    @BeforeEach
    void setUp() {
        // Inicializar un nuevo objeto PlayerJava antes de cada prueba
        player = new PlayerJava();
    }

    @Test
    void testPlayerJavaConstructor() {
        // Verificar que el constructor de PlayerJava inicialice correctamente el objeto
        assertNotNull(player);
        assertTrue(player.getNumber() >= 1 && player.getNumber() <= 100);
    }
}
