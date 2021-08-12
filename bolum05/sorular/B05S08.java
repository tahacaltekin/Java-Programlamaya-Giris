package bolum05.sorular;

/*
 * (En y�ksek puan� bulma.) Kullan�c�dan toplam ��renci say�s�n�  ve her ��rencinin ad� ve puan�n� alan ve
 * ard�ndan en y�ksek puana sahip ��rencinin ad�n� g�steren bir program yaz�n�z.
 */

import java.util.Scanner;

public class B05S08 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		
		int enYuksekSkor = 0;
		String enYuksekPuanAlanOgrenci = "";
		
		System.out.println("��renci say�s�n� giriniz: ");
		int ogrenciSayisi = girdi.nextInt();
		
		System.out.println("��renci ad�n� ve puan�n� giriniz: ");
		for (int i = 0; i < ogrenciSayisi; i++) {
			System.out.print(" ��renci: " + (i + 1) + 
					"\n Ad�: ");
			String isim = girdi.next();
			
			System.out.print(" Puan: ");
			int puan = girdi.nextInt();
			
			if (puan > enYuksekSkor) {
				enYuksekSkor = puan;
				enYuksekPuanAlanOgrenci = isim;
			}
		}
		
		System.out.println("En y�ksek puan� alan ��rencinin ad� " + enYuksekPuanAlanOgrenci + " puan�: " + enYuksekSkor);
	}
}
