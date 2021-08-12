package bolum04.sorular;

/*
 * (Geometri: beþgenin alaný) Aþaðýda bulunan þekildeki gibi kullanýcýdan beþgenin merkezinden
 * köþesine kadar olan uzunluðu alarak, alanýný hesaplayan bir program yazýnýz.
 * 
 * 
 * Beþgenin alanýný hesaplamak için kullanýlacak formül:
 * 
 *  	    	5 x s²
 *  alan = ----------------  
 * 			4 x tan(pi / 5)
 * 
 * s beþgenin kenar uzunluðunu gösterir. Kenar uzunluðu aþaðýdaki formül kullanýlarak hesaplanabilir.
 * 
 * 
 * 
 *  s = 2r sin(pi / 5)
 *  
 *  r beþgenin merkezinin köþesine olan uzaklýðýný gösterir. Ondalýk kýsmý iki basamak olacak þekilde
 *  yuvarlayýnýz
 */

import java.util.Scanner;

public class B04S01 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Beþgenin alan hesaplamasý için merkezinden köþesine olan uzunluðu giriniz: ");
		double r = girdi.nextDouble();
		
		double s = (2 * r) * (Math.sin(Math.PI / 5));
		
		double alan = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.println("Beþgenin alaný " + (int)(alan * 100) / 100.0);
	}
}
