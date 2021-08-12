package bolum07.sorular;

/*
 * (​Desen tanıma: ardışık dört eşit sayı) Dizideki aynı değere sahip dört ardışık sayıyı bulan aşağıdaki
 * bildirime sahip bir metod yazınız.
 * 
 * public static boolean​ isConsecutiveFour(​int​[] values)
 * Kullanıcıdan bir tam sayı dizisi alan ve  dizideki aynı değere sahip dört ardışık sayı olup
 * olmadığını arayan bir test programı yazınız. Programınız öncelikle kullanıcıdan dizinin
 * boyutunu almalıdır. 
 */
import java.util.Scanner;

public class B07S30 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Dizinin eleman sayısını giriniz: ");
		int[] elemanSayisi = new int[girdi.nextInt()];
		
		System.out.println("Dizinin elemanlarını giriniz: ");
		for (int i = 0; i < elemanSayisi.length; i++) {
			elemanSayisi[i] = girdi.nextInt();
		}
		
		System.out.println("Dizide aynı sayıdan arka arkaya 4 tane" + (ardisikSayi(elemanSayisi) ? " var" : " yok"));
	}
	
	public static boolean ardisikSayi(int[] elemanSayisi) {
		int sayac = 1;
		
		for (int i = 0; i < elemanSayisi.length - 1; i++) {
			if(elemanSayisi[i] == elemanSayisi[i + 1]) {
				sayac++;
			}
			
			if(sayac >= 4) {
				return true;
			}
			
			if(elemanSayisi[i] != elemanSayisi[i + 1]) {
				sayac = 1;
			}
		}
		return false;
	}
}
