package bolum08.sorular;

/*
 * (​Oyun: dokuz yazı ve tura) 3*3 matrisin elemanları yazı ya da tura değerini saklasın. Bu 3*3
 * boyutlu matriste yazı ​0​ ve tura ​1​ ile temsil edilsin. Aşağıda örnekleri inceleyiniz.
 * 
 * 
 * 0 0 0 1 0 1 1 1 0 1 0 1 1 0 0
 * 0 1 0 0 0 1 1 0 0 1 1 0 1 1 1
 * 0 0 0 1 0 0 0 0 1 1 0 0 1 1 0
 * 
 * Her bir matrisin durumu ikilik bir sayı ile de temsil edilebilir. Yukarıdaki matrisler aşağıdaki ikilik
 * sayılara karşılık gelir.
 * 
 * 000010000 101001100 110100001 101110100 100111110
 * 
 * Toplam 512 tane olasılık bulunmaktadır ,  0, 1, 2, 3, . . . , and 511 sayılarını kullanarak matrisin her bir
 * durumunu gösterebilirsiniz. Kullanıcıdan 0 ile 511 aralığında bir sayı alan ve buna karşılk gelen matrisi
 * Y ve ​T​ karakterleri ile gösteren bir program yazınız.
 * Kullanıcı 7 girdiğinde bu ​000000111​ temsil eder. ​0​, ​Y ve ​1​, ​T​ anlamına geldiği için, sonuç doğrudur.
 * 
 */

import java.util.Scanner;

public class B08S11 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("1 ile 511 arasında bir sayı giriniz: ");
		
		int sayi = girdi.nextInt();
		
		char[][] matris = matrisOlustur(sayi);
		
		matrisYazdir(matris);
	}
	
	public static char[][] matrisOlustur(int sayi) {
		char[][] matris = new char[3][3];
		
		for (int i = 2; i >= 0; i--) {
			for (int j = 2; j >= 0; j--) {
				matris[i][j] = sayi % 2 == 1 ? 'Y' : 'T';
				sayi /= 2;
			}
		}
		
		return matris;
	}
	
	public static void matrisYazdir(char[][] matris) {
		for (char[] ch : matris) {
			for (char cs : ch) {
				System.out.print(cs + " ");
			}
			
			System.out.println();
		}
	}
}
