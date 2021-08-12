package bolum07.sorular;

/*
 *  (​Seçmeli (selection) sıralama) Bölüm 7.11’de, bir diziyi sıralamak için seçmeli sıralama
 * algoritmasını kullanmıştık. Seçmeli sıralama metodu sürekli en küçük değeri bularak bunu ilk elemanla
 * takas eder. Bu programı en büyük elemanı bulacak ve bunu sonuncu ile takas edecek şekilde yeniden
 * yazınız. On tane ondalık sayı alan ve bu metodu çağırarak sayıları sıralanmış olarak  gösteren bir test
 * programı yazınız.
 */

import java.util.Scanner;

public class B07S20 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		double[] sayilar = new double[10];
		
		System.out.println("10 tane sayı giriniz: ");
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = girdi.nextDouble();
		}
		
		secimliSiralama(sayilar);
		
		
		for (double d : sayilar) {
			System.out.print(d + " ");
		}
		
		System.out.println();
	}
	
	public static void secimliSiralama(double[] dizi) {
		for (int i = dizi.length - 1; i >= 0; i--) {
			
			double SuankiEnBuyuk = dizi[i];
			int SuankiEnbuyukIndeks = i;
			
			for (int j = i - 1; j >= 0; j--) {
				if (SuankiEnBuyuk < dizi[j]) {
					SuankiEnBuyuk = dizi[j];
					SuankiEnbuyukIndeks = j;
				}
			}
			
			if (SuankiEnbuyukIndeks != i) {
				dizi[SuankiEnbuyukIndeks] = dizi[i];
				dizi[i] = SuankiEnBuyuk;
			}
		}
	}
}
