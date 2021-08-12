package bolum05.sorular;

/*
 * (Yazıyı tersine çevirme) Kullanıcıdan bir yazı alan ve bu yazıyı tersten gösteren bir program yazınız. 
 */

import java.util.Scanner;

public class B05S46 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz: ");
		String kelime = girdi.nextLine();
		
		String ters = "";
		
		for (int i = kelime.length() - 1; i >= 0 ; i--) {
			ters += kelime.charAt(i);
		}
		
		System.out.println("Girdiðiniz kelimenin tersten yazýlýþý: " + ters);
	}
}
