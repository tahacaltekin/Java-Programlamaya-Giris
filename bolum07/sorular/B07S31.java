package bolum07.sorular;

/*
 * ​ (​Sıralı iki diziyi birleştirme) İki sıralı diziyi birleştirip yeni bir sıralı dizi oluşturan aşağıdaki
 * bildirime sahip bir metot yazınız.
 * 
 * public static int​[] merge(​int​[] list1,​ int​[] list2)
 * 
 * Metodu en fazla  ​list1.length​ +​ list2. length​ toplam sayısını geçmeyecek kadar karşılaştırma
 * yapacak şekilde yazınız. Kullanıcıdan iki sıralı dizi girmesini isteyen ve birleştirilmiş diziyi
 * gösteren bir test programı yazınız. Örnek akışı inceleyiniz. Girilen ilk sayının dizinin eleman
 * sayısını göstereceğini unutmayınız. Bu sayı dizinin bir elemanı olmayacaktır.
 */

import java.util.Scanner;

public class B07S31 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Dizi1 için İlk başta dizinin elemanın sayısını daha sonra dizinin elemanlarını yazınınız: ");
		int[] dizi1 = new int[girdi.nextInt()];
		for (int i = 0; i < dizi1.length; i++) {
			dizi1[i] = girdi.nextInt();
		}
		
		System.out.println("Dizi2 için İlk başta dizinin elemanın sayısını daha sonra dizinin elemanlarını yazınınız: ");
		int[] dizi2 = new int[girdi.nextInt()];
		for (int i = 0; i < dizi2.length; i++) {
			dizi2[i] = girdi.nextInt();
		}
		
		int[] dizi3 = birlestir(dizi1, dizi2);
		
		
		System.out.print("Birleştirilen dizi:");
		for (int i : dizi3) {
			System.out.print(" " + i); 
		}
		
		System.out.println();
 	}
	
	public static int[] birlestir(int[] dizi1, int[] dizi2) {
		int dizi3[] = new int[dizi1.length + dizi2.length];
		
		for (int i = 0; i < dizi1.length; i++) {
			dizi3[i] = dizi1[i];
		}
		
		for (int i = 0, j = dizi1.length; i < dizi2.length; i++, j++) {
			dizi3[j] = dizi2[i];
		}
		
		sort(dizi3);
		
		return dizi3;
	}
	
	public static void sort(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			int enKucuk = dizi[i];
			int enKucukIndeks = i;
			
			for (int j = i + 1; j < dizi.length; j++) {
				if(dizi[j] < enKucuk) {
					enKucuk = dizi[j];
					enKucukIndeks = j;
				}
			}
			
			if(enKucukIndeks != i) {
				dizi[enKucukIndeks] = dizi[i];
				dizi[i] = enKucuk;
			}
		}
	}
}
