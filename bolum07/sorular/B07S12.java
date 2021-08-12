package bolum07.sorular;

/*
 *  (​Diziyi ters çevirme) Bölüm 7.7 deki​ reverse​ metodu bir dizinin elemanlarını yeni diziye
 * kopyalayarak ters çeviriyordu. Arguman olarak gelen dizi üzerinde ters çevirme işlemini yapacak ve bu
 * diziyi geri döndürecek şekilde, bu metodu yeniden yazınız. Kullanıcıdan on adet sayı alan ve bu metodu
 * çağırarak sayıları ters çevirip gösteren bir test programı yazınız.
 */

import java.util.Scanner;

public class B07S12 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		int[] sayilar = new int[10];
		
		System.out.println("10 tane sayı giriniz: ");
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = girdi.nextInt();
		}
		
		
		tersineCevir(sayilar);
		
		for (int i : sayilar) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	 
	public static void tersineCevir(int[] dizi) {
		int gecici;
		for (int i = 0, j = dizi.length - 1; i < dizi.length / 2; i++, j--) {
			gecici = dizi[i];
			dizi[i] = dizi[j];
			dizi[j] = gecici;
		}
	}
}
