public class Poker {
	
	public static String CartaAlta(Mano mano1, Mano mano2) {
    	int mayor1 = 0, mayor2 = 0, lim = 0;
    	
    	while (mayor2 == mayor1) {
	    	for (int i = lim ; i < 5 ; i++) {
	    		if (mano1.mano[i].valor >= mayor1) {
	    			mayor1 = mano1.mano[i].valor;
	    		}
	    		if (mano2.mano[i].valor >= mayor2) {
	    			mayor2 = mano2.mano[i].valor;
	    		}
	    	}
	    	lim++;
    	}
    	if (mayor2 > mayor1) {
    		return mano2.jugador + " gana. - con la carta alta: " +  mano2.mano[lim-1];
    	}else {
    		return mano1.jugador + " gana. - con la carta alta: " + mano1.mano[lim-1];
    	}
    }
	
	public static String Color(Mano mano1, Mano mano2) {
		int palos1 = 1, palos2 = 1;
		
		for(int k = 1 ; k < 5 ; k++) {
    		if (mano1.mano[k].palo.equals(mano1.mano[0].palo)) {
    			palos1++;
    			System.out.print(palos1+"-");
    		}
    		if (mano2.mano[k].palo.equals(mano2.mano[0].palo)) {
    			palos2++;
    			//System.out.print(palos2);
    		}
    	}
		
		if(palos1 > palos2 && palos1 == 5){
			return mano1.jugador + " gana. - con color";
		}
		else if(palos2 > palos1 && palos2 == 5){
			return mano2.jugador + " gana. - con color";
		}
		else if(palos2 == 5 && palos1 == 5){
			int mayor1 = 0, mayor2 = 0, lim = 0;
	    	
	    	while (mayor2 == mayor1) {
		    	for (int j = lim ; j < 5 ; j++) {
		    		if (mano1.mano[j].valor >= mayor1) {
		    			mayor1 = mano1.mano[j].valor;
		    		}
		    		if (mano2.mano[j].valor >= mayor2) {
		    			mayor2 = mano2.mano[j].valor;
		    		}
		    	}
		    	lim++;
	    	}
	    	if (mayor2 > mayor1) {
	    		return mano2.jugador + " gana. - con color";
	    	}else {
	    		return mano1.jugador + " gana. - con color";
	    	}
		}
		else {
			return "Empate o no es color";
		}
	}
	
	
}

