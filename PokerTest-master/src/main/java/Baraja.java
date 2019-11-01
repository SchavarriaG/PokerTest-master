public class Baraja {
	public Carta cartas[];
	public int cartaSig;
	public static final int Ncartas = 52;
	
	public Baraja() {
		cartas = new Carta[Ncartas];
		cartaSig = 0;
		crearBaraja();
		barajar();
	}
	
	void crearBaraja() {
		String[] palos = Carta.PALOS;
		String[] numeros = Carta.NUMEROS;
		
		for(int i = 0; i < palos.length ; i++) {
			for(int j = 0; j < numeros.length  ; j++) {
				cartas[(i * (numeros.length ) + j)] = new Carta(numeros[j], palos[i],j+1);
			}
		}
	}
	
	public Carta[] getcartas() {
		return cartas;
	}
	
	public void barajar() {
		
		int aleatorio = 0;
		Carta  c;
		
		for(int i = 0; i < cartas.length ; i++) {
			aleatorio = (int)(Math.random()*52);
			c = cartas[i];
			cartas[i] = cartas[aleatorio];
			cartas[aleatorio] = c;
		}
	}
	
	public Carta sigCarta() {
		Carta c = cartas[cartaSig++];
		return c;
	} 
	
	public Carta[] mano() {
		Carta[] cartasmano = new Carta[5];
		for(int i = 0; i < cartasmano.length; i++) {
			cartasmano[i] = sigCarta();
		}
		return cartas;
	}
	
	public void mostrarbaraja() {
		for (int i = 0; i < cartas.length; i++) {
			
			System.out.print(cartas[i]);
			System.out.print("-");
		}
	}
}
