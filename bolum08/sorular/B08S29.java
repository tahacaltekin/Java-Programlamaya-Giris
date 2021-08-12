package bolum08.sorular;


/*
 * (​Eşit diziler) İki boyutlu ​m1 ​ve ​m2 ​dizilerinin elemanları aynı ise bu dizilere eşit dizler denir. ​m1​ ve
 * m2​ dizileri birbirine eşitse ​true​ dönen aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * 
 * public static boolean ​equals(​int​[][] m1, ​int​[][] m2)
 * 
 * Kullanıcıdan 3*3 boyutunda iki matrisin de elemanlarını alan ve bu dizilerin eşit olup olmadığını
 * gösteren bir program yazınız.
 * 
 */
import java.util.Scanner;

public class B08S29 {

	public static void main(String[] args) {
		System.out.print("Birinci diziyi giriniz: ");
		int[][] dizi1 = diziAl();
		System.out.print("İkinci Diziyi giriniz: ");
		int[][] dizi2 = diziAl();
		
		
		System.out.println("İki dizi birbirine" + (esitMi(dizi1, dizi2) ? " eşittir." : " eşit değildir."));
	}
	
	public static boolean esitMi(int[][] m1, int[][] m2) {
		
		int[] dizi1 = sirala(m1);
		int[] dizi2 = sirala(m2);
		for (int i = 0; i < dizi1.length; i++) {
				if (dizi1[i] != dizi2[i]) {
					return false;
				}
			}
		return true;
	}
	
	public static int[][] diziAl() {
		Scanner girdi = new Scanner(System.in);

		int[][] m = new int[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = girdi.nextInt();
			}
		}
		
		return m;
	}
	
	public static int[] sirala(int[][] m) {
		int[] dizi = dizidenMatrise(m);
		for (int i = 0; i < 3; i++) {
			
			int enKucuk = dizi[i];
			int enKucukIndeks = i;
			
			for (int j = i + 1; j < 3; j++) {
				if (enKucuk > dizi[j]) {
					enKucuk = dizi[j];
					enKucukIndeks = j;
				}
			}
			
			if (enKucukIndeks != i) {
				dizi[enKucukIndeks] = dizi[i];
				dizi[i] = enKucuk;
			}
		}
		
		return dizi;
	}
	
	public static int[] dizidenMatrise(int[][] m) {
		int[] dizi = new int[m.length * m[0].length];
		int a = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				dizi[a] = m[i][j];
				a++;
			}
		}
		
		return dizi;
	}
}
