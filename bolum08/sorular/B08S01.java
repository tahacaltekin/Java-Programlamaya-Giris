package bolum08.sorular;
/*
 * (​Sütun Toplamı) Aşağıdaki bildirime sahip, bir matrisin verilen sütunlarındaki değerlerin
	toplamını hesaplayan bir metot yazınız:
	public static double ​sumColumn(​double​[][] m, ​int ​columnIndex)
	3X4 bir matrisi okuyan her bir kolonun toplamını gösteren bir test programı yazınız.
 */

import java.util.Scanner;

public class B08S01 {

	public static void main(String[] args) {
		
		double[][] matris = matrisYaz();
		
		for (int sutun = 0; sutun < matris[0].length; sutun++) {
			System.out.println("Matrisin " + (sutun + 1) + ". sutununda ki elemanların toplamı: " + sutunToplami(matris, sutun));
		}
	}
	
	public static double[][] matrisYaz() {
		Scanner girdi = new Scanner(System.in);
		
		final int SATIR = 3;
		final int SUTUN = 4;
		double[][] m = new double[SATIR][SUTUN];
		
		System.out.println("[" + SATIR + "][" + SUTUN  + "] Matrisini satır satır giriniz: " );
		for (int satir = 0; satir < m.length; satir++) {
			for (int sutun = 0; sutun < m[satir].length; sutun++) {
				m[satir][sutun] = girdi.nextDouble();
			}
		}
		
		return m;
	}
	
	public static double sutunToplami(double[][] m, int sutunIndeks) {
		double toplam = 0;
		for (int satir = 0; satir < m.length; satir++) {
			toplam += m[satir][sutunIndeks];
		}
		
		return toplam;
	}
}
