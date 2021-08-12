package bolum06.sorular;

/*
 * (0 ve 1 matrisi oluşturma)Aşağıdaki bildirime sahip, nxn boyutunda matris oluşturan bir metot
 * yazınız.
 * 
 * public static void ​printMatrix(​int ​n)
 * 
 * Matrisin her elemanı olan 0 ya da 1 rastgele üretiniz. Kullanıcıdan n değerini alan ve ekranda nxn
 * boyutunda bir matris gösteren test programını yazınız.
 */

import java.util.Scanner;

public class B06S17 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Matris için bir n değeri giriniz: ");
		int n = girdi.nextInt();
		
		matrisiYazdir(n);
	}
	
	public static void matrisiYazdir(int n) {
		for (int satir = 0; satir < n; satir++) {
			for (int sutun = 0; sutun < n; sutun++) {
				
				System.out.print(((int)(Math.random() * 2) + " "));
			}
			
			System.out.println();
		}
	}
}
