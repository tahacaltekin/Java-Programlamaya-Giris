package bolum05.sorular;

/*
 * (D�ng�lerle a�a��daki 4 deseni olu�turunuz) �� i�e d�ng�leri kullanarak 4 farkl� programla a�a��daki
 * desenleri olu�turunuz.
 */

public class B05S18B {

	public static void main(String[] args) {
		
		System.out.println("Desen B");
		for (int satir = 6; satir >= 1; satir--) {
			for (int sutun = 1; sutun <= satir; sutun++) {
				System.out.print(sutun + " ");
			}
			System.out.println();
		}
	}
}
