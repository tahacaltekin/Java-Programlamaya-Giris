package bolum07.sorular;

/*
 *  (​İstatistik: standart sapma) Programlama Alıştırmaları 5.45 girilen sayıların standart sapmasını
 * hesaplar. Bu alıştırma​ n​ adet sayının standart sapmasını hesaplamak için farklı ancak ona eşdeğer bir
 * formül kullanıyor.
 * 
 * Bu formülle standart sapmayı hesaplamak için her bir sayıyı bir dizide saklamalısınız ki
 * ortalama hesaplandıktan sonra tekrar kullanılabilsin.
 * 
 * Programınız aşağıdaki metotlardan oluşabilir:
 * 
 * double değerlerin sapmasını hesaplar 
 * public static double​ deviation(​double​[] x)
 * 
 * double türden bir dizinin ortalamasını hesaplar 
 * public static double​ mean(​double​[] x)
 * 
 * Aşağıdaki örnek akışta gösterildiği gibi, kullanıcıdan on adet sayı girmesini isteyen ve bu
 * sayıların standart sapmasını ve ortalamasını gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B07S11 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		double[] sayilar = new double[10];
		
		System.out.println("10 tane sayı giriniz: ");
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = girdi.nextDouble();
		}
		
		System.out.println("Girilen sayıların ortalaması: " + (int)(ortalama(sayilar) * 1000) / 1000.0);
		System.out.println("Girilen sayıların standart sapması: " + (int)(sapma(sayilar) * 100000) / 100000.0);
	}
	
	public static double sapma(double[] x) {
		double sapma = 0;
		double ortalama = ortalama(x);
		for (double e: x) {
			sapma += Math.pow(e - ortalama, 2);
		}
		return Math.sqrt(sapma / (x.length - 1));
	}
	
	public static double ortalama(double[] x) {
		double ortalama = 0;
		for (double e: x) {
			ortalama += e;
		}
		
		return ortalama / x.length;
	}
}
