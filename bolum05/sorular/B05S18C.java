package bolum05.sorular;

/*
 * (D�ng�lerle a�a��daki 4 deseni olu�turunuz) �� i�e d�ng�leri kullanarak 4 farkl� programla a�a��daki
 * desenleri olu�turunuz.
 */

public class B05S18C {

	public static void main(String[] args) {
		
		int satirSayisi = 6;
		
		System.out.println("Desen C");
		
		for (int satir = 0; satir <= satirSayisi; satir++) {
			for (int s = satirSayisi - satir; s >= 1; s--) {
				System.out.print("  ");
			}
			for (int sutun = satir; sutun >= 1; sutun--) {
				System.out.print(sutun + " ");
			}
			System.out.println();
		}
	}
}
