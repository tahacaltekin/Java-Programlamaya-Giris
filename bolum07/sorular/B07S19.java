package bolum07.sorular;

/*
 * ​ (​Sıralı mı?) Eğer dizi artan şekilde sıralanmış ise true değeri dönen aşağıdaki bildirime sahip bir
 * metot yazınız.
 * 
 * public static boolean​ isSorted(​int​[] list)
 * 
 * Kullanıcıdan bir dizi girmesini isteyen ve bu dizinin sıralanmış olup olmadığını kontrol eden bir
 * test programı yazınız. Örnek akışı inceleyiniz. Girilen ilk sayının dizinin eleman sayısını
 * göstereceğini unutmayınız. Bu sayı dizinin bir elemanı olmayacaktır.
 */

import java.util.Scanner;

public class B07S19 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Önce dizi için kaç tane sayı gireceğinizi sonra da sayıları yazınız: ");
		int[] dizi = new int[girdi.nextInt()];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = girdi.nextInt();
		}
		
		System.out.println("Girilen dizi " + (siraliMi(dizi) ? "zaten sıralı" : "sıralı değil"));
	}
	
	public static boolean siraliMi(int[] dizi) {
		for (int i = 0; i < dizi.length - 1; i++) {
			if (dizi[i] > dizi[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
