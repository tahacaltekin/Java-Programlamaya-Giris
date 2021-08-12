package bolum04.sorular;

/*
 * (substring mi?) Kullanýcýdan iki string alan ve girilen ikinci stringin birincinin substringi olup
 * olmadýðýný kontrol eden bir program yazýnýz
 */

import java.util.Scanner;

public class B04S22 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir String deðer giriniz: ");
		String s1 = girdi.nextLine();
		System.out.println("Ýkinci string deðeri giriniz: ");
		String s2 = girdi.nextLine();
		
		System.out.println(s2 + " " + s1 + " kelimesinin " + ((s1.contains(s2)) ? "içinde vardýr." : "içinde yoktur"));
	}
}
