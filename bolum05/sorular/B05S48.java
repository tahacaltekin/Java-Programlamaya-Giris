package bolum05.sorular;

/*
 * (Yazý iþleme) Kullanýcýdan bir yazý alan ve tek sayý indeksinde yer alan karakterleri gösteren bir program
 * yazýnýz.
 */

import java.util.Scanner;

public class B05S48 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Herhangi bir yazý giriniz: ");
		String yazi = girdi.nextLine();
		
		String tekSayiIndexi = "";
		
		for (int i = 0; i < yazi.length(); i+=2) {
			tekSayiIndexi += yazi.charAt(i);
		}
		
		System.out.println(tekSayiIndexi);
	}
}
