package bolum05.sorular;

/*
 *  (Toplama) Madde 5.4 SubtractionQuizLoop.java beş adet rastgele çıkarma sorusu üretmektedir. Programı
 * tekrar düzenleyerek 1​ ve 15​ tam sayıları arasında on tane rastgele toplama sorusu oluşturun. Toplam sayıyı ve test
 * zamanını gösterin
 * 
 */

import java.util.Scanner;

public class B05S02 {

	public static void main(String[] args) {
Scanner girdi = new Scanner(System.in);
		
		long baslangicZamani = System.currentTimeMillis();
		String rapor = "";
		int sayac = 0;
		int dogruSayisi = 0;
		while (sayac < 10) {
			int sayi1 = 1 + (int) (Math.random() * 15);
			int sayi2 = 1 + (int) (Math.random() * 15);

			if (sayi1 < sayi2) {
				int temp = sayi1;

				sayi1 = sayi2;
				sayi2 = temp;
			}

			System.out.println(sayi1 + " - " + sayi2 + " = ?");
			int cevap = girdi.nextInt();

			rapor += sayi1 + " - " + sayi2 + " = " + cevap;
			if (sayi1 - sayi2 == cevap) {
				System.out.println("Doğru Bildiniz.");
				dogruSayisi++;
				rapor += " Doğru\n";
			} else {
				System.out.println("Yanlış Cevap!");
				rapor += " Yanlış\n";
			}
			sayac++;
		}
		long bitisZamani = System.currentTimeMillis();
		int sure = (int)((bitisZamani - baslangicZamani) / 1000);
		
		System.out.println("Toplam Süre: " + sure + " saniye");
		System.out.println(sayac + " tane soru soruldu");
		System.out.println(dogruSayisi + " tane doğru cevap verdiniz.");
		System.out.println(rapor);
	}
}
