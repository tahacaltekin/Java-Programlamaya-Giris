package bolum08.sorular;

/*
 * (​Satır sıralama) İki boyutlu bir dizinin satır elemanlarını sıralayan aşağıdaki bildirime sahip bir
 * metot yazınız. Ana dizi değişmeden kalacak, metot yeni diziyi geri döndürecek.
 * 
 * public static double​[][] sortRows(​double​[][] m)
 * 
 * Kullanıcıdan 3*3 boyutunda bir matrisin elemanlarını alan ve satırları sıralanmış diziyi gösteren bir
 * program yazınız.
 */

import java.util.Scanner;

public class B08S26 {

	public static void main(String[] args) {
		
		double[][] matris = matrisAl();
		
		double[][] matrisSirala = satirlariSirala(matris);
		
		System.out.println("Satirlari sıralanmış dizi: ");
		
		for (int i = 0; i < matrisSirala.length; i++) {
			for (int j = 0; j < matrisSirala.length; j++) {
				System.out.print(matrisSirala[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	
	
	public static double[][] matrisAl() {
		Scanner girdi = new Scanner(System.in);
		
		double[][] m = new double[3][3];
		
		System.out.println("3X3 büyüklüğünde bir matris giriniz: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = girdi.nextDouble();
			}
		}
		return m;
	}
	
	public static double[][] satirlariSirala(double[][] m) {
		
		double[][] d = new double[m.length][m[0].length];
		
		matrisiKopyala(m, d);
		
		for (int satir = 0; satir < d.length; satir++) {
			for (int sutun = 0; sutun < d.length - 1; sutun++) {
				
				double enKucuk = d[satir][sutun];
				int indeks = sutun;
				for (int i = sutun + 1; i < d.length; i++) {
					if (enKucuk > d[satir][i]) {
						enKucuk = d[satir][i];
						indeks = i;
					}
				}
				
				if (indeks != sutun) {
					d[satir][indeks] = d[satir][sutun];
					d[satir][sutun] = enKucuk;
				}
			}
		}
		
		return d;
	}
	
	public static void matrisiKopyala(double[][] orijinalMatris, double[][] kopya) {
		for (int i = 0; i < orijinalMatris.length; i++) {
			for (int j = 0; j < orijinalMatris[i].length; j++) {
				kopya[i][j] = orijinalMatris[i][j];
			}
		}
	}
}
