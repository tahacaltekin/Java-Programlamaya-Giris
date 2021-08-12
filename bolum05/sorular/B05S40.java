package bolum05.sorular;

/*
 * (Simülasyon : yazý­tura) 1 milyon kez yazý tura atmayý simule eden ve toplam yazý­tura sayýlarýný gösteren
 * bir program yazýnýz.
 */

public class B05S40 {

	public static void main(String[] args) {
		int yazi;
		int tura;
		int para;
		
		yazi = tura = 0;
		
		System.out.println("Parayý 1 milyon kere atarsak ");
		
		for (int i = 0; i < 1000000; i++) {
			para = ((int)(Math.random() * 2) == 0 ? yazi++ : tura++);
		}
		
		System.out.println("tura sayýsý: " + tura + 
				"\nyazý sayýsý: " + yazi);
	}
}
