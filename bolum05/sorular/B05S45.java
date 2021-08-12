package bolum05.sorular;

/*
 * (İstatistik:: Aritmetik ortalama ve standart sapma) İş uygulamalarında, genellikle verinin aritmetik
 * ortalamasını ve standart sapmasını hesaplamanız istenir. Aritmetik ortalama temel olarak sayıların ortalamasıdır.
 * Standart sapma veri setinin aritmetik ortalama etrafında ne kadar sıklıkla kümelendiğini gösteren bir istatistiktir.
 * 
 * Örneğin; sınıftaki öğrencilerin yaş ortalaması nedir? Yaşları birbirine ne kadar yakındır? Eğer tüm öğrenciler aynı
 * yaşta ise standart sapma sıfırdır.
 * Kullanıcıdan 10 sayı girmesini isteyin ve aşağıdaki formülü kullanarak bu sayıların aritmetik ortalamasını ve
 * standart sapmasını hesaplayıp gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B05S45 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		double ortalama;
		double standartSapma;
		double sayi;
		
		ortalama = standartSapma = 0;
		
		System.out.println("Aritmetik ortalama hesabı için 10 sayı giriniz: ");
		
		for (int i = 1; i <= 10; i++) {
			sayi = girdi.nextDouble();
			ortalama += sayi;
			standartSapma += Math.pow(sayi, 2);
		}
		
		standartSapma = Math.sqrt((standartSapma - (Math.pow(ortalama, 2) / 10)) / (10 - 1));
		ortalama /= 10;
		
		
		System.out.println("Girilen sayıların ortalaması: " + ortalama);
		System.out.printf("Girilen sayıların standart sapması: %.5f\n", standartSapma);
	}
}
