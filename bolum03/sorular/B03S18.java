package bolum03.sorular;

/*
 * (Kargo �creti) Kargo firmas� kargo �cretini hesaplamak i�in a�a��daki fonksiyonu kullanmaktad�r.
 * Fonksiyon, kargonun a��rl���na (w) kar��l�k gelen �creti verir.
 * 
 * 	 		 3.5, if 0 < w < = 1
 *   c(w) =  5.5, if 1 < w < = 3
 *  		 8.5, if 3 < w < = 10
 *   		 10.5, if 10 < w < = 20
 *   
 *   
 * Kullan�c�dan kargonun a��rl���n� alan ve kargo �cretini g�steren bir program yaz�n�z. E�er a��rl�k 50�den
 * b�y�k girilirse �Bu paket kargolanamaz� mesaj�n� g�steriniz.
 */

import java.util.Scanner;

public class B03S18 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.println("Kargonun a��rl���n� giriniz: ");
		double agirlik = girdi.nextDouble();

		double agirlikBasinaUcret;

		if (agirlik > 50) {
			System.out.println("Bu paket kargolanamaz.");
		} else {

			if (agirlik > 0 && agirlik <= 1) {
				agirlikBasinaUcret = 3.5;
			} else if (agirlik <= 3) {
				agirlikBasinaUcret = 5.5;
			} else if (agirlik <= 10) {
				agirlikBasinaUcret = 8.5;
			} else {
				agirlikBasinaUcret = 10.5;
			} System.out.println("Kargolanacak paketin fiyat� " + agirlikBasinaUcret * agirlik + " TL ");
		}
	}
}
