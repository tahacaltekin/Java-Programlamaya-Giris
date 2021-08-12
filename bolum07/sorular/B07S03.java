package bolum07.sorular;

/*
 *  (​Sayıların tekrarlanma s ​ ayısı) 1 ile 100 arasında sayıları okuyan ve bu sayıların her birinin kaç defa
 * tekrarlandığını gösteren bir program yazınız.​ 0​ girildiğinde okuma işleminin sonlandığını varsayalım.
 * 
 * Eğer sayının tekrar sayısı birden fazla ise yanına * ekleyiniz.
 */

import java.util.Scanner;

public class B07S03 {

	public static void main(String[] args) {
		int[] sayaclar = new int[100];
		
		System.out.println("1 ile 100 arasında istediğiniz kadar sayı giriniz:\n  bitirmek için 0 giriniz." );
		
		sayac(sayaclar);
		
		for (int i = 0; i < sayaclar.length; i++) {
			if (sayaclar[i] > 0) {
				System.out.println((i + 1) + " tekrar sayısı: " + sayaclar[i] + " kez");
			}
		}
		
	}
	
	public static void sayac(int[] sayaclar) {
		Scanner girdi = new Scanner(System.in);
		int sayi; 
		do {
			sayi = girdi.nextInt();
			if(sayi >= 1 && sayi <= 100) {
				sayaclar[sayi - 1]++;
			}
		} while (sayi != 0);
	}
}
