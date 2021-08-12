package bolum05.sorular;

/*
 * (ASCII karakter tablosunu gösterme) ASCII karakter tablosunda !​’den ~​ ‘ye kadar olan karakterleri
 * gösteren bir program yazınız. Her satırda on karakter gösteriniz. Ek B’de ASCII tablosu verilmiştir. Karakterler
 * arasında tam olarak bir boşluk bulunmalıdır. 
 */

public class B05S15 {

	public static void main(String[] args) {
		final int HER_SATIRDAKI_SAYI_SAYISI = 10;
		int sayac = 0;
		
		for (int i = 33; i <= 126 ; i++) {
			sayac++;
			
			if (sayac % 10 == 0) {
				System.out.println((char)i);
			} else {
				System.out.print((char)i + " ");
			}
		}
		System.out.println();
	}
}
