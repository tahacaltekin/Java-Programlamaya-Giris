package bolum03.sorular;

/*
 * (Geometri: Nokta pozisyonu) p2(x2, y2)noktasının; p0(x0, y0), p1(x1,y1) noktalarından geçen bir


 * doğrunun sağında mı, solunda mı ya da üzerinde mi olup olmadığına aşağıdaki koşulları kullanarak
 * karar verebilirsiniz.
 * 
 * 
 * 														> 0 p2 noktası doğrunun solunda
 *  (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)		= 0 p2 noktası doğrunun üzerinde
 *  													< 0 p2 noktası doğrunun sağında
 * 
 * Kullanıcıdan p0, p1, p2 gibi üç nokta alan ve p2 noktasının p0, p1 doğrusuna göre konumunu gösteren
 * bir program yazınız.
 */

import java.util.Scanner;

public class B03S32 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Doğruları oluşturmak için p0,p1 ve p2 noktalarını giriniz: ");
		
		System.out.println("p0 noktalarını giriniz: ÖRN: (2 0)");
		double x0 = girdi.nextDouble();
		double y0 = girdi.nextDouble();
		
		System.out.println("p1 noktalarını giriniz: ÖRN: (2 0)");
		double x1 = girdi.nextDouble();
		double y1 = girdi.nextDouble();
		
		System.out.println("p2 noktalarını giriniz: ÖRN: (2 0)");
		double x2 = girdi.nextDouble();
		double y2 = girdi.nextDouble();
		
		double kesisim = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if (kesisim > 0) {
			System.out.println("(" + x2 + ", " + y2 + ")" + " noktası " + "(" + x0 + ", " + y0 + ")" + " noktalarıyla " + "(" + x1 + ", " + y1 +  ")" + " noktalarının solundadır." );
		} else if (kesisim < 0 ) {
			System.out.println("(" + x2 + ", " + y2 + ")" + " noktası " + "(" + x0 + ", " + y0 + ")" + " noktalarıyla " + "(" + x1 + ", " + y1 +  ")" + " noktalarının sağındadır." );
		} else {
			System.out.println("(" + x2 + ", " + y2 + ")" + " noktası " + "(" + x0 + ", " + y0 + ")" + " noktalarıyla " + "(" + x1 + ", " + y1 +  ")" + " noktalarıyla aynı çizgidedir." );
		}
	}
}
