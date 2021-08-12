package bolum03.sorular;

/*
 * ​(Geometri: iki dikdörtgen) Kullanıcıdan iki dikdörtgenin merkez noktalarını x­ y­, enini ve boyunu
 * alan ve girilen ikinci dikdörtgenin birinci dikdörtgene göre durumunu
 * gösteren bir program yazınız. Tüm durumlar için programınızı test ediniz.
 */

import java.util.Scanner;

public class B03S28 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Birinci kare için (x, y) koordinatlarını, enini ve boyunu giriniz: ");
		double x1 = girdi.nextDouble();
		double y1 = girdi.nextDouble();
		
		double kareEni = girdi.nextDouble();
		double kareYukseklik = girdi.nextDouble();
		
		System.out.print("İkinci kare için (x, y) koordinatlarını, enini ve boyunu giriniz: ");
		double x2 = girdi.nextDouble();
		double y2 = girdi.nextDouble();
		
		double kare2Eni = girdi.nextDouble();
		double kare2Yukseklik = girdi.nextDouble();
		
		if ((Math.pow(Math.pow(y2 - y1, 2), 0.05) + kare2Yukseklik / 2 <= kareYukseklik / 2) && 
				(Math.pow(Math.pow(x2 - x1, 2), 0.05) + kare2Eni / 2 <= kareEni / 2) &&
				(kareYukseklik / 2 + kare2Yukseklik / 2 <= kareYukseklik) && 
				(kareEni / 2 + kare2Eni / 2 <= kareEni)) {
			System.out.println("İkinci kare birinci karenin içindedir.");
		} else if ((x1 + kareEni / 2 > x2 - kare2Eni) ||
					(y1 + kareYukseklik / 2 > y2 - kare2Yukseklik)) {
			System.out.println("İkinci kare ile Birinci kare kesişiyor.");
		} else {
			System.out.println("İkinci kare Birinci karenin dışındadır.");
		}
				
	}
}
