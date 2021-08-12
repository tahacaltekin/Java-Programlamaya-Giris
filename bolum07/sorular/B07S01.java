package bolum07.sorular;

/*
 * (Not verme) Öðrencilerin notlarýný akuyup, en iyi notu bulan ve aþaðýdaki þemaya göre notun harf
 * karþýlýðýný veren bir program yazýnýz:
 * 
 * En iyi notun ­10 altýndaysa A
 * En iyi notun ­20 altýndaysa B
 * En iyi notun ­30 altýndaysa C
 * En iyi notun ­40 altýndaysa D
 * Bunun da altýndaysa F
 * 
 * Kullanýcý toplam öðrenci sayýsýný ve ardýndan sýrasýyla öðrencilerin notlarýný girecek. Program
 * notlarý hesaplayýp harf karþýlýðýný gösterecek.
 */

import java.util.Scanner;

public class B07S01 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Öðrenci sayýsýný giriniz: ");
		int[] puan = new int[girdi.nextInt()];
		char[] harfNot = new char[puan.length];
		
		
		System.out.println(puan.length + " Öðrencinin puanlarýný sýrasýyla giriniz: ");
		for (int i = 0; i < puan.length; i++) {
			puan[i] = girdi.nextInt();
		}
		
		harfNotunuGetir(puan, harfNot);
		
		
		for (int i = 0; i < puan.length; i++) {
			System.out.println(i + " Öðrencinin puaný " + puan[i] + " ve harf notu " + harfNot[i]);
		}
	}
	
	public static int max(int[] dizi) {
		int max = dizi[0];
		for (int i = 1; i < dizi.length; i++) {
			if (dizi[i] > max) {
				max = dizi[i];
			}
		}
		
		return max;
	}
	
	
	public static void harfNotunuGetir(int[] puan, char[] harfNotu) {
		int enIyi = max(puan);
		for (int i = 0; i < puan.length; i++) {
			if (puan[i] >= enIyi - 10) {
				harfNotu[i] = 'A';
			} else if (puan[i] >= enIyi - 20) {
				harfNotu[i] = 'B';
			} else if (puan[i] >= enIyi - 30) {
				harfNotu[i] = 'C';
			} else if (puan[i] >= enIyi - 40) {
				harfNotu[i] = 'D';
			} else {
				harfNotu[i] = 'F';
			}
		}
	}
}
