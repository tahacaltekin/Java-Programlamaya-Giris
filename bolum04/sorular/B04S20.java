package bolum04.sorular;

/*
 * (string iþleme) Kullanýcýdan bir string alan ve bu stringin uzunluðunu ve ilk karakterini gösteren
 * bir program yazýnýz.
 */

import java.util.Scanner;

public class B04S20 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir string deger giriniz: ");
		String str = girdi.nextLine();
		
		System.out.println("Girilen deðerin uzunluðu " + str.length() + " ve ilk harfi " + str.charAt(0));
	}
}
