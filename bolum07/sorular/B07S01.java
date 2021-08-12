package bolum07.sorular;

/*
 * (Not verme) ��rencilerin notlar�n� akuyup, en iyi notu bulan ve a�a��daki �emaya g�re notun harf
 * kar��l���n� veren bir program yaz�n�z:
 * 
 * En iyi notun �10 alt�ndaysa A
 * En iyi notun �20 alt�ndaysa B
 * En iyi notun �30 alt�ndaysa C
 * En iyi notun �40 alt�ndaysa D
 * Bunun da alt�ndaysa F
 * 
 * Kullan�c� toplam ��renci say�s�n� ve ard�ndan s�ras�yla ��rencilerin notlar�n� girecek. Program
 * notlar� hesaplay�p harf kar��l���n� g�sterecek.
 */

import java.util.Scanner;

public class B07S01 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("��renci say�s�n� giriniz: ");
		int[] puan = new int[girdi.nextInt()];
		char[] harfNot = new char[puan.length];
		
		
		System.out.println(puan.length + " ��rencinin puanlar�n� s�ras�yla giriniz: ");
		for (int i = 0; i < puan.length; i++) {
			puan[i] = girdi.nextInt();
		}
		
		harfNotunuGetir(puan, harfNot);
		
		
		for (int i = 0; i < puan.length; i++) {
			System.out.println(i + " ��rencinin puan� " + puan[i] + " ve harf notu " + harfNot[i]);
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
