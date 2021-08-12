package bolum06.sorular;

/*
 * (Karakterleri gösterme) Aşağıdaki bildirime sahip ve karakterleri yazan bir metot yazınız:
 * 
 * public static void ​printChars(​char ​ch1, ​char ​ch2, ​int ​numberPerLine)
 * 
 * Bu metot ​ch1​ ve ​ch2​ arasındaki tüm karakterleri “numberPerLine” parametresinde belirtilen sayıya göre
 * gösterir.​  Her satırda 10 karakter olacak şekilde 1 ‘den Z ‘ye kadar sayıları gösteren bir test programı
 * yazınız. Karakterler arasında tam olarak bir boşluk bulunmalıdır.
 */

public class B06S12 {

	public static void main(String[] args) {
		
		final int SATIRDAKI_KARAKTER_SAYISI = 10;
		char ch1 = '1';
		char ch2 = 'Z';
		
		System.out.println("\n1'den Z' ye kadar olan karakter sıralaması: ");
		karakterYazdir(ch1, ch2, SATIRDAKI_KARAKTER_SAYISI);
		System.out.println();
	}
	
	public static void karakterYazdir(char ch1, char ch2, int satirSayisi) {
		for (char c = ch1, sayac = 1; c <= ch2; c++, sayac++) {
			if (sayac % satirSayisi == 0) {
				System.out.println(c);
			} else 
				System.out.print(c + " ");
		}
	}
}
