package bolum05.sorular;

/*
 * ​ (Takvim oluşturma) Kullanıcıdan yıl ve yılın ilk gününü alan ve alınan yılın konsolda takvim tablosunu
 * gösteren bir program yazınız. Örneğin, kullanıcı yılı 2013 ve 1 Ocak 2013 Salı için 2’yi girdiğinde, program yılın
 * her ayı için takvimi aşağıdaki gibi göstermelidir:
 * 
 * January 2013
 * Sun Mon Tue Wed Thu Fri Sat
 * 	1   2   3   4   5
 *  6   7   8   9   10  11  12
 *  13  14  15  16  17  18  19
 *  20  21  22  23  24  25  26
 *  27  28  29  30  31						
 */

import java.util.Scanner;

public class B05S29 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.println("Bir Yıl Giriniz: ");
		int yil = girdi.nextInt();

		System.out.println("Bir gün giriniz: (pazar = 0 cts = 6)");
		int gun = girdi.nextInt();

		String baslik;
		System.out.println();

		for (int ay = 1; ay <= 12; ay++) {
			baslik = "";

			switch (ay) {
			case 1: baslik += "Ocak "; break;
			case 2: baslik += "Şubat "; break;
			case 3: baslik += "Mart "; break;
			case 4: baslik += "Nisan "; break;
			case 5: baslik += "Mayıs "; break;
			case 6: baslik += "Haziran "; break;
			case 7: baslik += "Temmuz "; break;
			case 8: baslik += "Ağustos "; break;
			case 9:	baslik += "Eylük ";	break;
			case 10: baslik += "Ekim "; break;
			case 11: baslik += "Kasım "; break;
			case 12: baslik += "Aralık "; break;
			}

			baslik += yil + "";

			for (int i = 0; i < 23 - (baslik.length() / 2); i++) {
				System.out.print(" ");
			}

			System.out.println(baslik + "\n-----------------------------------------------\n "
					+ "Pzr   Pzrts  Salı    Çrş    Prş    Cum    Cts");

			gun %= 7;
			for (int i = 0; i <= gun * 7; i++) {
				System.out.print(" ");
			}

			int sonGun = 0;
			if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12) {
				sonGun += 31;
			} else if (ay == 4 || ay == 6 || ay == 9 || ay == 11) {
				sonGun += 30;
			} else {
				if (((yil % 4 == 0) && (yil % 100 != 0)) || (yil % 400 == 0))
					sonGun += 29;
				 else 
					sonGun += 28;
			}
			
			for (int g = 1; g <= sonGun; g++) {
				if (g < 10) 
					System.out.print(" ");
					
					if (gun % 7 == 6) 
						System.out.print(g + "\n ");
					else {
						System.out.print(g + "     ");
						
						if (g == sonGun) 
							System.out.println();	
					} 
				gun++;
			}
			System.out.println();
		}
	}
}
