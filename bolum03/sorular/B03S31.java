package bolum03.sorular;

/*
 * (Finans: D�viz kuru) Kullan�c�dan Amerikan dolar� (USD) ve �in yuan� (RMB) paritesini alan bir
 * program yaz�n�z. Ekranda 0 girilirse USD�den RMB�ye, 1 girilirse RMB�den USD�ye d�n���m
 * yap�laca��n� g�sterin. Kullan�c� d�n���m se�imini yapt�ktan sonra miktar� girmesini isteyin ve yapt���
 * se�ime g�re USD �>RMB ya da RMB �> USD kar��l���n� ekranda g�steriniz. 
 */

import java.util.Scanner;

public class B03S31 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("USD > Yuan d�viz kurunu giriniz: ");
		double dovizKuru = girdi.nextDouble();
		
		System.out.println("USD > Yuan i�in 0, Yuan > USD d�n���m� i�in 1 yaz�n: ");
		int donusum = girdi.nextInt();
		
		double deger;
		
		if (donusum == 0) {
			System.out.println("Dolar Giriniz: ");
			deger = girdi.nextDouble();
			System.out.println("$" + deger + " = " + (deger * dovizKuru) + " Yuan");
		} else if (donusum == 1) { 
			System.out.println("Yuan Giriniz: ");
			deger = girdi.nextDouble();
			System.out.println(deger + " Yuan " + " = $" + ((int)((deger * 100) / dovizKuru)) / 100.0);			
		} else {
			System.out.println("Hatal� bir giri� yapt�n�z.");
		}		
	}
}
