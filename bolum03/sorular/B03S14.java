package bolum03.sorular;

/*
 * (Oyun: yazý tura) Kullanýcýyla yazý­tura tahmin oyunu oynayan bir program yazýnýz. Program
 * rastgele 0 (tura) ya da 1 (yazý) deðerlerini üretsin. Kullanýcýdan tahmini alýnýz ve doðru olup olmadýðýný
 * gösteriniz.
 */

import java.util.Scanner;

public class B03S14 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Yazý tura tahmini için 0 (tura) ya da 1 (yazý) giriniz:");
		int tahmin = girdi.nextInt();
		
		int sayi = (int)(Math.random() * 2);
		System.out.println(sayi);
		
		if (sayi == tahmin) {
			System.out.println("Tebrikler bildiniz.");
		} else {
			System.out.println("Üzgünüz cevabýnýz doðru deðil. Doðru cevap: " + sayi);
		}
	}
}
