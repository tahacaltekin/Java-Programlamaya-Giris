package bolum05.sorular;

/*
 * (Döngülerle aşağıdaki 4 deseni oluşturunuz) İç içe döngüleri kullanarak 4 farklı programla aşağıdaki
 * desenleri oluşturunuz.
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
