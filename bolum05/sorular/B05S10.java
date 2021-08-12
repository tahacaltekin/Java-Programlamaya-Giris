package bolum05.sorular;

/*
 * (5 ve 6�ya b�l�nebilen say�lar� bulma) 100�den 1000�e kadar olan say�lardan 5 ve 6�ya tam olarak
 * b�l�nebilen say�lar� her sat�rda 10 say� olacak ve say�lar aras�nda birer bo�luk olacak �ekilde g�steren bir program
 * yaz�n�z.
 */

public class B05S10 {

	public static void main(String[] args) {
		final int HER_SATIRDAKI_SAYI_SAYISI = 10;
		int sayac = 0;
		
		for(int i = 100; i <= 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				sayac++;
				
				if(sayac % HER_SATIRDAKI_SAYI_SAYISI == 0) 
					System.out.println(i);
				 else 
					System.out.print(i + " ");
				
			}
		}
		
	}
}
