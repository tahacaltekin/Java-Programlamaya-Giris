package bolum06.sorular;

/*
 *  ​(Rastgele karakter üretme) Madde 6.10’daki RandomCharacter metodunu kullanarak her bir satırda
 * 10 tane olacak şekilde 100 tane Büyük Harf ve 100 tane Rakam’ı ekranda gösteriniz.
 */

public class B06S38 {

	public static void main(String[] args) {
		final int BUYUK_HARF_SAYISI = 100;
		final int RAKAM_SAYISI = 100;
		final int SATIRDAKI_KARAKTER_SAYISI = 10;
		
		
		for (int i = 1; i <= BUYUK_HARF_SAYISI; i++) {
			System.out.print(RassalKarakter.buyukHarfBul());
			System.out.print(i % SATIRDAKI_KARAKTER_SAYISI == 0 ? "\n" : " ");
		}
		
		for (int i = 1; i <= RAKAM_SAYISI; i++) {
			System.out.print(RassalKarakter.rakamBul());
			System.out.print(i % SATIRDAKI_KARAKTER_SAYISI == 0 ? "\n" : " ");
		}
	}
}
