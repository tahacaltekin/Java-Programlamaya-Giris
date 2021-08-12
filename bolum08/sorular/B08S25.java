package bolum08.sorular;

/*
 *  ​(​Markov matrisi) Her bir elemanı pozitif ve sütunlarındaki değerlerin toplamı 1 olan , ​n * ​n matrise
 * pozitif Markov matrisi denir. Bir matrisin, Markov matrisi olup olmadığını kontrol eden aşağıdaki
 * bildirime sahip bir metot yazınız.
 * 
 * public static boolean ​isMarkovMatrix(​double​[][] m)
 * 
 * Kullanıcıdan 3*3 boyutunda bir matrisin elemanlarını alan ve bunun markov matrisi olup olmadığını
 * kontrol eden bir program yazınız. 
 */

import java.util.Scanner;

public class B08S25 {

	public static void main(String[] args) {
		
		double[][] matris = matrisAl();
		
		System.out.println("Girilen matris" + (markovMatrisiMi(matris) ? " Markov matrisidir." : " Markov matrisi değildir."));
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
	
	public static boolean markovMatrisiMi(double[][] m) {
		return elemanlarPozitifMi(m) && herSutununToplamiBirMi(m);
	}
	
	public static boolean elemanlarPozitifMi(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] < 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean herSutununToplamiBirMi(double[][] m) {
		for (int sutun = 0; sutun < m.length; sutun++) {
			double toplam = 0;
			for (int satir = 0; satir < m.length; satir++) {
				toplam += m[satir][sutun];
			}
			
			if (toplam != 1) {
				return false;
			}
		}
		
		return true;
	}
}
