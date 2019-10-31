public class Mano {
	private Carta mano[];
	private String jugador;
	
	public Mano(String jugador, String cartas) {
		this.jugador = jugador;
		mano = new Carta[5];
		String[] strcartas = cartas.split(",");
		for (int i = 0; i < strcartas.length; i++) {
			mano[i] = new Carta(strcartas[i]);
		}
	}
	
	public Mano(String jugador, Carta[] cartas) {
		this.jugador = jugador;
		cartas = Baraja.mano();
	}
	
	public void mostrarMano() {
		for (int i = 0; i < mano.length; i++) {
			System.out.print(mano[i]);
			System.out.print("-");
		}
	}
}
