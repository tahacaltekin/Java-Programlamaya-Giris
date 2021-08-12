package bolum04.sorular;

/*
 * (Harfsel notun, sayýsal karþýlýðý) Kullanýcýnýn harf olarak (A, B, C, D, ya da F) girdiði notun
 * sayýsal (4, 3, 2, 1, ya da 0) karþýlýðýný gösteren bir program yazýnýz. 
 */

import java.util.Scanner;

public class B04S14 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Harf notunuzu giriniz: ");
		String harf = girdi.nextLine();
		char ch = harf.charAt(0);
		
		ch = Character.toUpperCase(ch);
		
		if (ch >= 'A' && ch <= 'F' && ch != 'E') {
			System.out.println("Girilen harfin sayýsal karþýlýðý ");
			
			switch (ch) {
			case 'A': System.out.println(4); break;
			case 'B': System.out.println(3); break;
			case 'C': System.out.println(2); break;
			case 'D': System.out.println(1); break;
			case 'F': System.out.println(0); break;
			}
		} else {
			System.out.println("Hatalý deðer girdiniz!");
		}
	} 
}
