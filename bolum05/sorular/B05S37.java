package bolum05.sorular;

/*
 * (Onluk sayıyı ikilik sayıya dönüştürme) Kullanıcıdan onluk sayı sisteminde bir tam sayı alan ve bunun
 * ikilik sayı sisteminde karşılığını gösteren bir program yazınız. Java’nın Integer.toBinaryString(int)​ metodunu
 * kullanmayınız.
 */

import java.util.Scanner;

public class B05S37 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("İkilik sayı tabanına çevrilmesini istediğiniz bir sayı giriniz: ");
		int sayi = girdi.nextInt();
		
		String binary = "";
		
		for (int i = sayi; i > 0; i /= 2) {
			binary = (i % 2) + binary;
		}
		
		System.out.println("Girdiğiniz sayının " + sayi + " ikilik tabanda karşılığı: " + binary );
	}
}
