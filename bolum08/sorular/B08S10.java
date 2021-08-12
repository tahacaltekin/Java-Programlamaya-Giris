package bolum08.sorular;
/*
 * ​(​En büyük satır ve sütun) 4*4 boyutunda bir matrisin elemanlarına  rastgele 0 ya da 1 değerleri
 * atayıp matrisi ekranda gösteren ve en fazla 1 elemanına sahip ilk satırın ve ilk sütunun indeksini gösteren
 * bir program yazınız. Programın örnek akışını inceleyiniz:
 * 0011
 * 0011
 * 1101
 * 1010
 * En büyük satır indeksi: 2
 * En büyük sütun indeksi: 2
 */

public class B08S10 {
	
	public static void main(String[] args) {
		
		int[][] matris = new int[4][4];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j] = (int)(Math.random() * 2);
			}
		}
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				System.out.print(matris[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println("En büyük satır indeksi: " + enBuyukSatirIndeksi(matris));
		System.out.println("En büyük sutun indeksi: " + enBuyukSutunIndeksi(matris));
	}
	
	public static int enBuyukSatirIndeksi(int[][] m) {
		int enBuyukSatirIndeks = 0;
		int enBuyuk = 0;
		 for (int satir = 0; satir < m.length; satir++) {
			int sayac = 0;
			for (int sutun = 0; sutun < m[satir].length; sutun++) {
				if (m[satir][sutun] == 1) {
					sayac++;
				}
			}
			
			if (sayac > enBuyuk) {
				enBuyuk = sayac;
				enBuyukSatirIndeks = satir;
			}
		}
		 
		 return enBuyukSatirIndeks;
	}

	
	public static int enBuyukSutunIndeksi(int[][] m) {
		int enBuyukSutunIndeks = 0;
		int EnBuyuk = 0;
		for (int sutun = 0; sutun < m.length; sutun++) {
			int sayac = 0;
			for (int satir = 0; satir < m.length; satir++) {
				if (m[satir][sutun] == 1) {
					sayac++;
				}
			}
			
			if (sayac > EnBuyuk) {
				EnBuyuk = sayac;
				enBuyukSutunIndeks = sutun;
			}
		}
		
		return enBuyukSutunIndeks;
	}
}
