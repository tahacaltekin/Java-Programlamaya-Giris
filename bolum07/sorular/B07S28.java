package bolum07.sorular;

/*
 *  (​Matematik: kombinasyon) Kullanıcıdan 10 tam sayı girmesini isteyen ve bu 10 sayıdan seçilen ikili
 * kombinasyonların tümünü gösteren bir program yazınız. 
 */

import java.util.Scanner;

public class B07S28 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		int[] sayilar = new int[10];
		
		System.out.println("10 tane sayı giriniz: ");
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = girdi.nextInt();
		}
		
		kombinasyonYazdir(sayilar);
	}
	
	public static void kombinasyonYazdir(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if(i != j) {
					System.out.println(dizi[i] + " " + dizi[j]);
				}
			}
		}
	}
}
