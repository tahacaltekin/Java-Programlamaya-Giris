package bolum05.sorular;

/*
 * (Mükemmel sayý) Kendisi dýþýndaki tüm pozitif bölenlerinin toplamý kendisi olan pozitif bir tam sayýya
 * mükemmel sayý denir. Örneðin, 6 ilk mükemmel sayýdýr. 6 = 3 + 2 + 1 ikincisi ise, 28 = 14 + 7 + 4 + 2 + 1
 * 10.000’den küçük dört mükemmel sayý vardýr. Bu dört mükemmel sayýyý bulan bir program yazýnýz.
 */

public class B05S33 {

	public static void main(String[] args) {
		
		System.out.println("10000'den küçük 4 mükemmel sayý");
		int toplam;
		
		for (int i = 1; i < 10000; i++) {
			toplam = 0;
			
			for (int k = 1; k < i; k++) {
				if (i % k == 0)
					toplam += k;
			}
			
			if (i == toplam) 
				System.out.printf("%20d\n", i);
			
			for (int sayi = 1; sayi <= 10000; sayi++) {
				Boolean mukemmelSayi = i == toplam;
			}
		}
	}
}
