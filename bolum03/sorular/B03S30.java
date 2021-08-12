package bolum03.sorular;

/*
 * (su anki saat) Programlama Sorulari 2.8 yeniden düzenleyerek su anki zamani 12 dilimli saat kullanarak gösterin.
 */

import java.util.Scanner;

public class B03S30 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bulunduðunuz konumdaki saati öðrenmek için saat dilimi farkýný GMT olarak girin: ");
		int saatDilimi = girdi.nextInt();
		
		long toplamMiliSaniye = System.currentTimeMillis();
		
		long toplamSaniye = toplamMiliSaniye / 1000;
		
		long suankiSaniye = toplamSaniye % 60; 
		
		long toplamDakika = toplamSaniye / 60;
		
		long simdikiDakika = toplamDakika % 60;
		
		long toplamSaat = toplamDakika / 60;
		
		long suankiSaat = toplamSaat % 24;
		
		suankiSaat = suankiSaat + saatDilimi;
		
		System.out.println("su an ki saat " + ((suankiSaat > 12) ? suankiSaat - 12 : suankiSaat) + ":" + simdikiDakika + ":" + suankiSaniye + ((suankiSaat > 12) ? " PM" : " AM"));
	}
}
