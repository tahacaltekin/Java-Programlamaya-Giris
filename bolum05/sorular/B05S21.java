package bolum05.sorular;

/*
 * (Finans uygulamasý: farklý faiz oranlarý için kredi bakiyelerini karþýlaþtýrma) Aþaðýdaki örnekteki gibi
 * kullanýcýnýn kredi bakiye miktarýný ve yýl olarak kredi vadesini girmesine izin veren, %5’ten %8’e 1/8 artým ile her
 * bir faiz oraný için aylýk ve toplam ödemeyi gösteren bir program yazýnýz.
 */

import java.util.Scanner;

public class B05S21 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Kredi Bakiye Miktarýný Giriniz: ");
		double bakiye = girdi.nextDouble();
		
		System.out.println("Kredi vadesini yýl olarak giriniz: ");
		int vadeYili = girdi.nextInt();
		
		System.out.println("Faiz Oraný       Aylýk Ödeme         Toplam Ödeme");
		
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
