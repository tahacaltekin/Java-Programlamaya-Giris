package bolum05.sorular;

/*
 * (2 ve 1000 aras�ndaki asal say�lar� g�sterme) Madde 5.15�i yeniden d�zenleyerek 2 ve 1000 (bu say�lar da
 * dahil) aras�ndaki t�m asal say�lar� g�steriniz. Her sat�rda sekiz asal say� g�steriniz. Sonu�lar aras�nda sadece bir
 * bo�luk olacak �ekilde g�steriniz.
 */

public class B05S20 {

	public static void main(String[] args) {
		final int HER_SATIRDAKI_SAYI_SAYISI = 8;
		int sayac = 0;

		System.out.println("2'den 1000'e kadar olan asal say�lar \n");
		
		for (int sayi = 2; sayi <= 1000; sayi++) {
			
			boolean asalSayi = true;
			
			for (int bolen = 2; bolen <= sayi / 2; bolen++) {
				if (sayi % bolen == 0) {
					asalSayi = false;
					break;
				}
			}
			
			if (asalSayi) {
				sayac++;
				
				if (sayac % HER_SATIRDAKI_SAYI_SAYISI == 0) {
					System.out.println(sayi);
				} else {
					System.out.print(sayi + " ");
				}
			}
		}
	}
}
