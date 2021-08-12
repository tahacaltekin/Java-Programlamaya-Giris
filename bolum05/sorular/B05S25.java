package bolum05.sorular;

/*
 * ​ (Pi hesaplama) Aşağıdaki seriyi kullanarak Pi sayısının yaklaşık değerini hesaplayabilirsiniz.
 * 
 * PI = 4(1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ... + ((-1)i + 1 /  2i - 1))
 * 
 * i = 10000, 20000,​ …, ve 100000​. için Pi değerlerini gösteren bir program yazınız.
 */

public class B05S25 {

	public static void main(String[] args) {
		// 10.000 için PI değeri
		
		double toplam = 0;
		double deger = 10000.0;
		
		for (double i = 1; i <= (2 * deger - 1); i += 2) {
			toplam += 1 / i;
			i += 2;
			toplam -= 1/ i;
		}
		
		double pi = 4 * toplam;
		
		System.out.println("10.000 için PI değeri: " + pi);
		
		
		// 20.000 için PI değeri
		
		toplam = 0;
		deger = 20000.0;
		
		for (double i = 1; i <= (2 * deger - 1); i += 2) {
			toplam += 1 / i;
			i += 2;
			toplam -= 1 /i;
		}
		
		pi = 4 * toplam;
				
		System.out.println("20.000 için PI değer: " + pi);
		
		// 100.000 için PI değeri 
		
		toplam = 0;
		deger = 100000.0;
		
		for (double i = 1; i <= (2 * deger - 1); i += 2) {
			toplam += 1 /i;
			i += 2;
			toplam -= 1 /i;
		}
		pi = 4 * toplam;
		
		System.out.println("100.000 için PI değer: " + pi);
	}
}
