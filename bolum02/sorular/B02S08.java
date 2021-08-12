package bolum02.sorular;


/*
 * 8​ (​Şu anki saat) Madde 2.7’deki, ShowCurrentTime.java, dosyasında şu anki saati GMT
 * olarak gösteren bir program bulunmaktadır. Kullanıcıdan GMT ye göre bulunulan zaman
 * dilimini girmesini isteyen ve girilen zaman dilimindeki saati gösterecek şekilde programı
 * yeniden düzenleyiniz.
 */

import java.util.Scanner;

public class B02S08 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bulunduğunuz konumdaki saati öğrenmek için saat dilimi farkını GMT olarak girin: ");
		int saatDilimi = girdi.nextInt();
		
		long toplamMiliSaniye = System.currentTimeMillis();
		
		long toplamSaniye = toplamMiliSaniye / 1000;
		
		long suankiSaniye = toplamSaniye % 60; 
		
		long toplamDakika = toplamSaniye / 60;
		
		long simdikiDakika = toplamDakika % 60;
		
		long toplamSaat = toplamDakika / 60;
		
		long suankiSaat = toplamSaat % 24;
		
		suankiSaat = suankiSaat + saatDilimi;
		
		System.out.println("Şu an ki saat " + suankiSaat + ":" + simdikiDakika + ":" + suankiSaniye + " GMT");
	}

}
