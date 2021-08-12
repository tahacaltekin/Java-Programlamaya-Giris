package bolum03.sorular;

/*
 * (Finans: Fiyat kar��la�t�rma) �ki farkl� pirin� markas� aras�nda karar vermeniz gerekti�ini
 * varsayal�m. �kisinin de maliyetlerini kar��la�t�rmak i�in bir program yazmak istediniz. Program�n�z
 * kullan�c�dan a��rl�k ve fiyat�n� alacak ve daha ucuz olan�n markas�n� g�sterecektir. 
 */

import java.util.Scanner;

public class B03S33 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Fiyat kar��la�t�rmas� i�in 1. paketin a��rl�k ve fiyat�n� giriniz: ");
		double agirlik1 = girdi.nextDouble();
		double fiyat1 = girdi.nextDouble();
		
		System.out.println("Fiyat kar��la�t�rmas� i�in 2. paketin a��rl�k ve fiyat�n� giriniz: ");
		double agirlik2 = girdi.nextDouble();
		double fiyat2 = girdi.nextDouble();
		
		double karsilastirma1 = fiyat1 / agirlik1;
		double karsilastirma2 = fiyat2 / agirlik2;
		
		if(karsilastirma1 < karsilastirma2) {
			System.out.println("1. paketin fiyat� daha iyi.");
		} else if (karsilastirma1 > karsilastirma2) {
			System.out.println("2. paketin fiyat� daha iyi");
		} else {
			System.out.println("�ki paketin fiyat� ayn�.");
		}
	}
}
