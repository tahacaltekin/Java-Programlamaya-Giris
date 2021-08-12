package bolum07.sorular;

/*
 * (​Birbirinden farklı sayıları göster) On tane sayı okuyan ve birbirinden farklı sayıları aralarında bir
 * boşluk olacak şekilde gösteren bir program yazınız. (Ör: eğer sayı birçok kez girilmişse bu sayıyı yalnızca
 *  bir kez gösterin) (​İpucu: Okuduğunuz sayı  daha önce girilmedi ise bunu diziye ekleyin. Eğer sayı daha
 * önce diziye eklenmişse,  bunu atlayın.) Giriş işlemi sona erdiğinde dizide sadece farklı sayılar olacaktır. 
 */

import java.util.Scanner;

public class B07S05 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		int[] farkliSayilar = new int[10];
		int sayi;
		int sayac = 0;
		
		System.out.println("10 sayı giriniz: ");
		
		for (int i = 0; i < 10; i++) {
			sayi = girdi.nextInt();
			
			if(farkliMi(farkliSayilar, sayi)) {
				farkliSayilar[sayac] = sayi;
				sayac++;
			}
		}
		
		System.out.println("Farklı sayıların sayısı: " + sayac);
		System.out.print("Farklı sayılar: ");
		for (int i = 0; i < farkliSayilar.length; i++) {
			if(farkliSayilar[i] > 0) {
				System.out.print(" " + farkliSayilar[i]);
			}
		}
		
		System.out.println();
	}
	
	public static boolean farkliMi(int[] dizi, int sayi) {
		for (int i = 0; i < dizi.length; i++) {
			if(sayi == dizi[i]) {
				return false;
			}
		}
		
		return true;
	}
}
