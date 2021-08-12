package bolum03.sorular;

/*
 * (Haftanýn günü) Kullanýcýdan bugüne karþýlýk gelen bir tam sayý (Pazar ­ 0, Pazartesi ­ 1, …, ve
 * Cumartesi ­ 6 olacak þekilde) alan bir program yazýnýz. Ayný zamanda kullanýcýdan, “bugünden kaç gün
 * sonra” için de bir tam sayý deðeri alarak,  ona karþýlýk gelen günü gösteriniz. 
 */

import java.util.Scanner;

public class B03S05 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Günleri belirten bir sayý giriniz: Örn: pazar 0 pazartesi 1 cumartesi 6");
		int gun = girdi.nextInt();
		
		System.out.println("Kaç gün sonrasýný bilmek istersiniz: ");
		int sayi = girdi.nextInt();
		
		int gelecekGun = (gun + sayi) % 7;
		
		switch (gun) {
		case 0: System.out.println("Bugün günlerden pazar"); break;
		case 1: System.out.println("Bugün günlerden pazartesi"); break;
		case 2: System.out.println("Bugün günlerden salý"); break;
		case 3: System.out.println("Bugün günlerden çarþamba"); break;
		case 4: System.out.println("Bugün günlerden perþembe"); break;
		case 5: System.out.println("Bugün günlerden cuma"); break;
		case 6: System.out.println("Bugün günlerden cumartesi"); break; 
		}
		
		switch (gelecekGun) {
		case 0: System.out.println(sayi + " gün sonrasý pazar"); break;
		case 1: System.out.println(sayi + " gün sonrasý pazartesi"); break;
		case 2: System.out.println(sayi + " gün sonrasý salý"); break;
		case 3: System.out.println(sayi + " gün sonrasý çarþamba"); break;
		case 4: System.out.println(sayi + " gün sonrasý perþembe"); break;
		case 5: System.out.println(sayi + " gün sonrasý cuma"); break;
		case 6: System.out.println(sayi + " gün sonrasý cumartesi"); break;
		}
	}
}
