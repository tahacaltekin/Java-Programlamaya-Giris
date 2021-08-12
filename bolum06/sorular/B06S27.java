package bolum06.sorular;

/*
 *  ​(Lasa) Lasa (asal’ın tersten yazılışı) palindrom olmayan asal sayıların tersten yazılışları da asal
 * sayı olan sayılardır. Örneğin 17 asal sayıdır ve tersi olan 71 de asal sayıdır. Bu durumda 17 ve 71 sayıları
 * Lasa’dır.  İlk yüz Lasa yı gösteren bir program yazınız.  Her satırda 10 sayı ve aralarında bir boşluk
 * olacak şekilde gösteriniz.
 * 
 * 13 17 31 37 71 73 79 97 107 113
 * 149 157 167 179 199 311 337 347 359 389
 * ...
 */

public class B06S27 {

	public static void main(String[] args) {
		final int ASAL_OLMAYAN_SAYILARIN_SAYISI = 100;
		final int SATIR_BASINA_SAYI = 10;
		
		int sayac = 0;
		int n = 2;
		
		while(sayac < ASAL_OLMAYAN_SAYILARIN_SAYISI) {
			if(asalDegilMi(n)) {
				sayac++;
				System.out.print(sayac % SATIR_BASINA_SAYI == 0 ? n + "\n" : n + " ");
			}
			
			n++;
		}
	}
	
	public static boolean asalDegilMi(int sayi) {
		return AsalSayiYazdirMetod.asalMi(sayi) && 
				!B06S03.palindromeSayi(sayi) && 
				AsalSayiYazdirMetod.asalMi(B06S03.tersineSayi(sayi));
	}
}
