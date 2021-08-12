package bolum05.sorular;

/*
 * (Döngülerle aþaðýdaki 4 deseni oluþturunuz) Ýç içe döngüleri kullanarak 4 farklý programla aþaðýdaki
 * desenleri oluþturunuz.
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
