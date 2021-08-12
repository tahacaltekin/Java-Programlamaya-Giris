package bolum02.sorular;

/*
 *  (​Geometri: iki nokta arasındaki mesafe) Kullanıcıdan​ (x1, y1)​ ve​ (x2, y2)​ gibi iki nokta
 * girmesini isteyen ve bu iki nokta arasındaki mesafeyi gösteren bir program yazınız.
 * Mesafeyi hesaplamak için kullanabileceğiniz formül √(x2 - x1)² + (y2 + y1)². √a ‘yı
 * hesaplamak için  ​Math.pow(a, 0.5)​ metodunu kullanabilirsiniz.
 */

import java.util.Scanner;

public class B02S15 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.println("İki nokta arasında ki mesafeyi hesaplamak için değerleri Giriniz: ");
		
		System.out.println("x1 ve y1 değerlerini giriniz: ");
		double x1 = girdi.nextDouble();
		double y1 = girdi.nextDouble();
		
		System.out.println("x2 ve y2 değerlerini giriniz: ");
		double x2 = girdi.nextDouble();
		double y2 = girdi.nextDouble();
		
		double mesafe = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		System.out.println("İki nokta arasındaki mesafe " + mesafe);
	}

}
