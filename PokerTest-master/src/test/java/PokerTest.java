import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class PokerTest {
	@DisplayName("Blanco: 2H 3D 5S 9C KD  Negro: 2C 3H 4S 8C AH Negro gana. - con la carta alta: As ")
    @Test
    void testCartaAlta() {
        Mano mano1 = new Mano("Blanco", "2H,3D,5S,9C,KD");
        Mano mano2 = new Mano("Negro", "2C,3H,4S,8C,AH");
        String resul = Poker.CartaAlta(mano1, mano2);
        String esper = "Negro gana. - con la carta alta: As";
    }
	
}