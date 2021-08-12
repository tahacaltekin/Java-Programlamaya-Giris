package bolum05.sorular;

/*
 * (Finans uygulamas�: farkl� faiz oranlar� i�in kredi bakiyelerini kar��la�t�rma) A�a��daki �rnekteki gibi
 * kullan�c�n�n kredi bakiye miktar�n� ve y�l olarak kredi vadesini girmesine izin veren, %5�ten %8�e 1/8 art�m ile her
 * bir faiz oran� i�in ayl�k ve toplam �demeyi g�steren bir program yaz�n�z.
 */

import java.util.Scanner;

public class B05S21 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Kredi Bakiye Miktar�n� Giriniz: ");
		double bakiye = girdi.nextDouble();
		
		System.out.println("Kredi vadesini y�l olarak giriniz: ");
		int vadeYili = girdi.nextInt();
		
		System.out.println("Faiz Oran�       Ayl�k �deme         Toplam �deme");
		
		for (double i = 5.0; i <= 8; i += 0.125) {
			System.out.printf("%-5.3f", i);
			System.out.print("%           ");
			
			double aylikFaizOrani = i / 1200;
			double aylikOdeme = bakiye * aylikFaizOrani / (1 
					- 1 /  Math.pow(1 + aylikFaizOrani, vadeYili * 12));
			System.out.printf("%-19.2f", aylikOdeme);
			System.out.printf("%-8.2f\n", (aylikOdeme * 12) * vadeYili);
		}
	}
}
