package bolum05.sorular;

/*
 * (Onluk sayıyı sekizlik sayıya dönüştürme) Kullanıcıdan onluk sayı sisteminde bir tam sayı alan ve bunun
 * sekizlik sayı sisteminde karşılığını gösteren bir program yazınız. Java’nın Integer.toOctalString(int)​ metodunu
 * kullanmayınız. 
 */

import java.util.Scanner;

public class B05S38 {

	public static void main(String[] args) {
Scanner girdi = new Scanner(System.in);
		
		System.out.println("Sekizlik sayı tabanına çevrilmesini istediğiniz bir sayı giriniz: ");
		int sayi = girdi.nextInt();
		
		String sekizlikTaban = "";
		
		for (int i = sayi; i > 0; i /= 8) {
			sekizlikTaban = (i % 8) + sekizlikTaban;
		}
		
		
		System.out.println("Girdiğiniz sayının " + sayi + " sekizlik tabanda karşılığı: " + sekizlikTaban );
	}
}
