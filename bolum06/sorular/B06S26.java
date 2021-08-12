package bolum06.sorular;

/*
 * (Palindrom asal sayılar) Palindrom asay sayı; hem asal sayı hem de palindrom olan sayılardır.
 * Örneğin 131 hem asal hem de palindromdur. 313 ve 757 de aynı şekilde. İlk 100 palindromic asal sayıyı
 * gösteren bir program yazınız. Her satırda 10 sayı ve aralarında bir boşluk olacak şekilde gösteriniz.
 * 
 * 2 3 5 7 11 101 131 151 181 191
 * 313 353 373 383 727 757 787 797 919 929
 * ...
 */

public class B06S26 {

	public static void main(String[] args) {
		final int ASAL_PALINDROM_SAYISI = 100;
		final int SATIR_BASINA_SAYI = 10;
		
		int sayac = 0;
		int n = 2;
		
		while (sayac < ASAL_PALINDROM_SAYISI) {
			if(asalPalindromSayisiMi(n)) {
				sayac++; 
				System.out.print(sayac % SATIR_BASINA_SAYI == 0 ? n + "\n" : n + " ");
			}
			n++;
		}
	}
	
	public static boolean asalPalindromSayisiMi(int sayi) {
		return AsalSayiYazdirMetod.asalMi(sayi) && 
				B06S03.palindromeSayi(sayi);
	}
}
