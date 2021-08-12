package bolum07.sorular;

/*
 * ​ (Listeyi bölümleme) İlk elamanı temel alacak (buna pivot denecek ) şekilde bir diziyi iki bölüme
 * ayıran aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * public static int​ partition(​int​[] list)
 * 
 * Bölümleme işlemi, pivot değere eşit ve daha küçük olanlar pivottan önce ve pivottan büyük
 * olanlar pivottan sonra yer alacak şekilde dizi yeniden düzenlenecek. Metot yeni oluşan dizide
 * pivot değerin bulunduğu indeksi geri dönecek. Örneğin;dizi {5, 2, 9, 3, 6, 8} girilmiş olsun.
 * Bölümleme işleminden sonra dizi {3, 2, 5, 9, 6, 8} şeklinde olacak. Metodu en fazla​ list.length
 * kadar karşılaştırma yapacak şekilde yazınız. Kullanıcıdan bir dizi girmesini isteyen ve
 * bölümleme işleminden sonra dizinin son durumunu gösteren bir program yazınız. Örnek akışı
 * inceleyiniz. Girilen ilk sayının dizinin eleman sayısını göstereceğini unutmayınız.
 * Bu sayı dizinin bir elemanı olmayacaktır.
 */

import java.util.Scanner;

public class B07S32 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Dizi için İlk başta dizinin elemanın sayısını daha sonra dizinin elemanlarını yazınınız: ");
		int[] dizi = new int[girdi.nextInt()];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = girdi.nextInt();
		}
		
		bolme(dizi);
		
		System.out.println("Bölümlemeden sonra dizinin görünümü: ");
		yazdir(dizi);
	}
	
	public static int bolme(int[] dizi) {
		int i = 0;
		for (int j = 1; j < dizi.length; j++) {
			if(dizi[j] < dizi[i]) {
				int gecici = dizi[j];
				System.arraycopy(dizi, i, dizi, i + 1, j - i);
				dizi[i] = gecici;
				i++;
			}
		}
		
		return i;
	}
	
	public static void yazdir(int[] dizi) {
		for (int i : dizi) {
			System.out.print(i + " ");
		}
	}
}
