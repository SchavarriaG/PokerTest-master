public class Poker {
	public static int getLucky() {
        return 7;
    }
	public static String getHelloWorld(){
        return "hello world";
    }

    public static int getNumber10(){
        return 10;
    }
    
    public static String CartaAlta(Mano mano1, Mano mano2) {
    	int mayor1 = 0, mayor2 = 0;
    	
    	for (int i = 0; i < 5 ; i++) {
    		if (mano1.mano[i].valor >= mayor1) {
    			mayor1 = mano1.mano[i].valor;
    		}
    		if (mano2.mano[i].valor >= mayor2) {
    			mayor2 = mano2.mano[i].valor;
    		}
    	}
    	
    	
    	
    	return "Shi";
    }
}

