package bolum02.sorular;

/*
 *  (​Geometri: üçgenin alanı) Kullanıcıdan​ (x1, y1)​,​ (x2, y2)​,​ (x3, y3)​ gibi üç nokta girmesini
 * isteyen ve üçgenin alanını hesaplayıp gösteren bir program yazınız.
 * Üçgenin alanını hesaplamak için kullanılacak formül:
 * 
 * s = (side1 + side2 + side3) / 2
 * 
 * alan = √s(s - side1)(s - side2)(s - side3)
 * 
 */

import java.util.Scanner;

public class B02S19 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Üçgenin alanının hesaplanması için noktaları giriniz: ");
		
		System.out.println("x1 ve y1 noktalarını giriniz: ");
		double x1 = girdi.nextDouble();
		double y1 = girdi.nextDouble();
		
		System.out.println("x2 ve y2 noktalarını giriniz: ");
		double x2 = girdi.nextDouble();
		double y2 = girdi.nextDouble();
		
		System.out.println("x3 ve y3 noktalarını giriniz: ");
		double x3 = girdi.nextDouble();
		double y3 = girdi.nextDouble();
		
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		
		double side = (side1 + side2 + side3) / 2;
		
		double alan = Math.pow(side * (side - side1) * (side - side2) * (side - side3), 0.5);
		System.out.println("Girilen noktalara göre üçgenin alanı " + (int)(alan * 100) / 100.0);
	}

}
