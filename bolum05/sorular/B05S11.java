package bolum05.sorular;

/*
 * (5 ya da 6’ya tam bölünen ancak her ikisine de tam bölünmeyen sayýlarý bulma) 100’sen 200’e kadar  5 ya
 * da 6’ya tam bölünen ancak her ikisine de tam bölünmeyenler olacak þekilde uygun sayýlarý gösteren bir program
 * yazýnýz. Sonuçlar arasýnda sadece bir boþluk olacak þekilde gösteriniz.
 */

public class B05S11 {

	public static void main(String[] args) {
		final int HER_SATIRDAKI_SAYI_SAYISI = 10;
		int sayac = 0;
		
		for (int i = 100; i <= 200; i++) {
			if (i % 5 == 0 ^ i % 6 == 0) {
				sayac++;
				if(sayac % HER_SATIRDAKI_SAYI_SAYISI == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}		
			} 
		}
		System.out.println();
	}
}
