import java.util.Arrays;

public class Mano {
	String jugador;
	Carta mano[];
	
	public Mano(String jugador, String cartas) {
		this.jugador = jugador;
		mano = new Carta[5];
		String[] strcartas = cartas.split(",");
		for (int i = 0; i < strcartas.length; i++) {
			mano[i] = new Carta(strcartas[i]);
		}
		
	}
	
	public void mostrarMano() {
		Arrays.sort(mano);
		for (int i = 0; i < mano.length; i++) {
			System.out.print(mano[i]);
			System.out.print(" ");
		}
	}
}
