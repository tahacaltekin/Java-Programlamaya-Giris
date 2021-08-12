package bolum08.sorular;

/*(​Cebir: İki matrisin toplamı) İki matrisi toplayan bir metot yazınız. Metot bildirimi aşağıdaki şekildedir;
 * public static double​[][] addMatrix(​double​[][] a, ​double​[][] b)
 * İki matrisin toplanabilmesi için elemanlarının aynı ya da birbiriyle uyumlu türden olması ve aynı boyuta
 * sahip olması gerekir.   ​ ​ ​ ​ ​c ​sonuç matrisi olsun. ​c ij ‘nin her bir elemanı ​aij + ​bij. dir.
 * Kullanıcıdan iki tane 3*3 boyutunda matris alan ve bu matrislerin toplamını gösteren bir program
 * yazınız. Örnek akışı inceleyiniz:
*/

import java.util.Scanner;

public class B08S05 {

	public static void main(String[] args) {
		
		double[][] matris1 = matrisYaz(1);
		double[][] matris2 = matrisYaz(2);
		
		double[][] matris3 = matrisEkle(matris1, matris2);
		
		yazdir(matris1, matris2, matris3);
	}
	
	public static double[][] matrisYaz(int m) {
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Matris giriniz: " + m + ": ");
		
		double[][] matris = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matris[i][j] = girdi.nextDouble();
			}
		}
		
		return matris;
	}
	
	public static double[][] matrisEkle(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}
	
	public static void yazdir(double[][] m, int r) {
		for (int i = 0; i < m[r].length; i++) {
			System.out.print(m[r][i] + " ");
		}
	}
	
	public static void yazdir(double[][] m1, double[][] m2, double[][] m3) {
		System.out.println("Matrisler aşağıdaki gibi eklenir: ");
		
		for (int i = 0; i < 3; i++) {
			yazdir(m1, i);
			System.out.print((i == 1 ? "  +  " : "     "));
			yazdir(m2, i);
			System.out.print((i == 1 ? "  =  " : "     "));
			yazdir(m3, i);
			System.out.println();
		}
	}
}
