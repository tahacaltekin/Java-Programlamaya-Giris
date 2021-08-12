package bolum08.sorular;

/*
 *  ​(​Desen tanıma: ardışık aynı dört sayı) İki boyutlu bir dizide aynı değere sahip ardışık dört sayıyı,
 * satır, sütun ve diyagonal olarak kontrol eden aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * 
 * public static boolean ​isConsecutiveFour(​int​[][] values)
 * 
 * 
 * Kullanıcıdan, iki boyutlu dizinin satır, sütun sayısını ve değerleri alan, eğer bu dizide ardışık aynı dört
 * sayı varsa ekrana true yazan bir test programı yazınız. Aksi takdirde ekranda false gösterilecek. Aşağıda
 * örnekleri inceleyiniz:
 * 
 *  0 1 0 3 1 6 1    *    0 1 0 3 1 6 1    *   0 1 0 3 1 6 1    *   0 1 0 3 1 6 1
 *  0 1 6 8 6 0 1    *    0 1 6 8 6 0 1    *   0 1 6 8 6 0 1    *   0 1 6 8 6 0 1
 *  9 6 2 1 8 2 9    *    5 6 2 1 8 2 9    *   5 5 2 1 8 2 9    *   5 6 2 1 6 2 9
 *  6 9 6 1 1 9 1    *    6 5 6 1 1 9 1    *   6 5 6 1 1 9 1    *   6 5 6 6 1 9 1
 *  1 3 9 1 4 0 7    *    1 3 6 1 4 0 7    *   1 5 6 1 4 0 7    *   1 3 6 1 4 0 7
 *  3 3 3 9 4 0 7    *    3 3 3 3 4 0 7    *   3 5 3 3 4 0 7    *   3 6 3 3 4 0 7
 */

import java.util.Scanner;

public class B08S19 {

	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Matrisin satır ve sütun sayılarını giriniz: ");
		int satirlar = girdi.nextInt();
		int sutunlar = girdi.nextInt();
		
		System.out.println("Matrisi satır satır giriniz: ");
		int[][] matris = matrisAl(girdi, satirlar, sutunlar);
		
		matrisYazdir(matris);
		
		if (ardisikDortluMu(matris)) {
			System.out.println("Bu matriste ardışık olarak 4 aynı sayı vardır.");
		} else {
			System.out.println("Bu matriste ardışık olarak 4 aynı sayı yoktur.");
		}
	}
	
	public static boolean ardisikDortluMu(int[][] degerler) {
		// dikey kontrol
			for (int i = 0; i < degerler.length; i++) {
				for (int j = 0; j < degerler[i].length - 3; j++) {
					if(degerler[i][j] == degerler[i][j + 1] && 
							degerler[i][j + 1] == degerler[i][j + 2] && 
							degerler[i][j + 2] == degerler[i][j + 3])
						return true;
				}
			}
		// yatay kontrol
		for (int i = 0; i < degerler.length - 3; i++) {
			for (int j = 0; j < degerler[i].length; j++) {
				if(degerler[i][j] == degerler[i + 1][j] && 
						degerler[i + 1][j] == degerler[i + 2][j] && 
						degerler[i + 2][j] == degerler[i + 3][j])
					return true;
			}
		}
		//capraz kontrol
		for (int i = 0; i < degerler.length - 3; i++) {
			for (int j = 0; j < degerler[i].length - 3; j++) {
				if(degerler[i][j] == degerler[i + 1][j + 1] && 
						degerler[i + 1][j + 1] == degerler[i + 2][j + 2] && 
						degerler[i + 2][j + 2] == degerler[i + 3][j + 3])
					return true;
			}
		}
		// alt köşegen kontrol
		for (int i = degerler.length - 1; i >= 3; i++) {
			for (int j = 0; j < degerler[i].length - 3; j++) {
				if(degerler[i][j] == degerler[i - 1][j + 1] && 
						degerler[i - 1][j + 1] == degerler[i - 2][j + 2] && 
						degerler[i - 2][j + 2] == degerler[i - 3][j + 3])
					return true;
			}
		}
		
		return false;
	}
	
	public static int[][] matrisAl(Scanner girdi, int satir, int sutun) {
		int[][] sayilar = new int[satir][sutun];
		int satirSayaci = 0;
		int sutunSayaci = 0;
		
		while(true) {
			if (girdi.hasNextInt()) {
				sayilar[satirSayaci][sutunSayaci] = girdi.nextInt();
				sutunSayaci++;
				if(sutunSayaci >= sutun) {
					satirSayaci++;
					sutunSayaci = 0;
					if (satirSayaci >= satir) {
						break;
					}
				}
			} else {
				girdi.next();
			}
		}
		
		return sayilar;
	}
	
	public static void matrisYazdir(int[][] matris) {
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
	}
}
