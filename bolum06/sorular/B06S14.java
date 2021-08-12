package bolum06.sorular;

/*
 * (yaklaşık p) p değeri aşağıdaki seriler kullanılarak hesaplanabilir:
 * 
 * m(i) = 4(1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ... + (((-1)^i + 1) / (2i - 1)))
 * 
 * Verilen i değeri için ​m(i)​ değerlerini hesaplayan bir metot yazınız ve aşağıdaki tabloyu gösteren bir test
 * programı yazınız:
 * 
 * 
 *    i 		m(i)
 *  ­­­­­­­­­­­­­­­­­­­
 *    1 		4.0000
 *    101 		3.1515
 *    201 		3.1466
 *    301 		3.1449
 *    401 		3.1441
 *    501 		3.1436
 *    601 		3.1433
 *    701 		3.1430
 *    801 		3.1428
 *    901 		3.1427	
 */

public class B06S14 {

	public static void main(String[] args) {
		
		double baslangic = 1;
		double bitis = 901;
		
		System.out.println("i           m(i)\n" + 
						   "---------------------");
		
		for (double i = baslangic; i <= bitis; i += 100) {
			System.out.printf("%-12.0f", i);
			System.out.printf("%-6.4f\n", tahminPI(i));
		}
	}
	
	public static double tahminPI(double n) {
		double pi = 0;
		for (double i = 1; i <= n; i++) {
			pi += Math.pow(-1, i + 1) / (2 * i - 1);
		}
		
		pi *= 4;
		return pi;
	}
}
