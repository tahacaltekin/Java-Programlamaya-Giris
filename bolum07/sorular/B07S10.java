package bolum07.sorular;

/*
 *  (​En küçük elemanın indeksi) Tam sayılardan oluşan bir dizideki en küçük elemanın indeksini
 * döndüren bir metod yazınız. Birden birden fazla sonuç bulursanız en küçük indeksi geri döndürün.
 * Aşağıdaki bildirimi kullanınız:
 * 
 * public static int​ indexOfSmallestElement(​double​[] array)
 * 
 * Kullanıcıdan on adet sayı alan ve bu metodu çağırarak en küçük değeri gösteren gösteren bir test
 * programı yazınız.
 */

import java.util.Scanner;

public class B07S10 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		double[] sayilar = new double[10];
		
		System.out.println("10 sayı giriniz: ");
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = girdi.nextDouble();
		}
		System.out.println("En küçük sayı: " + sayilar[enKucukElemaninIndeksi(sayilar)] + " indeks: " + enKucukElemaninIndeksi(sayilar));
	}
	
	public static int enKucukElemaninIndeksi(double[] dizi) {
		if(dizi.length <= 1) {
			return 0;
		}
		
		double min = dizi[0];
		int enKucukIndeks = 0;
		for (int i = 1; i < dizi.length; i++) {
			if (dizi[i] < min) {
				min = dizi[i];
				enKucukIndeks = i;
			}
		}
		
		return enKucukIndeks;
	}
}
