package bolum08.sorular;



/*
 * (​Geometri: Üçgenin alanı) Üçgenin alanını geri döndüren aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * public static double ​getTriangleArea(​double​[][] points)
 * 
 * Nokta verileri iki boyutlu 3*2’lik bir dizide (x1​ ​, ​y1​) için (​points[0][0]​, points​[0][1]​) şeklinde saklanabilir.
 * Üçgenin alanının hesaplanması için kullanılacak formülü Programlama Soruları 2.19’da bulabilirsiniz.
 * Eğer üç nokta aynı doğru üzerindeyse metodun geri dönüş değeri ​0​ olacaktır. Kullanıcıdan üçgenin köşe
 * noktalarını alan ve alanını gösteren bir program yazınız. 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class B08S32 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		double[][] noktalar = new double[3][2];
		
		System.out.println("Üçgenin alanını hesaplamak için (x1, y1), (x2, y2), (x3 y3) noktalarını giriniz: ");
		for (int i = 0; i < noktalar.length; i++) {
			for (int j = 0; j < noktalar[i].length; j++) {
				noktalar[i][j] = girdi.nextDouble();
			}
		}
		
		double sonuc = ucgeninAlaniniHesapla(noktalar);
		if (sonuc == 0) 
			System.out.println("3 nokta aynı doğru üzerinde");
		 else 
			System.out.printf("Üçgenin alanı %.2f\n", sonuc);
		
	}
	
	public static double ucgeninAlaniniHesapla(double[][] noktalar) {
		double[] kenar = new double[3];
		
		if (dogruKonumu(noktalar) == 0) 
			return 0;
		
		
		kenar[0] = Math.sqrt(Math.pow(noktalar[1][0] - noktalar[0][0], 2) + 
				Math.pow(noktalar[1][1] - noktalar[0][1], 2));
		
		kenar[1] = Math.sqrt(Math.pow(noktalar[2][0] - noktalar[1][0], 2) + 
				Math.pow(noktalar[2][1] - noktalar[1][1], 2));
		
		kenar[2] = Math.sqrt(Math.pow(noktalar[0][0] - noktalar[2][0], 2) + 
				Math.pow(noktalar[0][1] - noktalar[2][1], 2));
		
		double k = 0;
		for (double d : kenar) 
			k += d;
			
			k /= 2;
		
		double alan = k;
		for (double i : kenar) {
			alan *= (k - i);
		} 
		
		return Math.sqrt(alan);
	}
	
	public static double dogruKonumu(double[][] noktalar) {
		return (noktalar[1][0] - noktalar[0][0]) * (noktalar[2][1] - noktalar[0][1]) - 
				(noktalar[2][0] - noktalar[0][0]) * (noktalar[1][1] - noktalar[0][1]);
				
	}
}
