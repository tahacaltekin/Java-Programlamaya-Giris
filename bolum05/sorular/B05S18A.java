package bolum05.sorular;

/*
 * (Döngülerle aþaðýdaki 4 deseni oluþturunuz) Ýç içe döngüleri kullanarak 4 farklý programla aþaðýdaki
 * desenleri oluþturunuz.
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
