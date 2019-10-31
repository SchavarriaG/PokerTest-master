import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class PokerTest {
	@Test
    public void testLucky() {
        assertEquals(7, Poker.getLucky());
    }
	
}