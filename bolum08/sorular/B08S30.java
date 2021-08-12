package bolum08.sorular;

/*
 * ​(​Cebir: doğrusal denklem çözümü) 2 bilinmeyenli doğrusal denklem sistemini çözen bir metot yazınız.
 *  
 * Metot bildirimi:
 * 
 * public static double​[] linearEquation(​double​[][] a, ​double​[] b)
 * 
 * Eğer ​a00​a11 ​­ ​a01​a10  ​‘ın değeri ​0​.ise metodun geri dönüş değeri ​null​ ‘dır.
 * ​Kullanıcıdan a​ 00​, ​a01​, ​a10​, ​a11​, ​b0​, ve ​b1 eğerlerini alan ve sonucu gösteren bir test programı yazınız.
 * d ​a00​a11  ​­ ​a01​a10 değeri ​0​ ise “Denklemin çözümü yoktur” mesajını gösteriniz.
 */

import java.util.Scanner;

public class B08S30 {

	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		
		double[][] a = new double[2][2];
		
		double[] b = new double[2];
		
		System.out.println("a00, a01, a10, a11, b0, ve b1 değerlerini giriniz: ");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = girdi.nextDouble();
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i] = girdi.nextDouble();
		}
		
		
		double[] sonuc = dogrusalDenklem(a, b);
		if (sonuc == null) {
			System.out.println("Denklemin çözümü yoktur.");
		} else {
			System.out.println("x " + sonuc[0] + " ve y " + sonuc[1]);
		}
	}
	
	
	public static double[] dogrusalDenklem(double[][] a, double[] b) {
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
			return null;
		}
		
		double[] r = new double[2];
		
		r[0] = (b[0] * a[1][1] - b[1] * a[0][1]) /
				(a[0][0] * a[1][1] - a[0][1] * a[1][0]);
		
		r[1] = (b[1] * a[0][0] - b[0] * a[1][0]) /
				(a[0][0] * a[1][1] - a[0][1] * a[1][0]);
		
		return r;
 	}
}
