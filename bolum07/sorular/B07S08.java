package bolum07.sorular;

/*
 * (​Dizinin ortalaması) Aşağıdaki bildirime sahip aynı isimli ancak farklı parametrik yapıda olan ve
 * dizinin aritmetik ortalamasını döndüren iki adet metot yazınız:
 * 
 * public static int​ average(​int​[] array)
 * public static double​ average(​double​[] array)
 * 
 * Kullanıcıdan on adet gerçek sayı alan ve bu metodu çağırarak aritmetik ortalama değerini
 * gösteren bir test programı yazınız.
 */

import java.util.Scanner;

public class B07S08 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		double[] degerler = new double[10];
		
		System.out.println("10 tane sayı giriniz: ");
		for (int i = 0; i < degerler.length; i++) {
			degerler[i] = girdi.nextDouble();
		}
		
		System.out.println("girilen sayıların ortalaması: " + ortalama(degerler));
	}
	
	public static int ortalama(int[] dizi) {
		int ortalama = 0;
		for (int i : dizi) {
			ortalama += i;
		}
		
		return ortalama / dizi.length;
	}
	
	public static double ortalama(double[] dizi) {
		double ortalama = 0;
		for (double i : dizi) {
			ortalama += i;
		}
		
		return ortalama / dizi.length;
	}
}
