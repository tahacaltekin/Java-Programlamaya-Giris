package bolum07.sorular;

/*
 *  (​Oyun: Dört kart çekme) 52 karttan oluşan bir iskambil destesinden 4 kart çeken ve bu kartların
 * toplam değerini hesaplayan bir program yazınız. As, Papaz, Kız ve Vale için sayısal değerler sırasıyla 1,
 * 13, 12, 11 dir. Programınız 24’e ulaşmak için gereken çekme sayısını göstersin. 
 */

public class B07S29 {

	public static void main(String[] args) {
		int[] deste;
		
		do {
			deste = new int[52];
			
			kartCek(deste);
		} while(toplam(deste) != 24);
		
		yazdir(deste);
	}
	
	public static void kartCek(int[] deste) {
		for (int i = 0; i < 4; i++) {
			deste[(int)(Math.random() * 52)]++;
		}
	}
	
	
	public static int toplam(int[] deste) {
		int toplam = 0;
		for (int i = 0; i < deste.length; i++) {
			toplam += ((i + 1) % 13) * deste[i];
		}
		
		return toplam;
	}
	
	public static void yazdir(int[] deste) {
		String[] kagitlar = {"As", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "Vale", "Kız", "Papaz"};
		
		System.out.println("24 toplamını veren çekilen kartlar: ");
		for (int i = 0; i < deste.length; i++) {
			if(deste[i] > 0) {
				System.out.print(kagitlar[i % 13] + " ");
			}
		}
		System.out.println();
	}
}
