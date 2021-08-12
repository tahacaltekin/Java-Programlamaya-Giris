package bolum05.sorular;

/*
 * (Matematik: kombinasyon) 1’den 7’ye kadar sayýlarýn tüm olasý kombinasyonlarýný gösteren bir program
 * yazýnýz. Ek olarak bulduðunuz tüm kombinasyonlarýn sayýsýný da gösterin.
 */

public class B05S43 {

	public static void main(String[] args) {
		int sayac = 0;
		
		for (int sayi1 = 1; sayi1 < 7; sayi1++) {
			for (int sayi2 = sayi1 + 1; sayi2 <= 7; sayi2++) {
				System.out.println(sayi1 + " " + sayi2);
				sayac++;
			}
		}
		
		System.out.println("Tüm kombinasyonlarýn toplam sayýsý: " + sayac);
	}
}
