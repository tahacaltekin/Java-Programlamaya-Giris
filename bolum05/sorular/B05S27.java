package bolum05.sorular;

/*
 * ​ (Artık yıllar) Her satırda on tane ve aralarında birer boşluk olacak şekilde 101’den 2100’e tüm artık
 * yılları gösteren bir program yazınız. Ayrıca bu zaman aralığında kaç artık yıl olduğunu gösteriniz.
 */

public class B05S27 {

	public static void main(String[] args) {
		System.out.println("101 - 2100 kadar olan artık yıllar: ");
		int sayac = 0;
		for (int yil = 101; yil <= 2100; yil++) {
			if ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0) {
				sayac++;
				
				System.out.print(yil + (sayac % 10 == 0 ? "\n" : " "));
			}
		}
		System.out.println();
	}
}
