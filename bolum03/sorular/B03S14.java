package bolum03.sorular;

/*
 * (Oyun: yaz� tura) Kullan�c�yla yaz��tura tahmin oyunu oynayan bir program yaz�n�z. Program
 * rastgele 0 (tura) ya da 1 (yaz�) de�erlerini �retsin. Kullan�c�dan tahmini al�n�z ve do�ru olup olmad���n�
 * g�steriniz.
 */

import java.util.Scanner;

public class B03S14 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Yaz� tura tahmini i�in 0 (tura) ya da 1 (yaz�) giriniz:");
		int tahmin = girdi.nextInt();
		
		int sayi = (int)(Math.random() * 2);
		System.out.println(sayi);
		
		if (sayi == tahmin) {
			System.out.println("Tebrikler bildiniz.");
		} else {
			System.out.println("�zg�n�z cevab�n�z do�ru de�il. Do�ru cevap: " + sayi);
		}
	}
}
