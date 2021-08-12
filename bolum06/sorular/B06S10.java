package bolum06.sorular;

/*
 * (isPrime​ metodunu kullan) Madde 6.7, PrimeNumberMethod.java, dosyasında sayının asal sayı olup
 * olmadığını test eden isPrime(int number) metodu bulunmaktadır. Bu metodu kullanarak ​10000​. ‘den
 * küçük asal sayıları bulan bir program yazınız. 
 */

public class B06S10 {

	public static void main(String[] args) {
		System.out.println("10000'den küçük asal sayılar");
		asalSayilariYazdir(1229);
	}

	private static void asalSayilariYazdir(int asalSayiAdedi) {
		final int SATIRDAKI_ASAL_SAYISI = 20;
		int asalSayiSayaci = 0;
		int sayi = 2;
		while(asalSayiSayaci < asalSayiAdedi) {
			if (asalMi(sayi)) {
				System.out.printf("%8d", sayi);
				asalSayiSayaci++;
				
				if(asalSayiSayaci % SATIRDAKI_ASAL_SAYISI == 0) {
					System.out.println();
				}
			}
			
			sayi++;
		}
	}
	
	public static boolean asalMi(int s) {
		
		for (int i = 2; i < s; i++) {
			if (s % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
