package bolum05.sorular;

/*
 * (e sayısı hesaplama) Aşağıdaki seriyi kullanarak e​ sayısının yaklaşık değerini hesaplayabilirsiniz:
 * 
 * e = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / 4! + ... + 1 / i!
 * 
 * i = 10000, 20000,​ …, ve 100000​. için e değerlerini gösteren bir program yazınız. (İpucu:  i! = i * (i ­ 1)
 * c * 2 * 1, olduğu zaman
 * 
 * 1 / i! is 1 / (i(i - 1)!)
 * 
 * e​ ve item​’değişkenine ilk değeri 1​ olarak verip, e​ ‘ye yeni item​ eklemeye devam ediniz. Yeni eklenen item ​değeri,
 * bir önceki item​’in i = 2, 3, 4, ....​ için i​ ‘ye bölümüdür
 */

public class B05S26 {

	public static void main(String[] args) {
		// 10.000 için e değeri
		
		double e = 0.0;
		double deger = 10000.0;
		
		for (double i = 1; i <= deger; i++) {
			double payda = i;
			for (double k = i - 1; k >= 1; k--) {
				payda *= k;
			}
			
			e += 1 / payda;
		}
		
		System.out.println("10.000 için e değeri: " + e);
		
		// 20.000 için e değeri
		e = 0.0;
		deger = 20000;
		
		for (double i = 1; i <= deger; i++) {
			double payda = i;
			for (double k = i - 1; k >= 1; k--) {
				payda *= k;
			}
			
			e += 1 / payda;
		}
		
		System.out.println("20.000 için e değeri: " + e);
		
		// 100.000 için e değeri
				e = 0.0;
				deger = 100000;
				
				for (double i = 1; i <= deger; i++) {
					double payda = i;
					for (double k = i - 1; k >= 1; k--) {
						payda *= k;
					}
					
					e += 1 / payda;
				}
				
				System.out.println("100.000 için e değeri: " + e);
	}
}
