package bolum05.sorular;

/*
 * (Piramit oluşturma) Kullanıcıdan 1​’den 15​’e kadar bir sayı girmesini isteyiniz ve aşağıda örneği verilen
 * piramidi oluşturacak bir program yazınız.
 */

import java.util.Scanner;

public class B05S17 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("1-15 arası bir sayı giriniz: ");
		int sayi = girdi.nextInt();
		
		for (int satir = 1; satir <= sayi; satir++) {
			
			for (int s = sayi - satir; s >= 1; s--) {
				System.out.print("  ");
			}
			
			for (int l = satir; l >= 2; l--) {
				System.out.print(l + " ");
			}
			
			for (int r = 1; r <= satir; r++) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
		
	}
}
