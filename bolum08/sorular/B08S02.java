package bolum08.sorular;
/*
 * (​Diyagonal Toplamı) ​double​ türden değerler tutan  ​n*n  bir matrisin ana diyagonalinde ki değerlerin
	toplamını hesaplayan, aşağıdaki bildirime sahip bir metot yazınız.
	public static double ​sumMajorDiagonal(​double​[][] m)
	4*4 boyutunda bir matrisi okuyan ve ana diyagonalinde ki değerlerin toplamını gösteren bir test
	programı yazınız. Örnek akışı inceleyiniz:
 */

import java.util.Scanner;

public class B08S02 {

	public static void main(String[] args) {
		
		double[][] matris = matrisYaz();
		
		System.out.println("Major Diagonal'in elemanlarının toplamı: " + majorDiagonalToplami(matris));
	}
	
	public static double[][] matrisYaz() {
		Scanner girdi = new Scanner(System.in);
		
		final int SATIR = 4;
		final int SUTUN = 4;
		double [][] m = new double[SATIR][SUTUN];
		
		
		System.out.println("[" + SATIR + "][" + SUTUN  + "] Matrisini satır satır giriniz: " );
		for (int satir = 0; satir < m.length; satir++) {
			for (int sutun = 0; sutun < m[satir].length; sutun++) {
				m[satir][sutun] = girdi.nextDouble();
			}
		}
		
		return m;
	}
	
	public static double majorDiagonalToplami(double[][] m) {
		double toplam = 0;
		for (int i = 0; i < m.length; i++) {
			toplam += m[i][i];
		}
		
		return toplam;
	}
}
