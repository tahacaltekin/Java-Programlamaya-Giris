package bolum08.sorular;


/*
 * (​Bire bir eşit diziler) İki boyutlu ​m1 ​ve ​m2 ​dizilerinin karşılıklı elemanları birebir eşitse bu dizilere
 * bire bir eşit dizler denir. ​m1​ ve ​m2​ dizileri birbirine bire bir eşitse ​true​ dönen aşağıdaki bildirime sahip bir
 * metot yazınız.
 * 
 * public static boolean ​equals(​int​[][] m1, ​int​[][] m2)
 * 
 * Kullanıcıdan 3*3 boyutunda iki matrisin de elemanlarını alan ve bu dizilerin bire bir eşit olup olmadığını
 * gösteren bir program yazınız
 */

import java.util.Scanner;

public class B08S28 {

	public static void main(String[] args) {
		
		System.out.print("Birinci diziyi giriniz: ");
		int[][] dizi1 = diziAl();
		System.out.print("İkinci Diziyi giriniz: ");
		int[][] dizi2 = diziAl();
		
		
		System.out.println("İki dizi birbirine" + (esitMi(dizi1, dizi2) ? " eşittir." : " eşit değildir."));
	}
	
	public static boolean esitMi(int[][] m1, int[][] m2) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int[][] diziAl() {
		Scanner girdi = new Scanner(System.in);
		
		int[][] m = new int[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = girdi.nextInt();
			}
		}
		
		return m;
	}
}
