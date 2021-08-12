package bolum03.sorular;

/*
 * ( &&​, || ​ve ^ ​operatörleri) Kullanıcıdan bir tam sayı alan ve bu sayının 5 ve 6 ‘ya tam bölünen, 5 ya
 * da 6 ’ya tam bölünen ve 5 ya da 6 tam bölünen ama her ikisini de aynı anda bölünmeyen koşullarının
 * sonuçlarını gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B03S26 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = girdi.nextInt();
		
		System.out.println(sayi + " sayısı 5 ve 6'ya tam bölünebilir. " + ((sayi % 5 == 0) && (sayi % 6 == 0)));
		
		System.out.println(sayi + " sayısı 5 ya da 6'ya tam bölünebilir. " + ((sayi % 5 == 0) || (sayi % 6 == 0)));
		
		System.out.println(sayi + " sayısı 5 ve ya 6'dan birine tam bölünebilir. " + ((sayi % 5 == 0) ^ (sayi % 6 == 0)));
	}
}
