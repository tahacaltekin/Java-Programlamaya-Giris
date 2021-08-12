package bolum08.sorular;


/*
 * (​Geometri: En küçük en sağ nokta) Analitik geometride genellikle, birçok nokta içerisinden en
 * küçük en sağdaki noktayı bulmak gerekir. Birçok nokta içerisinden en küçük, en sağda olan noktayı
 * bulan aşağıda bildirimi verilen metodu yazınız.
 * 
 * public static double​[] getRightmostLowestPoint(​double​[][] points)
 * 
 * Kullanıcıdan 6 noktanın koordinatlarını alan ve en küçük en sağdaki noktayı gösteren bir program
 */
import java.util.Scanner;

public class B08S34 {

	public static void main(String[] args) {
		double[][] noktalar = noktalariAl(6, 2);
		double[] sagdakiEnKucukNokta = enKucukNoktayiAl(noktalar);
		sagdakiEnKucukNoktayiYazdir(sagdakiEnKucukNokta);
	}
	
	public static void sagdakiEnKucukNoktayiYazdir(double[] sagdakiEnKucukNokta) {
		final int X = 0;
		final int Y = 1;
		
		System.out.println("Sağdaki en küçük nokta: (" + sagdakiEnKucukNokta[X] + ", " + sagdakiEnKucukNokta[Y] + ")");
	}
	
	public static double[][] noktalariAl(int satirlar, int sutunlar) {
		double[][] m = new double[satirlar][sutunlar];
		Scanner girdi = new Scanner(System.in);
		System.out.print("6 tane nokta giriniz: ");
		for (int i = 0; i < satirlar; i++) {
			for (int j = 0; j < sutunlar; j++) {
				m[i][j] = girdi.nextDouble();
			}
		}
		
		return m;
	}
	
	public static double[] enKucukNoktayiAl(double[][] noktalar) {
		final int X = 0;
		final int Y = 1;
		
		double[] sagdakiEnKucukNokta = noktalar[0];
		for (double[] nokta : noktalar) {
			if (nokta[Y] < sagdakiEnKucukNokta[Y]) {
				sagdakiEnKucukNokta = nokta;
			} else if (nokta[Y] == sagdakiEnKucukNokta[Y] && nokta[X] > sagdakiEnKucukNokta[X]) {
				sagdakiEnKucukNokta = nokta;
			}
		}
		return sagdakiEnKucukNokta;
	}
}
