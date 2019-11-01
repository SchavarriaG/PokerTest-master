public class Carta implements Comparable<Carta>{
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
		if("1".equals(carta.substring(0,1))) {
			valor = 9;
			num = "10";
			palo = carta.substring(2,3);
		}
		else {
			for (int i = 0; i < 13 ; i++) {
				if (NUMEROS[i].equals(carta.substring(0,1))) {
					valor = i+1;
					num = carta.substring(0,1);
					palo = carta.substring(1,2);
				}
			}
		}
		
		
	}
	
	@Override
	public String toString() {
		return num + palo;
	}
	
	public static void main(String[]args){
		 Mano bar = new Mano("Negro", "2C,3H,10S,8C,AH");
		 bar.mostrarMano();
	}
	
	int getvalor() {
		return valor;
	}
	
	String getnum() {
		return num;
	}
	
	String getpalo() {
		return palo;
	}
	
	
	public int compareTo(Carta o) {
         if (valor < o.valor) {
             return -1;
         }
         if (valor > o.valor) {
             return 1;
         }
         return 0;
    }
}

