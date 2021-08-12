package bolum07.sorular;

/*
 * (​Rasgele sayı seçme) Arguman olarak gönderilen sayılar haricinde 1 ile 54 arasında rasgele bir sayı
 * geri döndüren bir metod yazınız. Metod bildirimi aşağıdaki şekildedir:
 * 
 * public static int​ getRandom(​int​... numbers)
 */

public class B07S13 {

	public static int rastgeleSayi(int... sayilar) {
		int sayi;
		boolean sayiHaricMi;
		
		do {
			sayiHaricMi = false;
			sayi = 1 + (int)(Math.random() * 5);
			for (int i : sayilar) {
				if ( sayi == i) {
					sayiHaricMi = true;
				}
			}
		} while (sayiHaricMi);
		return sayi;
	}
}
