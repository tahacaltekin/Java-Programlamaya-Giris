package bolum02.sorular;

/*
 * ​ (​Finans uygulaması: Yatırımın geri dönüş değeri) Kullanıcıdan yatırım miktarı, yıllık faiz
 * oranı ve yıl sayısını isteyen ve aşağıdaki formülü kullanarak yatırımın geri dönüş değerini
 * hesaplayıp gösteren bir program yazınız.
 * 
 * 
 * 			yatiriminGeriDonusDegeri = yatirimMiktari * (1 + aylikFaizOrani) yilSayisi * 12
 * 
 * Örneğin, miktar 1000, yıllık faiz oranı %3.25 ve yıl sayısı 1 olarak girilirse yatırımın getirisi
 * 1032.98 olacaktır.
 */

import java.util.Scanner;

public class B02S21 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Yatırımın geri dönüş değerini öğrenmek için yatırım miktarını giriniz: ");
		double yatirimMiktarı = girdi.nextDouble();
		
		System.out.println("Yıllık faiz oranını giriniz: ");
		double aylikFaizOrani = girdi.nextDouble();
		
		aylikFaizOrani /= 1200;
		
		
		System.out.println("Yıl sayısını giriniz: ");
		double yilSayisi = girdi.nextDouble();
		
		double yatiriminGeriDonusDegeri = yatirimMiktarı * Math.pow(1 + aylikFaizOrani, yilSayisi * 12);
		System.out.println("Yatırımın geri dönüş değeri " + (int)(yatiriminGeriDonusDegeri * 100) / 100.0);
	}

}
