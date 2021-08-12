package bolum05.sorular;

/*
 * ​ (En yüksek iki puanı bulunuz.) Kullanıcıdan toplam öğrenci sayısını  ve her öğrencinin adı ve puanını alan ve
 * ardından en yüksek ve en yüksek ikinci puana  sahip öğrencilerin adını ve puanını gösteren bir program yazınız.
 * 
 */

import java.util.Scanner;

public class B05S09 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.println("Öğrenci sayısını giriniz: ");
		int ogrenciSayisi = girdi.nextInt();

		int puan,
			enYuksekPuan = 0,
			enYuksekPuan2 = 0;

		String isim = "",
			ogrenci1 = "",
			ogrenci2 = "";

		System.out.println("Öğrenci adını ve puanını giriniz: ");
		for (int i = 0; i < ogrenciSayisi; i++) {
			System.out.print(" Öğrenci: " + (i + 1) + "\n Adı: ");
			isim = girdi.next();

			System.out.print(" Puan: ");
			puan = girdi.nextInt();

			
			if (i == 0) {
				enYuksekPuan = puan;
				ogrenci1 = isim;
			} else if (i == 1 && puan > enYuksekPuan) {
				enYuksekPuan2 = enYuksekPuan;
				enYuksekPuan = puan;
				ogrenci2 = ogrenci1;
				ogrenci1 = isim;
			} else if (i == 1) {
				enYuksekPuan2 = puan;
				ogrenci2 = isim;
			} else if (i > 1 && puan > enYuksekPuan && puan > enYuksekPuan2) {
				enYuksekPuan2 = enYuksekPuan;
				ogrenci2 = ogrenci1;
				enYuksekPuan = puan;
				ogrenci1 = isim;
			} else if (i > 1 && puan > enYuksekPuan2) {
				ogrenci2 = isim;
				enYuksekPuan2 = puan;
			}
		}
		
		System.out.println("En yüksek puanı alan öğrencinin adı: " + ogrenci1 + " puanı: " + enYuksekPuan + 
				" \nEn yüksek ikinci punanı alan öğrencinin adı: " + ogrenci2 + " puanı: " + enYuksekPuan2);
	}
}
