package bolum05.sorular;

/*
 * (En büyüğün tekrar sayısı) Tam sayıları okuyan ve bunların en büyüğünü bulup bu sayının kaç kere
 * tekrarlandığını hesaplayan bir program yazınız. 0​ girilene kadar sayı girişi devam etsin. 3 5 2 5 5 5 0​ girildiğini
 * varsayalım. Program en büyük sayı olan 5​’i bulacak ve 5​ sayısının 4​ kere tekrarlandığını hesaplayacak.
 * (İpucu: max​ ve count ​isimli iki değişken bildirin. max​ o anki en büyük sayıyı ve count​ onun tekrar sayısını tutsun.
 * Başlangıç olarak ilk sayıyı max​’a atayın ve count​’u 1​ yapın. max​ değerini takip eden her bir sayı ile karşılaştırın.
 * Eğer sayı max​’tan daha büyükse, onu max​’a atayın ve count ​değişkenini tekrar 1​ yapın. Eğer sayı max​’a eşitse
 * count ​değerini 1​ arttırın.) 
 */

import java.util.Scanner;

public class B05S41 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Sayılar Giriniz: (bitmesi için 0 giriniz.)");
		int enBuyuk = girdi.nextInt();
		int sayac = 1;
		int sayi = girdi.nextInt();
		
		while (sayi > 0) {
			sayi = girdi.nextInt();
			if (sayi > enBuyuk) {
				enBuyuk = sayi;
				sayac = 1;
			}
			if (sayi == enBuyuk) {
				sayac++;
			}
		}
		
		System.out.println("Girilen En büyük sayı: " + enBuyuk);
		System.out.println("Girilen en büyük sayının adedi: " + sayac);
	}
}
