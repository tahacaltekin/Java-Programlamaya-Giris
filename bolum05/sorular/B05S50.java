package bolum05.sorular;

/*
 * (B�y�k harfleri sayma) Kullan�c�dan bir yaz� alan ve bu yaz�daki b�y�k harf say�s�n� g�steren bir program
 * yaz�n�z. 
 */

import java.util.Scanner;

public class B05S50 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir c�mle giriniz: ");
		String yazi = girdi.nextLine();
		
		int sayac = 0;
		for (int i = 0; i < yazi.length(); i++) {
			if (Character.isUpperCase(yazi.charAt(i))) {
				sayac++;
			}
		}
		
		System.out.println("C�mledeki b�y�k harf say�s�: " + sayac);
	}
}
