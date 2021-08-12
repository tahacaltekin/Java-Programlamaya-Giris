package bolum03.sorular;

/*
 * (��genin �evresi) Kullan�c�dan kenar uzunluklar�n� alan ve e�er kenar uzunluklar� ge�erli ise
 * ��genin �evresini hesaplay�p g�steren bir program yaz�n�z. Kenar uzunluklar� ge�erli de�ilse, �Ge�ersiz
 * uzunluk de�eri� mesaj�n� g�steriniz. Her iki kenar�n uzunlu�unun toplam�, di�er kenardan b�y�kse kenar
 * uzunluklar� ge�erlidir
 */

import java.util.Scanner;

public class B03S19 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("��genin kenar uzunluklar�n� giriniz: ");
		System.out.println("x1 ve y1 noktalar�n� giriniz: ");
		double x1 = girdi.nextDouble();
		double y1 = girdi.nextDouble();
		
		System.out.println("x2 ve y2 noktalar�n� giriniz: ");
		double x2 = girdi.nextDouble();
		double y2 = girdi.nextDouble();
		
		System.out.println("x3 ve y3 noktalar�n� giriniz: ");
		double x3 = girdi.nextDouble();
		double y3 = girdi.nextDouble();
		
		boolean deger = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
				 (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
				 (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);
		
		if(!deger) {
			System.out.println("Ge�ersiz Uzunluk de�eri");
			System.exit(1);
		}
		
		double kenar1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double kenar2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double kenar3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		
		System.out.println("��genin �evresi " + (kenar1 + kenar2 + kenar3));
	}
		


}
