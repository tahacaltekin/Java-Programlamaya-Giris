package bolum02.sorular;

/*
 *  (​Silindirin hacmi) Kullanıcıdan silindirin yarıçap ve yükseklik değerini isteyen ve aşağıdaki
 * formüle göre alanını ve hacmini hesaplayan bir program yazınız:
 * 
 * alan​ = yarıçap​ * yarıçap * pi
 * hacim = alan * yükseklik
 * 
 * 
 * 
 */

import java.util.Scanner;

public class B02S02 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.println("Alanı ve hacmi hesaplanacak silindirin yarıçap ve yüksekliğini giriniz: ");

		
		double yaricap = girdi.nextDouble();
		double yukseklik = girdi.nextDouble();

		double alan = yaricap * yaricap * Math.PI;
		double hacim = alan * yukseklik;

		System.out.println("Yarıçap ve yüksekliğini girdiniz silindirin alanı: " + (int)(alan * 10000) / 10000.0);
		System.out.println("ve hacmi: " + (int)(hacim * 10) / 10.0);
	}

}
