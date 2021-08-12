package bolum05.sorular;

/*
 * (Finans uygulaması: Vadeli hesap değerini hesaplama) Vadeli hesabınıza yıllık %5,75 faiz getirisi ile
 * 10000 $  yatırdığınızı varsayalım. Bir ay sonra vadeli hesabınızın değeri;
 * 
 * 10000 + 10000 * 5.75 / 1200 = 10047.92
 * 
 * İki ay sonra vadeli hesabınızın değeri;
 * 
 * 10047,91 + 10047,91 * 5.75 / 1200 = 10096.06
 * 
 * Üç ay sonra vadeli hesabınızın değeri;
 * 
 * 10096,06 + 10096,06 * 5.75 / 1200 = 10144.44
 * 
 * olacaktır.
 * 
 * Kullanıcının anapara miktarını (örneğin; 10000​), yıllık faiz oranını (örneğin; 5.75​) ve ay olarak süreyi (örneğin; 18​)
 * alan ve aşağıdaki örnek tabloyu gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B05S31 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Vadeli hesaba yatırılacak miktarı giriniz: ");
		double miktar = girdi.nextDouble();
		
		System.out.println("Yıllık faiz oranını giriniz: ");
		double faizOrani = girdi.nextDouble();
		
		System.out.println("Vade süresini ay olarak giriniz: ");
		int ay = girdi.nextInt();
		
		System.out.println("Ay     Deger");
		
		for (int i = 1; i <= ay; i++) {
			miktar += miktar * (faizOrani / 1200);
			System.out.printf("%-7d%.2f\n", i, miktar);
		}
	}
}
