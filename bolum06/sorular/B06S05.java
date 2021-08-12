package bolum06.sorular;

/*
 * (Üç sayıyı sıralama) Üç sayıyı artan şekilde sıralayan aşağıdaki bildirime sahip bir metot yazınız.
 * public static void ​displaySortedNumbers(​double ​num1, ​double ​num2, ​double ​num3)
 * Kullanıcıdan 3 sayı alan ve bu metodu kullanarak kullanıcıya sayıları artan sıra ile gösteren bir test
 * programı yazınız.
 */

import java.util.Scanner;

public class B06S05 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Sayıları artan şekilde sıralamak için artan sayı giriniz: ");
		double sayi1 = girdi.nextDouble();
		double sayi2 = girdi.nextDouble();
		double sayi3 = girdi.nextDouble();
		
		sayilariSirala(sayi1, sayi2, sayi3);
	}
	
	public static void sayilariSirala(double sayi1, double sayi2, double sayi3) {
		double geciciSayi;
		
		if (sayi2 < sayi1 && sayi2 < sayi3) {
			geciciSayi = sayi1;
			sayi1 = sayi2;
			sayi2 = geciciSayi;
		} else if (sayi3 < sayi1 && sayi3 < sayi2) {
			geciciSayi = sayi1;
			sayi1 = sayi3;
			sayi3 = geciciSayi;
		} else if (sayi3 < sayi2) {
			geciciSayi = sayi2;
			sayi2 = sayi3;
			sayi3 = geciciSayi;
		}
		
		System.out.println(sayi1 + " " + sayi2 + " " + sayi3);
	}
}
