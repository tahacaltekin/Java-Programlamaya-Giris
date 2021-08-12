package bolum05.sorular;

/*
 * (Negatif ve pozitif sayıları sayma ve sayıların ortalamasını hesaplama)  Kullanıcının istediği kadar tam sayı
 * girebileceği, girilen sayıların kaç tanesi negatif, kaç tanesi pozitif , toplamı ve ortalamasını hesaplayan bir program
 * yazınız . Eğer 0​ değeri girilirse program sonlanacaktır. Ortalama değerini gerçek sayı olarak gösteriniz.
 */

import java.util.Scanner;

public class B05S01 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		double toplam = 0;
		int sayacNegatif = 0;
		int sayacPozitif = 0;
		int sayac = 0;
		
		System.out.println("Toplanacak sayıları giriniz (çıkış için 0 giriniz): ");
		int sayi = girdi.nextInt();

		if (sayi == 0) {
			System.out.println("0 dışında bir sayı girilmedi.");
			System.exit(1);
		}

		while (sayi != 0) {
			if (sayi < 0) {
				sayacNegatif++;
			} else if (sayi > 0) {
				sayacPozitif++;
			}
			toplam += sayi;
			sayac++;
			sayi = girdi.nextInt();
		}
		
		double ortalama = toplam / sayac;
		
		System.out.println(
				"Girilen Pozitif sayısı: " + sayacPozitif +
				"\nGirilen Negatif sayısı: " + sayacNegatif +
				"\nToplam: " + toplam +
				"\nOrtalama: " + ortalama);
	}
}
