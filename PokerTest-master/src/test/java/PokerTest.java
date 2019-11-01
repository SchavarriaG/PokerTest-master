import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class PokerTest {
	
	//test Carta Alta
	@DisplayName("Blanco: 2H 3D 5S 9C KD  Negro: 2C 3H 4S 8C AH Negro gana. - con la carta alta: As ")
    @Test
    void testCartaAlta() {
        Mano mano1 = new Mano("Blanco", "2H,3D,5S,9C,KD");
        Mano mano2 = new Mano("Negro", "2C,3H,4S,8C,AH");
        String resul = Poker.CartaAlta(mano1, mano2);
        String esper = "Negro gana. - con la carta alta: AH";
        assertEquals(esper, resul);
    }
	
	@DisplayName("Blanco: 2H 3D 5S 9C KD  Negro: 2C 3H 4S 8C 2C Blanco gana. - con la carta alta: Rey ")
    @Test
    void testCartaAlta2() {
		Mano mano1 = new Mano("Blanco", "2H,3D,5S,9C,KD");
        Mano mano2 = new Mano("Negro", "2C,3H,4S,8C,2C");
        String resul = Poker.CartaAlta(mano1, mano2);
        String esper = "Blanco gana. - con la carta alta: KD";
        assertEquals(esper, resul);
    }
	
	// color
    //@DisplayName("Blanco: 2H 3H 5H KH 8H  Negro: 2C 3H 4S 8C AH Blanco gana. - con color ")
    //@Test
    //void testColor() {
    //	Mano mano1 = new Mano("Blanco", "2H,3H,5H,KH,8H");
    //    Mano mano2 = new Mano("Negro", "2C,3H,4S,8C,AH");
    //    String resul = Poker.Color(mano1, mano2);
    //    String esper = "Blanco gana. - con color";
    //    assertEquals(esper, resul);
    //}

    //@DisplayName("Blanco: 2H 3D 5S 8C KD  Negro: 2C 3C 4C AC RC Negro gana. - con color ")
    //@Test
    //void testColor2() {
    //	Mano mano1 = new Mano("Blanco", "2H,3D,5S,8C,KD");
    //    Mano mano2 = new Mano("Negro", "2C,3C,4C,AC,RC");
    //    String resul = Poker.Color(mano1, mano2);
    //    String esper = "Negro gana. - con color";
    //    assertEquals(esper, resul);
    //}
	
}