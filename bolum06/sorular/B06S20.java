package bolum06.sorular;

/*
 *  ​(Yazıdaki harf sayısı) Aşağıdaki bildirime sahip ve bir yazıdaki harfleri sayan bir metot yazınız.
 * 
 * public static int ​countLetters(String s)
 * 
 * Kullanıcıdan bir yazı girmesini isteyen ve bu yazıdaki harf sayısını gösteren bir test programı yazınız. 
 */

import java.util.Scanner;

public class B06S20 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir yazı giriniz: ");
		String string = girdi.nextLine();
		
		System.out.println("Girilen yazı: " + string +  "\nharf sayısı: " + harfSayaci(string));
	}
	
	public static int harfSayaci(String n) {
		int harfSayisi = 0;
		
		for (int i = 0; i < n.length(); i++) {
			
			if(Character.isLetter(n.charAt(i))) {
				harfSayisi++;
			}
		}
		
		return harfSayisi;

	}
}
