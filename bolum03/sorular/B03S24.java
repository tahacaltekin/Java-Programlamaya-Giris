package bolum03.sorular;

/*
 *  ​(Oyun: kart çekme) 52 ​kartlık bir desteden kart çekmeyi simüle eden bir program yazınız.
 * Programınız kartın değerini (As​, 2​, 3​, 4​, 5​, 6​, 7​, 8​, 9​, 10​, Vale​, Kız​, Papaz​) ve hangi türden (Sinek​, Karo​,
 * Kupa​, Maça​) olduğunu gösterecektir. 
 */

public class B03S24 {
	public static void main(String[] args) {
		int kart = (int)(Math.random() * 13) + 1;
		
		int tur = (int)(Math.random() * 4) + 1;
		
		switch(kart) {
		case 1: System.out.println("Seçtiğiniz kart As"); break;
		case 2: System.out.println("Seçtiğiniz kart " + kart); break;
		case 3: System.out.println("Seçtiğiniz kart " + kart); break;
		case 4: System.out.println("Seçtiğiniz kart " + kart); break;
		case 5: System.out.println("Seçtiğiniz kart " + kart); break;
		case 6: System.out.println("Seçtiğiniz kart " + kart); break;
		case 7: System.out.println("Seçtiğiniz kart " + kart); break;
		case 8: System.out.println("Seçtiğiniz kart " + kart); break;
		case 9: System.out.println("Seçtiğiniz kart " + kart); break;
		case 10: System.out.println("Seçtiğiniz kart " + kart); break;
		case 11: System.out.println("Seçtiğiniz kart Vale"); break;
		case 12: System.out.println("Seçtiğiniz kart Kız"); break;
		case 13: System.out.println("Seçtiğiniz kart Papaz"); 
		} 
		
		switch (tur) {
		case 1: System.out.println("Sinek"); break;
		case 2: System.out.println("Karo"); break;
		case 3: System.out.println("Kupa"); break;
		case 4: System.out.println("Maça"); 
		}
	}
}
