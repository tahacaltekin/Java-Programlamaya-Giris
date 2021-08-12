package bolum03.sorular;

/*
 * (Kargo ücreti) Kargo firması kargo ücretini hesaplamak için aşağıdaki fonksiyonu kullanmaktadır.
 * Fonksiyon, kargonun ağırlığına (w) karşılık gelen ücreti verir.
 * 
 * 	     3.5, if 0 < w < = 1
 *   c(w) =  5.5, if 1 < w < = 3
 *  	     8.5, if 3 < w < = 10
 *   	     10.5, if 10 < w < = 20
 *   
 *   
 * Kullanıcıdan kargonun ağırlığını alan ve kargo ücretini gösteren bir program yazınız. Eğer ağırlık 50’den
 * büyük girilirse “Bu paket kargolanamaz” mesajını gösteriniz.
 */

import java.util.Scanner;

public class B03S18 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.println("Kargonun ağırlığını giriniz: ");
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
			} System.out.println("Kargolanacak paketin fiyatı " + agirlikBasinaUcret * agirlik + " TL ");
		}
	}
}
