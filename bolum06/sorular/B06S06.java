package bolum06.sorular;

/*
 * (Desen oluşturma) Aşağıdaki deseni oluşturacak bir metot yazınız.
 * 
 *   			  1
 *    			2 1
 *       	      3 2 1
 *                      ...
 *          n n-1 ... 3 2 1
 * 
 * Metot bildirimi;
 * public static void ​displayPattern(​int ​n)
 */

import java.util.Scanner;

public class B06S06 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Satır sayısını giriniz: ");
		int satirSayisi = girdi.nextInt();
		
		deseniGoster(satirSayisi);
	}
	
	public static void deseniGoster(int n) {
		int desen = n - 1;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 0; j < desen; j++) {
				System.out.print("  ");
			}

			for (int r = i; r > 0; r--) {
				System.out.print(r + " ");
			}
			
			System.out.println();
			desen--;
		}
	}
}
