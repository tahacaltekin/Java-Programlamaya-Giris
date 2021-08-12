package bolum03.sorular;

/*
 *  ​(Cebir: 2 * 2 doğrusal denklem sistemi çözümü) 2*2 doğrusal denklem sisteminin çözümü için
 * Programlama Soruları 1.13’te verilen Cramer kuralını kullanabilirsiniz. Kullanıcıdan a, b, c, d, e, f
 * değerlerini alan ve sonucu gösteren bir program yazınız. Eğer, ad ­ bc 0​ ise “Denklemin çözümü yoktur!”
 * mesajını gösteriniz.
 */

import java.util.Scanner;

public class B03S03 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("2 x 2 doğrusal denklemin çözümü için a değerini giriniz: ");
		double a = girdi.nextDouble();
		
		System.out.println("2 x 2 doğrusal denklemin çözümü için b değerini giriniz: ");
		double b = girdi.nextDouble();
		
		System.out.println("2 x 2 doğrusal denklemin çözümü için c değerini giriniz: ");
		double c = girdi.nextDouble();
		
		System.out.println("2 x 2 doğrusal denklemin çözümü için d değerini giriniz: ");
		double d = girdi.nextDouble();
		
		System.out.println("2 x 2 doğrusal denklemin çözümü için e değerini giriniz: ");
		double e = girdi.nextDouble();
		
		System.out.println("2 x 2 doğrusal denklemin çözümü için f değerini giriniz: ");
		double f = girdi.nextDouble();
		
		if (a * d - b * c == 0) {
			System.out.println("Denklemin çözümü yoktur");
		} else {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			
			System.out.println("x = " + x + " y = "  + y);
		}
		
		
		
		
	}	
}
