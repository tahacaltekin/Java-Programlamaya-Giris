package bolum08.sorular;

/*
 *  ​(​Oyun: tersine çevrilen elemanı bul)6x6 büyüklüğünde iki boyutlu 0 ve 1 değerlerinden oluşan
 *  bir matris olsun. Her satır ve sütunda çift sayıda 1 değeri olsun. Kullanıcı bir elemanı tersine çevirsin
 *  (1’i 0, 0’ı bir yapsın). Tersine çevrilen elemanı bulan bir program yazınız. Kullanıcıdan 6x6 büyüklüğünde 
 *  0 ve 1’den oluşan bir matris alan ve çift sayıda 1 kuralının bozulduğu ilk satır (r) ve ilk sütun (c) olmak
 *  üzere bulan bir program yazınız. Tersine çevrilmiş eleman (r, c) ‘dir.
 */

import java.util.Scanner;

public class B08S23 {

	public static void main(String[] args) {
		System.out.println("6X6 büyüklüğünde bir matris giriniz: ");
		int[][] matris = matrisAl();
		
		int satir = tekSatirBirler(matris);
		int sutun = tekSutunBirler(matris);
		
		if (satir < 0 || sutun < 0) {
			System.out.println("Tersine Çevirilen bir hücre yok.");
		} else {
			System.out.println("Tersine çevirilen hücre (" + satir + ", " + sutun + ")");
		}
	}
	
	public static int[][] matrisAl() {
		
		Scanner girdi = new Scanner(System.in);
		
		int[][] m = new int[6][6];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = girdi.nextInt();
			}
		}
		
		return m;
	}
	
	public static int tekSatirBirler(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int sayac = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1) {
					sayac++;
				}
			}
			
			if (sayac % 2 != 0) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static int tekSutunBirler(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int sayac = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == 1) {
					sayac++;
				}
			}
			
			if (sayac % 2 != 0) {
				return i;
			}
		}
		
		return -1;
	}
}
