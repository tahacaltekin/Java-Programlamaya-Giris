package bolum04.sorular;

/*
 * (Geometri: beşgenin alanı) Aşağıda bulunan şekildeki gibi kullanıcıdan beşgenin merkezinden
 * köşesine kadar olan uzunluğu alarak, alanını hesaplayan bir program yazınız.
 * 
 * 
 * Beşgenin alanını hesaplamak için kullanılacak formül:
 * 
 *  	    	5 x s²
 *  alan = ----------------  
 * 	   4 x tan(pi / 5)
 * 
 * s beşgenin kenar uzunluğunu gösterir. Kenar uzunluğu aşağıdaki formül kullanılarak hesaplanabilir.
 * 
 * 
 * 
 *  s = 2r sin(pi / 5)
 *  
 *  r beşgenin merkezinin köşesine olan uzaklığını gösterir. Ondalık kısmı iki basamak olacak şekilde
 *  yuvarlayınız
 */

import java.util.Scanner;

public class B04S01 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Beşgenin alan hesaplaması için merkezinden köşesine olan uzunluğu giriniz: ");
		double r = girdi.nextDouble();
		
		double s = (2 * r) * (Math.sin(Math.PI / 5));
		
		double alan = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.println("Beşgenin alanı " + (int)(alan * 100) / 100.0);
	}
}
