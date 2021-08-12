package bolum07.sorular;

/*
 *  (​Eş diziler) Aynı elemanlara sahip olan   ​list1​ ve​ list2​ dizilerine eş diziler denir. Eğer  ​list1​ ve​ list2​  eş
 * dizilerse​ true​ dönen aşağıdaki bildirime sahip bir metod yazınız.
 * 
 * public static boolean​ equals(​int​[] list1,​ int​[] list2)
 * 
 * Kullanıcıdan iki tamsayı dizisi girmesini isteyen ve bu dizilerin eş olup olmadığını kontrol eden
 * bir test programı yazınız. Programın örnek akışını inceleyiniz: Girilen ilk sayının dizinin eleman
 * sayısını göstereceğini unutmayınız. Bu sayı dizinin bir elemanı olmayacaktır. 
 */
import java.util.Scanner;

public class B07S27 {

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
		
		
		System.out.println("2 dizi birbirine " + (esit(dizi1, dizi2) ? "eşit" : "eşit değil"));
	}
	
	public static boolean esit(int[] dizi1, int[] dizi2) {
		if(dizi1.length != dizi2.length) {
			return false;
		}
		
		sort(dizi1);
		sort(dizi2);
		for (int i = 0; i < dizi1.length; i++) {
			if(dizi1[i] != dizi2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void sort(int[] dizi) {
		for (int i = 0; i < dizi.length - 1; i++) {
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

