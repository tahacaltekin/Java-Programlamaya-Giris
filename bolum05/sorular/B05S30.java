package bolum05.sorular;

/*
 *  ​(Finans uygulaması: birleşik faiz) Yıllık %5 faiz oranıyla hesabınızda her ay 100 TL biriktirdiğinizi
 * varsayalım. Bu durumda aylık faiz oranı 0.05/12 = 0.00417. İlk ayın sonunda hesabınızda miktar:
 * 
 * 100 * (1 + 0.00417) = 100.417
 * 
 * İkinci ayın sonunda hesabınızda ki miktar:
 * 
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 * 
 * Üçüncü ayın sonunda hesabınızda ki miktar:
 * 
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 * 
 * olacaktır.
 * 
 * Kullanıcıdan miktarı (örneğin; 100​), yıllık faiz oranını (örneğin; 5​) ve kaç ay olduğunu (örneğin; 6​) alan ve verilen
 * aydan sonra hesaptaki birikimi gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B05S30 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Hesabınıza yatırılacak miktarı giriniz: ");
		double miktar = girdi.nextDouble();
		
		System.out.println("Yıllık faiz oranını giriniz: ");
		double faizOrani = girdi.nextDouble();
		
		System.out.println("Faizin kaç ay süreceğini giriniz: ");
		int ay = girdi.nextInt();
		
		double aylikFaizOrani = faizOrani / 1200;
		
		double toplamDeger = 0;
		
		for (int i = 1; i <= ay; i++) {
			toplamDeger = (miktar + toplamDeger) * (1 + aylikFaizOrani);
		}
		
		System.out.printf(ay + " ay sonra hesabınızdaki tutar: $%.2f\n", toplamDeger);
	}
}
