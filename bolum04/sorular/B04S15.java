package bolum04.sorular;

/*
 * (Telefon tu� tak�m�) Telefon tu�lar�nda kullan�lan Uluslararas� harf/say� kar��l�klar� standard�
 * a�a��da g�sterilmi�tir.
 * 
 * Kullan�c�dan bir harf alan ve ona kar��l�k gelen rakam� g�steren bir program yaz�n�z.
 */
import java.util.Scanner;

public class B04S15 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir harf giriniz: ");
		String harf = girdi.nextLine();
		char ch = harf.charAt(0);
		ch = Character.toUpperCase(ch);
		
		int sayi = 0;
		
		if (Character.isLetter(ch)) {
			if (ch >= 'W') 
				sayi = 9;
			 else if (ch >= 'T') 
				sayi = 8;
			 else if (ch >= 'P') 
				sayi = 7;
			 else if (ch >= 'M') 
				sayi = 6;
			 else if (ch >= 'J') 
				sayi = 5;
			 else if (ch >= 'G') 
				sayi = 4;
			 else if (ch >= 'D') 
				sayi = 3;
			 else if (ch >= 'A') 
				sayi = 2;
				System.out.println(ch + " harfine kar��l�k gelen say� " + sayi);
			 
		} else {
			System.out.println(ch + " hatal� de�er!");
		}
		
	}
}
