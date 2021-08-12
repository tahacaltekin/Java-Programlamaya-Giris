package bolum05.sorular;

/*
 * (Her ayýn ilk günü) Kullanýcýdan yýlý ve yýlýn ilk gününü alan ve o yýlýn her ayýnýn ilk günlerini gösteren
 * bir program yazýnýz. Örneðin, kullanýcý yýlý 2013 ve yýlýn ilk günü olan Salý için 2 girdiyse, program þu çýktýyý
 * vermelidir:
 * 
 * 1 Ocak, 2013 Salý
 * ...
 * 1 Aralýk, 2013 Pazar
 */

import java.util.Scanner;

public class B05S28 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir Yýl giriniz: ");
		int yil = girdi.nextInt();
		
		System.out.println("Yýlýn ilk gününü giriniz: ");
		int gun = girdi.nextInt();
		
		String cikti;
		
		for (int ay = 1; ay <= 12; ay++) {
			cikti = "";
			
			switch (ay) {
			case 1: cikti += "Ocak "; break;
			case 2: cikti += "Þubat "; break;
			case 3: cikti += "Mart "; break;
			case 4: cikti += "Nisan "; break;
			case 5: cikti += "Mayýs "; break;
			case 6: cikti += "Haziran "; break;
			case 7: cikti += "Temmuz "; break;
			case 8: cikti += "Aðustos "; break;
			case 9: cikti += "Eylük "; break;
			case 10: cikti += "Ekim "; break;
			case 11: cikti += "Kasým "; break;
			case 12: cikti += "Aralýk "; break;
				
			}
			cikti += "1, " + yil;
			
			gun %= 7;
			
			switch (gun) {
			case 0: System.out.println(cikti + " Pazar"); break;
			case 1: System.out.println(cikti + " Pazartesi"); break;
			case 2: System.out.println(cikti + " Salý"); break;
			case 3: System.out.println(cikti + " Çarþamba"); break;
			case 4: System.out.println(cikti + " Perþembe"); break;
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
