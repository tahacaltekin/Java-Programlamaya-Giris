package bolum05.sorular;

/*
 * (D�ng�lerle a�a��daki 4 deseni olu�turunuz) �� i�e d�ng�leri kullanarak 4 farkl� programla a�a��daki
 * desenleri olu�turunuz.
 */

public class B05S18D {

	public static void main(String[] args) {
		
		System.out.println("Desen D");
		
		for (int satir = 0; satir < 6; satir++) {
			for (int i = 0; i < satir; i++) {
				System.out.print("  ");
			}
			for (int sutun = 0; sutun < 6 - satir; sutun++) {
				System.out.print((sutun + 1) + " ");
			}
			System.out.println();
		}
	}
}
