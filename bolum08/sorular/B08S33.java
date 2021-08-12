package bolum08.sorular;

/*
 * (​Geometri: çokgenin alt alanları) 4 köşeli dışbükey çokgen Şekil 8.9’da gösterildiği gibi dört üçgene
 * bölünebilir.
 * Kullanıcıdan dört köşe noktasının koordinatlarını alan ve dört üçgenin alanlarını artan sıra ile gösteren
 * bir program yazınız.
 */

import java.util.Arrays;
import java.util.Scanner;

public class B08S33 {

	public static void main(String[] args) {
		double[][] koseNoktalari = koseNoktalariAl(4, 2);
		double[] kesisimNoktasi = kesisimNoktasiniAl(koseNoktalari);
		double[] ucgenAlanlari = ucgenAlanlariniBul(koseNoktalari, kesisimNoktasi);
		Arrays.sort(ucgenAlanlari);
		ucgenAlanlariniYazdir(ucgenAlanlari);
	}
	
	public static void ucgenAlanlariniYazdir(double[] ucgenAlanlari) {
		System.out.print("Üçgenlerin alanları: ");
		for (double alan : ucgenAlanlari) {
			System.out.printf("%.2f ", alan);
		}
	}
	
	public static double[] ucgenAlanlariniBul(double[][] koseNoktalari, double[] kesisimNoktasi) {
		double[] ucgenAlanlari = new double[4];
		for (int i = 0; i < 4; i++) {
			double[][] ucgenlerinNoktalari = new double[3][2];
			ucgenlerinNoktalari[0] = koseNoktalari[i % 4];
			ucgenlerinNoktalari[1] = koseNoktalari[(i + 1) % 4];
			ucgenlerinNoktalari[2] = kesisimNoktasi;
			ucgenAlanlari[i] = ucgenAlaniBul(ucgenlerinNoktalari);
		}
		
		return ucgenAlanlari;
	}
	
	public static double[][] koseNoktalariAl(int satirlar, int sutunlar) {
		double[][] m = new double[satirlar][sutunlar];
		Scanner girdi = new Scanner(System.in);
		System.out.print("(x1, y1), (x2, y2), (x3, y3) ve (x4, y4) noktalarını giriniz: ");
		for (int i = 0; i < satirlar; i++) {
			for (int j = 0; j < sutunlar; j++) {
				m[i][j] = girdi.nextDouble();
			}
		}
		
		return m;
	}
	
	public static double[] kesisimNoktasiniAl(double[][] noktalar) {
		final int X = 0;
		final int Y = 1;
		
		double a = noktalar[0][Y] - noktalar[2][Y];
		double b = noktalar[0][X] - noktalar[2][X];
		double c = noktalar[1][Y] - noktalar[3][Y];
		double d = noktalar[1][X] - noktalar[3][X];
		double e = (a * noktalar[0][X]) - (b * noktalar[0][Y]);
		double f = (c * noktalar[1][X]) - (d * noktalar[1][Y]);
		
		double determinant = (a * d) - (b * c);
		
		if (determinant == 0) {
			return null;
		} else {
			double x = (e * d - b * f) / determinant;
			double y = -((a * f) - (e * c)) / determinant;
			return new double[]{x, y};
		}
	}
	
	public static double ucgenAlaniBul(double[][] noktalar) {
		final int X = 0;
		final int Y = 1;
		
		return Math.abs((noktalar[0][X] * (noktalar[1][Y] - noktalar[2][Y]) + 
				noktalar[1][X] * (noktalar[2][Y] - noktalar[0][Y]) + 
				noktalar[2][X] * (noktalar[0][Y] - noktalar[1][Y])) / 2.0); 
	}
}
