package bolum04.sorular;

/*
 * (string i�leme) Kullan�c�dan bir string alan ve bu stringin uzunlu�unu ve ilk karakterini g�steren
 * bir program yaz�n�z.
 */

import java.util.Scanner;

public class B04S20 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir string deger giriniz: ");
		String str = girdi.nextLine();
		
		System.out.println("Girilen de�erin uzunlu�u " + str.length() + " ve ilk harfi " + str.charAt(0));
	}
}
