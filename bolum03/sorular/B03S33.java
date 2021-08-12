package bolum03.sorular;

/*
 * (Finans: Fiyat karþýlaþtýrma) Ýki farklý pirinç markasý arasýnda karar vermeniz gerektiðini
 * varsayalým. Ýkisinin de maliyetlerini karþýlaþtýrmak için bir program yazmak istediniz. Programýnýz
 * kullanýcýdan aðýrlýk ve fiyatýný alacak ve daha ucuz olanýn markasýný gösterecektir. 
 */

import java.util.Scanner;

public class B03S33 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Fiyat karþýlaþtýrmasý için 1. paketin aðýrlýk ve fiyatýný giriniz: ");
		double agirlik1 = girdi.nextDouble();
		double fiyat1 = girdi.nextDouble();
		
		System.out.println("Fiyat karþýlaþtýrmasý için 2. paketin aðýrlýk ve fiyatýný giriniz: ");
		double agirlik2 = girdi.nextDouble();
		double fiyat2 = girdi.nextDouble();
		
		double karsilastirma1 = fiyat1 / agirlik1;
		double karsilastirma2 = fiyat2 / agirlik2;
		
		if(karsilastirma1 < karsilastirma2) {
			System.out.println("1. paketin fiyatý daha iyi.");
		} else if (karsilastirma1 > karsilastirma2) {
			System.out.println("2. paketin fiyatý daha iyi");
		} else {
			System.out.println("Ýki paketin fiyatý ayný.");
		}
	}
}
