package bolum05.sorular;

/*
 * (Her ay�n ilk g�n�) Kullan�c�dan y�l� ve y�l�n ilk g�n�n� alan ve o y�l�n her ay�n�n ilk g�nlerini g�steren
 * bir program yaz�n�z. �rne�in, kullan�c� y�l� 2013 ve y�l�n ilk g�n� olan Sal� i�in 2 girdiyse, program �u ��kt�y�
 * vermelidir:
 * 
 * 1 Ocak, 2013 Sal�
 * ...
 * 1 Aral�k, 2013 Pazar
 */

import java.util.Scanner;

public class B05S28 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir Y�l giriniz: ");
		int yil = girdi.nextInt();
		
		System.out.println("Y�l�n ilk g�n�n� giriniz: ");
		int gun = girdi.nextInt();
		
		String cikti;
		
		for (int ay = 1; ay <= 12; ay++) {
			cikti = "";
			
			switch (ay) {
			case 1: cikti += "Ocak "; break;
			case 2: cikti += "�ubat "; break;
			case 3: cikti += "Mart "; break;
			case 4: cikti += "Nisan "; break;
			case 5: cikti += "May�s "; break;
			case 6: cikti += "Haziran "; break;
			case 7: cikti += "Temmuz "; break;
			case 8: cikti += "A�ustos "; break;
			case 9: cikti += "Eyl�k "; break;
			case 10: cikti += "Ekim "; break;
			case 11: cikti += "Kas�m "; break;
			case 12: cikti += "Aral�k "; break;
				
			}
			cikti += "1, " + yil;
			
			gun %= 7;
			
			switch (gun) {
			case 0: System.out.println(cikti + " Pazar"); break;
			case 1: System.out.println(cikti + " Pazartesi"); break;
			case 2: System.out.println(cikti + " Sal�"); break;
			case 3: System.out.println(cikti + " �ar�amba"); break;
			case 4: System.out.println(cikti + " Per�embe"); break;
			case 5: System.out.println(cikti + " Cuma"); break;
			case 6: System.out.println(cikti + " Cumartesi"); break;
			}
			
			if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12) {
				gun += 31;
			} else if (ay == 4 || ay == 6 || ay == 9 || ay == 11) {
				gun += 30;
			} else {
				if (((yil % 4 == 0) && (yil % 100 != 0)) || (yil % 400 == 0)) {
					gun += 29;
				} else {
					gun += 28;
				}
			}
		}
	}
}
