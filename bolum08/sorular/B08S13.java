package bolum08.sorular;

/*​En büyük elemanın yeri) İki boyutlu bir dizinin en büyük elemanın indeksini geri döndüren
 * aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * public static int​[] locateLargest(​double​[][] a)
 * 
 * Geri dönüş değeri iki elemanı olan tek boyutlu bir dizidir. Bu iki eleman; iki boyutlu dizinin en büyük
 * elemanın satır ve sütun indekslerini belirtir. Kullanıcıdan iki boyutlu bir dizi alan ve bu dizinin en büyük
 * elemanının satır ve sütun indekslerini gösteren bir test programı yazınız
 */

import java.util.Scanner;

public class B08S13 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Dizinin satır ve sutun sayısını giriniz: ");
		int satir = girdi.nextInt();
		int sutun = girdi.nextInt();
		
		double[][] dizi = new double[satir][sutun];
		
		System.out.println("Diziyi giriniz: ");
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				dizi[i][j] = girdi.nextDouble();
			}
		}
		
		int[] konum = enBuyuguBul(dizi);
		
		System.out.println("En büyük elemanın konumu: (" + konum[0] + ", " + konum[1] + ")");
	}
	
	public static int[] enBuyuguBul(double[][] a) {
		int[] dizi = new int[2];
		dizi[0] = 0;
		dizi[1] = 0;
		double enBuyuk = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > enBuyuk) {
					dizi[0] = i;
					dizi[1] = j;
					enBuyuk = a[i][j];
				}
			}
		}
		return dizi;
	}
}
