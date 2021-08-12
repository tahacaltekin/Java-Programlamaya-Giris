package bolum06.sorular;

/*
 * ​(​Geometri: nokta pozisyonu) Programming Exercise 3.32 ‘de nasıl bir noktanın bir çizgini sağında mı, 
 * solunda mı ya da üzerinde mi olduğunu test etmeyi öğrenmiştik. Aşağıdaki bildirimlere sahip
 * metodları yazınız:
 * 
 * (x2, y2) noktası (x0, y0) ‘dan (x1, y1)’a çizilen doğrunun solunda ise true geri dönüş değeri üretir 
 * public static boolean ​leftOfTheLine(​double ​x0, ​double ​y0, ​double ​x1, ​double ​y1, ​double ​x2, ​double ​y2)
 * 
 * (x2, y2) noktası (x0, y0) ‘dan (x1, y1)’a çizilen doğrunun doğrultusunda ise true geri dönüş değeri üretir
 * public static boolean ​onTheSameLine(​double ​x0, ​double ​y0, ​double ​x1, ​double ​y1, ​double ​x2, ​double ​y2)
 * 
 * (x2, y2) noktası (x0, y0) ‘dan (x1, y1)’a çizilen doğrunun üzerinde ise true geri dönüş değeri üretir 
 * public static boolean ​onTheLineSegment(​double ​x0, ​double ​y0, ​double ​x1, ​double ​y1, ​double ​x2, ​double ​y2)
 * 
 * p0, p1, p2 değerlerini kullanıcının girdiği ve p2 noktasının p0, p1arasında çizilen doğrunun sağında,
 * solunda, üzerinde ya da doğrultusunda olduğunu gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B06S39 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("p0,p1,p2 için 3 nokta giriniz");
		
		double x0 = girdi.nextDouble();
		double y0 = girdi.nextDouble();
		double x1 = girdi.nextDouble();
		double y1 = girdi.nextDouble();
		double x2 = girdi.nextDouble();
		double y2 = girdi.nextDouble();
		
		
		System.out.print("(" + x2 + ", " + y2 + ") noktaları ");
		System.out.print( "(" + x0 + ", " + y0 + ") ve (" + x1 + ", " + y1 + ") noktalarından çizilen");
		if(cizgininUzerinde(x0, y0, x1, y1, x2, y2)) 
			System.out.print(" çizginin üzerindedir.");
		 else if(cizgininSolunda(x0, y0, x1, y1, x2, y2)) 
			System.out.print(" çizginin solundadır.");
		 else if(cizgiyeParalel(x0, y0, x1, y1, x2, y2)) 
			System.out.print(" çizgi ile aynı doğrultudadır.");
		 else 
			System.out.print(" çizginin sağındadır.");
			
			
		
	}
	
	public static boolean cizgininSolunda(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		return noktaPozisyonu(x0, y0, x1, y1, x2, y2) > 0;
	}
	
	public static boolean cizgiyeParalel(double x0, double y0, double x1, double y1, double x2, double y2) {
		return noktaPozisyonu(x0, y0, x1, y1, x2, y2) == 0;
		
	}
	
	public static boolean cizgininUzerinde(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		return (noktaPozisyonu(x0, y0, x1, y1, x2, y2) == 0 && (x2 > x0) && (y2 > y0) && (x2 < x1) && (y2 < y1));
	}
	
	public static double noktaPozisyonu(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}
}
