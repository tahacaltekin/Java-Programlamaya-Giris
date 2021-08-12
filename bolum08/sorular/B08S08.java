package bolum08.sorular;

/*
 * (​En yakın nokta çiftleri) Madde 8.3, FindNearestPoints.java, programını birbiriyle aynı ve en yakın
 * mesafede olan nokta çitlerini gösterecek şekilde yeniden yazınız.
 */

import java.util.Scanner;

public class B08S08 {

	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("Nokta sayısını Giriniz: ");
		int noktaSayisi = girdi.nextInt();
		
		double[][] noktalar = new double[noktaSayisi][2];
		System.out.print(noktaSayisi + " tane nokta giriniz: " );
		for (int i = 0; i < noktalar.length; i++) {
			noktalar[i][0] = girdi.nextDouble();
			noktalar[i][1] = girdi.nextDouble();
		}
		
		int p1 = 0;
		int p2 = 1;
		
		double enKisaMesafe = mesafe(noktalar[p1][0], noktalar[p1][1], noktalar[p2][0], noktalar[p2][p1]);
		
		
		for (int i = 0; i < noktalar.length; i++) {
			for (int j = i + 1; j < noktalar.length; j++) {
				double mesafe = mesafe(noktalar[i][0], noktalar[i][1], noktalar[j][0], noktalar[j][1]);
				
				if (enKisaMesafe > mesafe) {
					p1 = i;
					p2 = j;
					enKisaMesafe = mesafe;
				}
			}
		}
		
		for (int i = 0; i < noktalar.length; i++) {
			for (int j = 0; j < noktalar.length; j++) {
				if (mesafe(noktalar[i][0], noktalar[i][1], noktalar[j][0], noktalar[j][1]) == enKisaMesafe) {
					System.out.println("En yakın iki noktalar: " + "(" + noktalar[i][0] + ", " + noktalar[i][1] + ") ve (" + 
							noktalar[j][0] + ", " + noktalar[j][1] + ")");
				}
			}
		}
		System.out.println("Aralarında ki mesafe = " + enKisaMesafe);
	}
	
	public static double mesafe(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
