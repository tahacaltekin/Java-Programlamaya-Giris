package bolum05.sorular;

/*
 * (5 ya da 6�ya tam b�l�nen ancak her ikisine de tam b�l�nmeyen say�lar� bulma) 100�sen 200�e kadar  5 ya
 * da 6�ya tam b�l�nen ancak her ikisine de tam b�l�nmeyenler olacak �ekilde uygun say�lar� g�steren bir program
 * yaz�n�z. Sonu�lar aras�nda sadece bir bo�luk olacak �ekilde g�steriniz.
 */

public class B05S11 {

	public static void main(String[] args) {
		final int HER_SATIRDAKI_SAYI_SAYISI = 10;
		int sayac = 0;
		
		for (int i = 100; i <= 200; i++) {
			if (i % 5 == 0 ^ i % 6 == 0) {
				sayac++;
				if(sayac % HER_SATIRDAKI_SAYI_SAYISI == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}		
			} 
		}
		System.out.println();
	}
}
