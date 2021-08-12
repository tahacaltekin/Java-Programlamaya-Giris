package bolum08.sorular;

/*
 * (​Matris oluşturma) Kullanıcıdan kare bir matrisin uzunluğunu alan, matrise rastgele 0 ve 1
 * değerleri ekleyip matrisi gösteren ve tüm satır, sütun ya da diyagonali aynı (0 ya da 1) elemanlardan
 * oluşanların indeksini gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B08S14 {

	public static void main(String[] args) {
		
		int[][] matris = matrisGetir();
		
		yazdir(matris);
		
		int[] satirlar = butunSatirlar(matris);
		int sayac = 0;
		for (int i = 0; i < satirlar.length; i++) {
			if(satirlar[i] >= 0) {
				System.out.println("Bütün " + satirlar[i] + " lar " + (i + 1) + ". satırda");
			} else {
				sayac++;
			} if (sayac == satirlar.length) {
				System.out.println("Aynı sayıdan aynı satırda yok");
			}
		}
		
		int[] sutunlar = butunSutunlar(matris);
		sayac = 0;
		for (int i = 0; i < sutunlar.length; i++) {
			if (sutunlar[i] >= 0) {
				System.out.println("Bütün " + sutunlar[i] + " lar " + (i + 1) + ". sutunda");
			} else {
				sayac++;
			} if (sayac == sutunlar.length) {
				System.out.println("Aynı sayıdan aynı sutunda yok");
			}
 		}
		
		int n = butunCaprazlar(matris);
		switch (n) {
		case 0: 
		case 1: System.out.println("Bütün " + n + " ler çapraz olarak sıralanmıştır.");
			break;
		default:  System.out.println("Aynı sayıdan çapraz olarak bulunmamaktadır.");
		}
		
		n = butunAltCaprazlar(matris);
		switch (n) {
		case 0:
		case 1: System.out.println("Bütün " + n + " ler alt çapraz olarak sıralanmıştır.");
			break;
		default: System.out.println("Aynı sayıdan alt çapraz olarak bulunmamaktadır.");
			break;
		}
	}
	
	public static int butunAltCaprazlar(int[][] m) {
		int[] sayac = new int[2];
		
		sayac[0] = 0;
		sayac[1] = 0;
		for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
			sayac[m[i][j]]++;
			if (sayac[0] == m.length) {
				return 0;
			} 
			if (sayac[1] == m.length) {
				return 1;
			}
		}
		return -1;
	}
	
	public static int butunCaprazlar(int[][] m) {
	int[] sayac = new int[2];
		
		sayac[0] = 0;
		sayac[1] = 0;
		for (int i = 0; i < m.length; i++) {
			sayac[m[i][i]]++;
			if (sayac[0] == m.length) {
				return 0;
			} 
			if (sayac[1] == m.length) {
				return 1;
			}
		}
		return -1;
	}
	
	public static int[] butunSutunlar(int[][] m) {
		
		int[] sonuc = new int[m.length];
		for (int i = 0; i < sonuc.length; i++) {
			sonuc[i] = -1;
		}
		
		int[] sayac = new int[2];
		for (int i = 0; i < m.length; i++) {
			
			sayac[0] = 0;
			sayac[1] = 0;
			
			for (int j = 0; j < m[i].length; j++) {
				sayac[m[j][i]]++;
				if (sayac[0] < j + 1 && sayac[1] < j + 1) {
					break;
				}
			}
			
			if (sayac[0] >= m.length || sayac[1] >= m.length) 
				sonuc[i] = sayac[0] > sayac[1] ? 0 : 1;
		}
		
		return sonuc;
	}
	
	public static int[] butunSatirlar(int[][] m) {
		
		int[] sonuc = new int[m.length];
		for (int i = 0; i < sonuc.length; i++) {
			sonuc[i] = -1;
		}
		
		int[] sayac = new int[2];
		for (int i = 0; i < m.length; i++) {
			
			sayac[0] = 0;
			sayac[1] = 0;
			
			for (int j = 0; j < m[i].length; j++) {
				sayac[m[i][j]]++;
				if (sayac[0] < j + 1 && sayac[1] < j + 1) {
					break;
				}
			}
			
			if (sayac[0] >= m.length || sayac[1] >= m.length) 
				sonuc[i] = sayac[0] > sayac[1] ? 0 : 1;	
		}
		
		return sonuc;
	}
	
	public static int[][] matrisGetir() {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Matrisin boyutunu giriniz: ");
		int boyut = girdi.nextInt();
		int[][] m = new int[boyut][boyut];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int)(Math.random() * 2);
			}
		}
		return m;
	}
	
	
	public static void yazdir(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
}
