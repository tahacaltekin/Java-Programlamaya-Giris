package bolum07.sorular;

/*
 *  (​En küçük eleman) Gerçek sayılardan oluşan bir dizideki en küçük elemanı bulan aşağıdaki bildirime
 * sahip bir metot yazınız:
 * 
 * public static double​ min(​double​[] array)
 * 
 * Kullanıcıdan on adet sayı alan ve bu metodu çağırarak en küçük değeri gösteren gösteren bir test
 * programı yazınız.
 */

import java.util.Scanner;

public class B07S09 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		double[] sayilar = new double[10];
		
		System.out.println("10 sayı giriniz: ");
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = girdi.nextDouble();
		}
		
		System.out.println("En küçük sayı: " + min(sayilar));
	}
	
	public static double min(double[] dizi) {
		double min = dizi[0];
		for (double i : dizi) {
			if (i < min) {
				min = i;
			}
		}
		
		return min;
	}
}
