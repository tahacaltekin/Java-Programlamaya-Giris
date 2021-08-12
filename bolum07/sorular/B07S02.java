package bolum07.sorular;

/*
 * (​Girilen sayıları ters çevir ​ me) On tane tam sayı okuyan ve bu sayıları okuma sırasının tersi sırada
 * gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B07S02 {

	public static void main(String[] args) {
		int[] dizi = new int[10];
		
		System.out.println("10 tane sayı giriniz: ");
		
		doldur(dizi);
		
		
		for (int i = dizi.length - 1; i >= 0 ; i--) {
			System.out.print(dizi[i] + " ");
		}
	}
	
	public static void doldur(int[] dizi) {
		Scanner girdi = new Scanner(System.in);
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = girdi.nextInt();
		}
	}
}
