package bolum07.sorular;

/*
 * (​Tekrarlananları çıkar) Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki bildirime
 * sahip bir metot yazınız.
 * 
 * public static int​[] eliminateDuplicates(​int​[] list)
 * 
 * On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
 */

import java.util.Scanner;

public class B07S15 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		int[] sayilar = new int[10];
		
		System.out.println("10 tane sayı giriniz: ");
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = girdi.nextInt();
		}
		
		int[] farkliSayilar = yinelenenSayilariSil(sayilar);
		
		System.out.print("Girilen farklı sayılar: ");
		for (int i : farkliSayilar) {
			if(i > 0) {
				System.out.print(" " + i);
			}
		}
		
		System.out.println();
	}
	
	public static int[] yinelenenSayilariSil(int[] dizi) {
		int[] yinelenenSayiDizisi = new int[dizi.length];
		int i = 0;
		for (int e : dizi) {
			if(arama(yinelenenSayiDizisi, e) == -1) {
				yinelenenSayiDizisi[i] = e;
				i++;
			}
		}
		
		return yinelenenSayiDizisi;
	}
	
	public static int arama(int[] dizi, int anahtar) {
		for (int i = 0; i < dizi.length; i++) {
			if (anahtar == dizi[i]) {
				return i;
			}
		}
		return -1;
	}
}
