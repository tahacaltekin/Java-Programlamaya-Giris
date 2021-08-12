package bolum03.sorular;

/*
 * (Geometri: kesişme noktası) Birinci doğruya ait iki nokta (x1​, y1​) ve (x2​, y2​) , ikinci doğruya ait iki
 * nokta (x3​, y3​) ve (x4​, y4​), olarak şekil 3.8a–b verilmektedir.
 * Aşağıdaki doğrusal denklem çözülerek iki doğrunun kesişim noktası bulunabilir.
 * 
 * 			(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1		
 * 			(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * 
 * Bu doğrusal denklem Cramer kuralı kullanılarak çözülebilir. (Bakınız; Programlama Soruları 3.3). Eğer
 * denklemin bir çözümü yoksa bu doğru paraleldir.
 * 
 * Kullanıcıdan dört nokta alan ve kesişim noktasını gösteren bir program yazınız. Programın örnek akışını
 * inceleyiniz:
 */

import java.util.Scanner;

public class B03S25 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Kesişme noktası için birinci doğruya ait noktaları giriniz. ");
		System.out.println("x1 noktasını giriniz: ");
		double x1 = girdi.nextDouble();
		
		System.out.println("y1 noktasını giriniz: ");
		double y1 = girdi.nextDouble();
		
		System.out.println("x2 noktasını giriniz: ");
		double x2 = girdi.nextDouble();
		
		System.out.println("y2 noktasını giriniz: ");
		double y2 = girdi.nextDouble();
		
		System.out.println("Kesişme noktası için ikinci doğruya ait noktaları giriniz.");
		System.out.println("x3 noktasını giriniz: ");
		double x3 = girdi.nextDouble();
		
		System.out.println("y3 noktasını giriniz: ");
		double y3 = girdi.nextDouble();
		
		System.out.println("x4 noktasını giriniz: ");
		double x4 = girdi.nextDouble();
		
		System.out.println("y4 noktasını giriniz: ");
		double y4 = girdi.nextDouble();
		
		double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		if (a * d - b * c == 0) {
			System.out.println("Girilen noktalardaki doğrular birbirine paraleldir.");
		} else {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("İki noktanın kesişimi (" + x + ", " + y + ")");
		}
	}
}
