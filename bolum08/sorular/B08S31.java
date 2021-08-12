package bolum08.sorular;


/*
 * (​Geometri: Kesişim noktaları) İki doğrunun kesişim noktalarını döndüren bir metot yazınız. İki
 * doğrunun keişim noktalarının hesaplanması için kullanılacak formülü Programlama Soruları 3.25’te
 * bulabilirsiniz. Birinci doğrunun iki noktasının (​x1​, ​y1​) ve (​x2​, ​y2​) ve ikinci doğrunun iki noktasının (​x3​, ​y3​)
 * ve (​x4​, ​y4​) olduğunu varsayalım. Metot bildirimi:
 * 
 * public static double​[] getIntersectingPoint(​double​[][] points)
 * 
 * Nokta verileri iki boyutlu 4*2’lik bir dizide (x1​ ​, ​y1​) için (​points[0][0]​, ​points[0][1]​) şeklinde saklanabilir.
 * Metot, eğer iki doğru kesişiyorsa kesişim noktasını, paralel ise ​null​ geri dönecektir. Kullanıcıdan dört
 * nokta alan ve kesişim noktasını gösteren bir program yazınız.
 * 
 */

import java.util.Scanner;

public class B08S31 {

	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		
		double[][] noktalar = new double[4][2];
		
		System.out.println("(x1, y1), (x2, y2), (x3 y3) ve (x4 y4) noktalarını giriniz: ");
		for (int i = 0; i < noktalar.length; i++) {
			for (int j = 0; j < noktalar[i].length; j++) {
				noktalar[i][j] = girdi.nextDouble();
			}
		}
		
		double[] sonuc = kesisimNoktasiAl(noktalar);
		
		if (sonuc == null) {
			System.out.println("İki doğru paralel");
		} else {
			System.out.println("Kesişim noktaları (" + sonuc[0] + ", " + sonuc[1] + ")");
		}
	}
	
	public static double[] kesisimNoktasiAl(double[][] noktalar) {
		double[][] a = new double[2][2]; 
		
		double[] b = new double[2];
		
		
		a[0][0] = noktalar[0][1] - noktalar[1][1];
		a[0][1] = -1 * (noktalar[0][0] - noktalar[1][0]);
		a[1][0] = noktalar[2][1] - noktalar[3][1];
		a[1][1] = -1 * (noktalar[2][0] - noktalar[3][0]);
		b[0] = (noktalar[0][1] - noktalar[1][1]) * noktalar[0][0] - (noktalar[0][0] - noktalar[1][0]) * noktalar[0][1];
		b[1] = (noktalar[2][1] - noktalar[3][1]) * noktalar[2][0] - (noktalar[2][0] - noktalar[3][0]) * noktalar[2][1];
		
		return B08S30.dogrusalDenklem(a, b);
	}
}
