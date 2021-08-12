package bolum06.sorular;

/*
 * (Palindrome tam sayıl ​ ar) Aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * //Tam sayının basamaklarını tersine çevirir, Ör, reverse(456) geri dönüş değeri 654
 * public static int ​reverse(​int ​number)
 * 
 * // Eğer sayı palindrom ise true döner
 * public static boolean ​isPalindrome(​int ​number)
 * 
 * isPalindrome​ metodunu tanımlamak için ​reverse​ metodunu kullanınız. Eğer basamakları tersine çevrilmiş
 * sayı ile sayının kendisi aynı ise bu sayıya palindrome denir.  Kullanıcıdan bir tam sayı alan ve bu sayının
 * palindrome olup olmadığını gösteren bir test programı yazınız.
 */

import java.util.Scanner;

public class B06S03 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir integer sayı giriniz: ");
		int sayi = girdi.nextInt();
		
		System.out.println(palindromeSayi(sayi) ? " girilen sayı palindrome'dur. " : " Girilen sayı palindrome değildir.");
	}
	
	public static boolean palindromeSayi(int sayi) {
		return sayi == tersineSayi(sayi) ? true : false;
	}
	
	public static int tersineSayi(int sayi) {
		String ters = "";
		String n = sayi + "";
		
		for (int i = n.length() - 1; i >= 0; i--) {
			ters += n.charAt(i);
		}
		
		return Integer.parseInt(ters);
	}
}
