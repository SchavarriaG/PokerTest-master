public class Carta {
	public String num;
	public String palo;
	public int valor;
	
	public static final String[] PALOS = {"C","D","H","S"};
	public static final String[] NUMEROS = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	
	public Carta (String num, String palo, int valor) {
		this.num = num;
		this.palo = palo;
		this.valor = valor;
	}
	
	public Carta (String carta) {
		num = carta.substring(0);
		palo = carta.substring(1,1);
		for (int i = 0; i < NUMEROS.length; i++) {
			if (carta.substring(0) == NUMEROS[i]) {
				valor = i;
			}
		}
		
	}
	
	@Override
	public String toString() {
		return num + palo;
	}
	
	public static void main(String[]args){
		 Carta car = new Carta("2S");
		 System.out.println(car);
		 Baraja bar = new Baraja();
		 bar.mostrarbaraja();
	}
}

