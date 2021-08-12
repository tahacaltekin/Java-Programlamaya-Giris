package bolum07.sorular;

/*
 *  (​Baloncuk (Bubble) sıralaması) Baloncuk sıralaması algoritmasını kullanan bir sıralama metodu
 * yazınız. Baloncuk sıralaması algortiması diziye defalarca erişir ve  üzerinde işlem yapar. Her erişimde
 * komşu olan iki değer karşılaştırılır. Eğer bu çift doğru sırada değilse, değerleri takas edilir; doğru sırada
 * ise değişmeden kalırlar. Bu algortimaya boluncuk sıralaması denmesinin nedeni küçük değerler bir
 * baloncuk gibi adım adım yukarı yükselirken, büyük değerler aşağı doğru ilerler. On tane gerçek sayı alan
 * ve bu metodu çağırarak sayıları sıralanmış olarak  gösteren bir test programı yazınız.
 */

import java.util.Scanner;

public class B07S18 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		double[] sayilar = new double[10];
		
		System.out.print("10 tane sayı giriniz: ");
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = girdi.nextDouble();
		}
		
		baloncukSiralamasi(sayilar);
		
		for (double d : sayilar) {
			System.out.print(d + " ");
		}
		
		System.out.println();
	}
	
	public static void baloncukSiralamasi(double[] dizi) {
		double gecici;
		boolean degistir;
		
		do {
			degistir = false;
			for (int i = 0; i < dizi.length - 1; i++) {
				if (dizi[i] > dizi[i + 1]) {
					gecici = dizi[i];
					dizi[i] = dizi[i + 1];
					dizi[i + 1] = gecici;
					degistir = true;
				}
			}
		} while(degistir);
	}
}
