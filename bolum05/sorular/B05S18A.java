package bolum05.sorular;

/*
 * (D�ng�lerle a�a��daki 4 deseni olu�turunuz) �� i�e d�ng�leri kullanarak 4 farkl� programla a�a��daki
 * desenleri olu�turunuz.
 */

public class B05S18A {

	public static void main(String[] args) {
		
		System.out.println("Desen A");
		for (int satir = 1; satir <= 6; satir++) {
			for (int sutun = 1; sutun <= satir; sutun++) {
				System.out.print(sutun + " ");
			}
			
			System.out.println();
		}
	}
}
