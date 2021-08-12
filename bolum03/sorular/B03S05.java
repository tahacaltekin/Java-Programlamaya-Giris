package bolum03.sorular;

/*
 * (Haftan�n g�n�) Kullan�c�dan bug�ne kar��l�k gelen bir tam say� (Pazar � 0, Pazartesi � 1, �, ve
 * Cumartesi � 6 olacak �ekilde) alan bir program yaz�n�z. Ayn� zamanda kullan�c�dan, �bug�nden ka� g�n
 * sonra� i�in de bir tam say� de�eri alarak,  ona kar��l�k gelen g�n� g�steriniz. 
 */

import java.util.Scanner;

public class B03S05 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("G�nleri belirten bir say� giriniz: �rn: pazar 0 pazartesi 1 cumartesi 6");
		int gun = girdi.nextInt();
		
		System.out.println("Ka� g�n sonras�n� bilmek istersiniz: ");
		int sayi = girdi.nextInt();
		
		int gelecekGun = (gun + sayi) % 7;
		
		switch (gun) {
		case 0: System.out.println("Bug�n g�nlerden pazar"); break;
		case 1: System.out.println("Bug�n g�nlerden pazartesi"); break;
		case 2: System.out.println("Bug�n g�nlerden sal�"); break;
		case 3: System.out.println("Bug�n g�nlerden �ar�amba"); break;
		case 4: System.out.println("Bug�n g�nlerden per�embe"); break;
		case 5: System.out.println("Bug�n g�nlerden cuma"); break;
		case 6: System.out.println("Bug�n g�nlerden cumartesi"); break; 
		}
		
		switch (gelecekGun) {
		case 0: System.out.println(sayi + " g�n sonras� pazar"); break;
		case 1: System.out.println(sayi + " g�n sonras� pazartesi"); break;
		case 2: System.out.println(sayi + " g�n sonras� sal�"); break;
		case 3: System.out.println(sayi + " g�n sonras� �ar�amba"); break;
		case 4: System.out.println(sayi + " g�n sonras� per�embe"); break;
		case 5: System.out.println(sayi + " g�n sonras� cuma"); break;
		case 6: System.out.println(sayi + " g�n sonras� cumartesi"); break;
		}
	}
}
