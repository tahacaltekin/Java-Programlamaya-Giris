package bolum07.sorular;

/*
 * (​string’deki karakterleri sıralama) string’leri sıralanmış olarak geri döndüren aşağıdaki bildirime
 * sahip bir metod yazınız.
 * 
 * public static​ String sort(String s)
 * 
 * Örneğin,​ sort(”acb”)​ nin geri dönüş değeri​ abc​.
 * 
 * Kullanıcıdan bir string girmesini isteyen ve bu string’in sıralanmış halini gösteren bir test
 * programı yazınız.
 */

import java.util.Scanner;

public class B07S34 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Bir String giriniz: ");
		String str = girdi.nextLine();
		
		
		System.out.println(sort(str));
	}
	
	public static char[] sort(String s) {
		char[] string = new char[s.length()];
		
		for (int i = 0; i < string.length; i++) {
			string[i] = s.charAt(i);
		}
		
		for (int i = 0; i < string.length - 1; i++) {
			char enKucuk = string[i];
			int enKucukIndeks = i;
			
			for (int j = i + 1; j < string.length; j++) {
				if(enKucuk > string[j]) {
					enKucuk = string[j];
					enKucukIndeks = j;
				}
			}
			
			if(enKucukIndeks != i) {
				string[enKucukIndeks] = string[i];
				string[i] = enKucuk;
			}
		}
		
		return string;
	}
}
