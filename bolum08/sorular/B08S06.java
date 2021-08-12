package bolum08.sorular;

/*​(​Cebir: İki matrisin çarpımı) İki matrisi çarpımını hesaplayan bir metot yazınız. Metot bildirimi aşağıdaki şekildedir;
 * public static double​[][] multiplyMatrix(​double​[][] a, ​double​[][] b)
 * a​ matrisinin b matrisi ile çarpılabilmesi için; a matrisinin sütun sayısı,  ​ ​b, matrisinin satır sayısını eşit olmalı
 * ve elemanları aynı ya da birbiriyle uyumlu türlerden olmalıdır. c sonuç matrisi olsun. a matrisinin sütun
 * sayısının ​n​ olduğunu varsayalım. ​cij ‘nin her elemanı ​ai1 * b1j + ai2 * b2j + c + ain * bnj.
 * cij = ​ai1 ​* b1j + ​ai2 ​* b2j + ai ​ 3 ​* b​3j.
 * Kullanıcıdan iki tane 3*3 boyutunda matris alan ve bu matrislerin çarpımını gösteren bir program
 * yazınız. Örnek akışı inceleyiniz: 
 */

import java.util.Scanner;

public class B08S06 {

	public static void main(String[] args) {
		
		
		double[][] matris1 = matrisYaz(1);
		double[][] matris2 = matrisYaz(2);
		
		double[][] matris3 = matrisleriCarp(matris1, matris2);
		
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
		
	public static double[][] matrisleriCarp(double[][] a, double[][] b) {
			double[][] c = new double[3][3];
			
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					for (int h = 0; h < c.length; h++) {
						c[i][j] += a[i][h] * b[h][j];	
					}
				}
			}
			
			return c;
		}
	
	public static void yazdir(double[][] m, int r) {
		for (int i = 0; i < m[r].length; i++) {
			System.out.printf("%5.1f", m[r][i]);
		}
	}
	
	public static void yazdir(double[][] m1, double[][] m2, double[][] m3) {
		System.out.println("Matrisler aşağıdaki gibi eklenir: ");
		
		for (int i = 0; i < 3; i++) {
			yazdir(m1, i);
			System.out.print((i == 1 ? "  *  " : "     "));
			yazdir(m2, i);
			System.out.print((i == 1 ? "  =  " : "     "));
			yazdir(m3, i);
			System.out.println();
		}
	}
}
