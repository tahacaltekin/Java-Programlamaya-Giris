package bolum04.sorular;

/*
 * (substring mi?) Kullan�c�dan iki string alan ve girilen ikinci stringin birincinin substringi olup
 * olmad���n� kontrol eden bir program yaz�n�z
 */

import java.util.Scanner;

public class B04S22 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir String de�er giriniz: ");
		String s1 = girdi.nextLine();
		System.out.println("�kinci string de�eri giriniz: ");
		String s2 = girdi.nextLine();
		
		System.out.println(s2 + " " + s1 + " kelimesinin " + ((s1.contains(s2)) ? "i�inde vard�r." : "i�inde yoktur"));
	}
}
