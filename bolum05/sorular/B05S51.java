package bolum05.sorular;

/*
 * (En uzun ortak başlangıç) Kullanıcıdan iki ayrı yazı alan ve bu iki yazıdaki en uzun ortak başlangıcı bulan
 * bir program yazınız.
 */

import java.util.Scanner;

public class B05S51 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Birinci yazıyı giriniz: ");
		String yazi1 = girdi.nextLine();
		
		System.out.println("İkinci yazıyı giriniz: ");
		String yazi2 = girdi.nextLine();
		
		int index = 0;
		
		String ortak = "";
		
		while (yazi1.charAt(index) == yazi2.charAt(index)) {
			ortak += yazi1.charAt(index);
			index++;
		}
		
		if (ortak.length() > 0) {
			System.out.println("2 yazıdaki ortak kelimeler: " + ortak);
		} else {
			System.out.println(yazi1 + " ve " + yazi2 + " cümlelerinin ortak kelimeleri yoktur.");
		}
	}
}
