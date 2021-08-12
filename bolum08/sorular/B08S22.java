package bolum08.sorular;

/*
 * (​Çift sayıda 1)6x6 büyüklüğünde iki boyutlu 0 ve 1 değerlerinden oluşan bir matrisin satır ve
 * sütunlerında çift sayıda 1 olup olmadığını kontrol eden bir program yazınız.
 */

public class B08S22 {

	public static void main(String[] args) {
		
		int[][] matris = new int[6][6];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j] = (int)(Math.random() * 2);
				System.out.print(matris[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("Bütün satırlarda ki" + (birlerCiftSatirdaMi(matris) ? " 1'ler Çift sayıdadır." : " 1'ler Çift sayıda değildir."));
		
		System.out.println("Bütün sutunlarda ki" + (birlerCiftSutundaMi(matris) ? " 1'ler Çift sayıdadır." : " 1'ler Çift sayıda değildir."));
	}
	
	
	public static boolean birlerCiftSatirdaMi(int[][] m) {
		int sayac = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1) {
					sayac++;
				}
			}
			if (sayac % 2 != 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean birlerCiftSutundaMi(int[][] m) {
		int sayac = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == 1) {
					sayac++;
				}
			}
			
			if (sayac % 2 != 0) {
				return false;
			}
		}
		
		return true;
	}
}
