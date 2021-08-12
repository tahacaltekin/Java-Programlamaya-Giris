package bolum05.sorular;

/*
 * (En yüksek puaný bulma.) Kullanýcýdan toplam öðrenci sayýsýný  ve her öðrencinin adý ve puanýný alan ve
 * ardýndan en yüksek puana sahip öðrencinin adýný gösteren bir program yazýnýz.
 */

import java.util.Scanner;

public class B05S08 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		
		int enYuksekSkor = 0;
		String enYuksekPuanAlanOgrenci = "";
		
		System.out.println("Öðrenci sayýsýný giriniz: ");
		int ogrenciSayisi = girdi.nextInt();
		
		System.out.println("Öðrenci adýný ve puanýný giriniz: ");
		for (int i = 0; i < ogrenciSayisi; i++) {
			System.out.print(" Öðrenci: " + (i + 1) + 
					"\n Adý: ");
			String isim = girdi.next();
			
			System.out.print(" Puan: ");
			int puan = girdi.nextInt();
			
			if (puan > enYuksekSkor) {
				enYuksekSkor = puan;
				enYuksekPuanAlanOgrenci = isim;
			}
		}
		
		System.out.println("En yüksek puaný alan öðrencinin adý " + enYuksekPuanAlanOgrenci + " puaný: " + enYuksekSkor);
	}
}
