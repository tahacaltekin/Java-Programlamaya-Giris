package bolum03.sorular;

/*
 *  ​(Geometri: Doğru parçası) Programlama Soruları 3.32 bir noktanın bir doğruya göre durumunu
 * gösterir. Programlama Soruları 3.32 ’yi yeniden düzenleyerek bir noktasının doğru parçasına göre
 * durumunu gösterin. Kullanıcıdan p0, p1, p2 üç nokta alan ve p2 noktasının p0’dan p1’e çizilen doğru
 * parçasına göre durumunu gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B03S34 {
	public static void main(String[] args) {
Scanner girdi = new Scanner(System.in);
		
		System.out.println("Doğruları oluşturmak için p0,p1 ve p2 noktalarını giriniz: ");
		
		System.out.println("p0 noktalarını giriniz: ÖRN: (2, 0)");
		double x0 = girdi.nextDouble();
		double y0 = girdi.nextDouble();
		
		System.out.println("p1 noktalarını giriniz: ÖRN: (2, 0)");
		double x1 = girdi.nextDouble();
		double y1 = girdi.nextDouble();
		
		System.out.println("p2 noktalarını giriniz: ÖRN: (2, 0)");
		double x2 = girdi.nextDouble();
		double y2 = girdi.nextDouble();
		
		boolean kesisim = !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 ||
				((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 ||
				(x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));
		
		if (!kesisim) {
			System.out.println("(" + x2 + ", " + y2 + ")" + " noktası " + "(" + x0 + ", " + y0 + ")" + " noktalarıyla " + "(" + x1 + ", " + y1 +  ")" + " noktalarının oluşturduğu çizginin üstünde değildir.");
		} else {
			System.out.println("(" + x2 + ", " + y2 + ")" + " noktası " + "(" + x0 + ", " + y0 + ")" + " noktalarıyla " + "(" + x1 + ", " + y1 +  ")" + " noktalarının oluşturduğu çizginin üstündedir.");
		}
	}
}
