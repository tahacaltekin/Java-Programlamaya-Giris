package bolum07.sorular;

/*
 *  (​Not analizi) Belirsiz sayıda not girişi yapıldığını varsayalım ve girilen notların kaç tanesinin
 * ortalamanın üstünde, kaç tanesinin ortalamaya eşit ve kaç tanesinin ortalamanın altında olduğunu
 * hesaplayalım. Negatif sayı girildiğinde giriş işlemini sonlandırılsın. Girilecek en fazla not sayısının 100
 * olduğunu varsayalım.
 */

import java.util.Scanner;

public class B07S04 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Puanları giriniz:\n negatif sayı girince program biter");
		
		int[] puan = new int[100];
		int sayi;
		int puanSayisi;
		int ortalama;
		
		puanSayisi = ortalama = 0;
		for (int i = 0; i < 100; i++) {
			sayi = girdi.nextInt();
			if(sayi < 0) {
				break;
			}
			
			puan[i] = sayi;
			ortalama += sayi;
			puanSayisi++;
		}
		
		ortalama /= puanSayisi;
		
		int yuksekYadaEsit;
		int dusuk;
		yuksekYadaEsit = dusuk = 0;
		for (int i = 0; i < puanSayisi; i++) {
			if(puan[i] >= ortalama) {
				yuksekYadaEsit++;
			} else {
				dusuk++;
			}
		}
		
		System.out.println("\nPuanların ortalaması: " + ortalama);
		System.out.println("Ortalamadan yüksek ya da ortalamaya eşit puanların sayısı: " + yuksekYadaEsit);
		System.out.println("Ortalamanın altındaki puanların sayısı: " + dusuk);
	}
}
