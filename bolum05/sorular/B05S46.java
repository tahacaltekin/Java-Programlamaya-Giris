package bolum05.sorular;

/*
 * (Yaz�y� tersine �evirme) Kullan�c�dan bir yaz� alan ve bu yaz�y� tersten g�steren bir program yaz�n�z. 
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
		
		System.out.println("Girdi�iniz kelimenin tersten yaz�l���: " + ters);
	}
}
