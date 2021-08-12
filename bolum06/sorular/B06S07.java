package bolum06.sorular;

/*
 * (​Finans uygulaması: yatırımın gelecek değerini hesaplama) Belirlenen yıllar için verilen faiz oranını
 * kullanarak yatırımın gelecekteki değerini hesaplayınız. Bunun için alıştırma 2.21’deki formülü
 * kullanınız.
 * 
 * Aşağıdaki metot bildirimi kullanınız:
 * 
 * public static double ​futureInvestmentValue(
 * 
 * double ​investmentAmount, ​double ​monthlyInterestRate, ​int ​years)
 * 
 * Örneğin; ​futureInvestmentValue(10000, 0.05/12, 5)​ geri dönüş değeri ​12833.59​.
 * Kullanıcıdan yatırım tutarı (ör.,1000) ve faiz oranı (ör., 9%) bilgilerini alan ve 1 yıldan 30 yıla kadar
 * getiriyi gösteren bir test programı yazınız.
 */

import java.util.Scanner;

public class B06S07 {

	public static void main(String[] args) {
		final int YIL_SAYISI = 30;
		
		Scanner girdi = new Scanner(System.in);

		System.out.println("Yatırımın geri dönüş değerini öğrenmek için yatırım miktarını giriniz: ");
		double yatirimMiktarı = girdi.nextDouble();

		System.out.println("Yıllık faiz oranını giriniz: ");
		double yillikFaizOrani = girdi.nextDouble();
		
		double aylikFaizOrani = yillikFaizOrani / 1200;
		
		System.out.println("Yıl       Gelecek Değeri");
		for (int yil = 1; yil <= YIL_SAYISI; yil++) {
			System.out.printf("%-10d", yil);
			System.out.printf("%11.2f\n", yatiriminGelecekDegeri(yatirimMiktarı, aylikFaizOrani, yil));
		}
	}

	public static double yatiriminGelecekDegeri(double yatirimMiktarı, double aylikFaizOrani, int yil) {
		return yatirimMiktarı * Math.pow(1 + aylikFaizOrani, yil * 12);
	}
}
