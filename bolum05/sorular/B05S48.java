package bolum05.sorular;

/*
 * (Yaz� i�leme) Kullan�c�dan bir yaz� alan ve tek say� indeksinde yer alan karakterleri g�steren bir program
 * yaz�n�z.
 */

import java.util.Scanner;

public class B05S48 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Herhangi bir yaz� giriniz: ");
		String yazi = girdi.nextLine();
		
		String tekSayiIndexi = "";
		
		for (int i = 0; i < yazi.length(); i+=2) {
			tekSayiIndexi += yazi.charAt(i);
		}
		
		System.out.println(tekSayiIndexi);
	}
}
