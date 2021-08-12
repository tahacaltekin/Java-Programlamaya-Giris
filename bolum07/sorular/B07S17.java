package bolum07.sorular;

/*
 * ​ (​Öğrencileri sıralama) Kullanıcıdan öğrenci sayısını ve bu öğrencilerin ad ve not bilgisini alan ve
 * notlarına göre azalan şekilde sıralayıp gösteren bir program yazınız. 
 */

import java.util.Scanner;

public class B07S17 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Öğrenci sayısını giriniz: ");
		String[] ogrenciler = new String[girdi.nextInt()];
		int[] puanlar = new int[ogrenciler.length];
		
		System.out.println("Her öğrencinin adını ve puanını giriniz: ");
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.print("Öğrenci " + (i + 1) + ": ");
			ogrenciler[i] = girdi.next();
			System.out.println("Puan: ");
			puanlar[i] = girdi.nextInt();
		}
		
		azalanSira(ogrenciler, puanlar);
		
		
		for (String j : ogrenciler) {
			System.out.println(j);
		}
	}
	
	public static void azalanSira(String[] ogr, int[] sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			int enBuyuk = sayilar[i];
			int enBuyukIndeks = i;
			String gecici;
			
			for (int j = i + 1; j < sayilar.length; j++) {
				if(sayilar[j] > enBuyuk) {
					enBuyuk = sayilar[j];
					enBuyukIndeks = j;
				}
			}
			
			if (enBuyukIndeks != 1) {
				gecici = ogr[i];
				ogr[i] = ogr[enBuyukIndeks];
				ogr[enBuyukIndeks] = gecici;
				
				sayilar[enBuyukIndeks] = sayilar[i];
				sayilar[i] = enBuyuk;
			}
		}
	}
}
