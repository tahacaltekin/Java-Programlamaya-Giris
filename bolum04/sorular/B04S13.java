package bolum04.sorular;

/*
 * (Sesli harf mi, sesiz harf mi?) Kullanýcýdan bir harf girmesini isteyen ve bu harfin sesli harf mi
 * sessiz harf mi olduðunu gösteren bir program yazýnýz.
 */

import java.util.Scanner;

public class B04S13 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir harf giriniz: ");
		String harf = girdi.nextLine();
		char ch = harf.charAt(0);
		
		if (Character.isLetter(ch)) {
			switch (Character.toUpperCase(ch)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': System.out.println(ch + " Sesli harftir."); 
				break;

			default: System.out.println(ch + " Sessiz harftir");
			}
		} else {
			System.out.println("Hatalý deðer girdiniz!");
		}
	}
}
