package bolum08.sorular;
/*
 * (​Geometri: aynı doğru mu?) Programlama Soruları 6.39’da üç noktanın aynı doğru üzerinde olup
 * olmadığını test eden bir metot bulunmaktadır.
 * points ​dizisindeki noktaların tümünün aynı doğru üzerinde olup olmadığını test eden aşağıdaki bildirime
 * sahip bir metot yazınız.
 * 
 * public static boolean ​sameLine(​double​[][] points)
 * 
 * Kullanıcıdan beş nokta girmesini isteyen ve bu noktaların aynı doğru üzerinde olup olmadığını gösteren
 * bir program yazınız.
 */
import java.util.Scanner;

public class B08S15 {

	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		
		double[][] noktalar = new double[5][2];
		
		System.out.print("5 nokta giriniz: ");
		
		for (int i = 0; i < noktalar.length; i++) {
			for (int j = 0; j < noktalar[i].length; j++) {
				noktalar[i][j] = girdi.nextDouble();
			}
		}
		
		System.out.println("Girilen 5 nokta " + (aynıCizgide(noktalar) ? "aynı çizgideler" : "aynı çizgide değiller"));
	}
	
	public static boolean aynıCizgide(double[][] noktalar) {
		for (int i = 0; i < noktalar.length - 2; i += 3) {
			if (noktalarinKonumu(noktalar[i][0], noktalar[i][1], noktalar[i + 1][0], 
					noktalar[i + 1][1], noktalar[i + 2][0], noktalar[i + 2][1]) != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static double noktalarinKonumu(double x0, double y0,
			double x1, double y1, double x2, double y2) {
		
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}
}
