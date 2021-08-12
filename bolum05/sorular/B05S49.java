package bolum05.sorular;

/*
 * (Sesli ve sessiz harfleri sayýn) A, E, I, O, ve U harflerinin sesli harf olarak kabul edin. Kullanýcýdan bir yazý
 * girmesini isteyin ve girilen stringdeki sesli ve sessiz harf sayýsýný gösteren bir program yazýnýz.
 */

import java.util.Scanner;

public class B05S49 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir yazý giriniz: ");
		String yazi = girdi.nextLine();
		
		int sesliHarfler = 0;
		int sessizHarfler = 0;
		
		for (int i = 0; i < yazi.length(); i++) {
			if (Character.isLetter(yazi.charAt(i))) {
				if (Character.toUpperCase(yazi.charAt(i)) == 'A' ||
						Character.toUpperCase(yazi.charAt(i)) == 'E' ||
						Character.toUpperCase(yazi.charAt(i)) == 'I' ||
						Character.toUpperCase(yazi.charAt(i)) == 'O' ||
						Character.toUpperCase(yazi.charAt(i)) == 'U' ||
						Character.toUpperCase(yazi.charAt(i)) == 'Ü' ||
						Character.toUpperCase(yazi.charAt(i)) == 'Ö' ||
						Character.toUpperCase(yazi.charAt(i)) == 'Ý') {
					sesliHarfler++;
				} else {
					sessizHarfler++;
				}
			}
		}
		
		System.out.println("Girilen yazýda ki sesli harf sayýsý: " + sesliHarfler);
		System.out.println("Girilen yazýda ki sessiz harf sayýsý: " + sessizHarfler);
	}
}
