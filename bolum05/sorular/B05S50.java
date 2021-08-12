package bolum05.sorular;

/*
 * (Büyük harfleri sayma) Kullanýcýdan bir yazý alan ve bu yazýdaki büyük harf sayýsýný gösteren bir program
 * yazýnýz. 
 */

import java.util.Scanner;

public class B05S50 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir cümle giriniz: ");
		String yazi = girdi.nextLine();
		
		int sayac = 0;
		for (int i = 0; i < yazi.length(); i++) {
			if (Character.isUpperCase(yazi.charAt(i))) {
				sayac++;
			}
		}
		
		System.out.println("Cümledeki büyük harf sayýsý: " + sayac);
	}
}
