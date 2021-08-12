package bolum05.sorular;

/*
 * (Sesli ve sessiz harfleri say�n) A, E, I, O, ve U harflerinin sesli harf olarak kabul edin. Kullan�c�dan bir yaz�
 * girmesini isteyin ve girilen stringdeki sesli ve sessiz harf say�s�n� g�steren bir program yaz�n�z.
 */

import java.util.Scanner;

public class B05S49 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir yaz� giriniz: ");
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
						Character.toUpperCase(yazi.charAt(i)) == '�' ||
						Character.toUpperCase(yazi.charAt(i)) == '�' ||
						Character.toUpperCase(yazi.charAt(i)) == '�') {
					sesliHarfler++;
				} else {
					sessizHarfler++;
				}
			}
		}
		
		System.out.println("Girilen yaz�da ki sesli harf say�s�: " + sesliHarfler);
		System.out.println("Girilen yaz�da ki sessiz harf say�s�: " + sessizHarfler);
	}
}
