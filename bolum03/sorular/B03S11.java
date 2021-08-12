package bolum03.sorular;

/*
 * (Bir ayın gün sayısı) Kullanıcıdan ay ve yıl bilgisini alan ve yılın bu ayına ait gün sayısını
 * gösteren bir program yazınız. Örneğin; kullanıcı ay için 2​ ve yıl için 2012​ girerse, program “Şubat 2012,
 * 29 gündür” mesajını gösterecek. Eğer kullanıcı ay için 3​ ve yıl için 2015​ girerse, program “Mart 2015, 31
 * gündür” mesajını gösterecek.
 */

import java.util.Scanner;

public class B03S11 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir ay giriniz: Örn Ocak 1 Aralık 12");
		int ay = girdi.nextInt();
		
		System.out.println("Bir yıl giriniz: ");
		int yil = girdi.nextInt();
		
		boolean artikYil = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
		
		switch (ay) {
		case 1: System.out.println("Ocak " + yil + " 31 gündür."); break;
		case 2: System.out.println("Şubat " + yil +
				((artikYil) ? " 29 gündür." : " 28 gündür.")); break;
		case 3: System.out.println("Mart " + yil + " 31 gündür."); break;
		case 4: System.out.println("Nisan " + yil + " 30 gündür."); break;
		case 5: System.out.println("Mayıs " + yil + " 31 gündür."); break;
		case 6: System.out.println("Haziran " + yil + " 30 gündür."); break;
		case 7: System.out.println("Temmuz " + yil + " 31 gündür."); break;
		case 8: System.out.println("Ağustos " + yil + " 31 gündür."); break;
		case 9: System.out.println("Eylül " + yil + " 30 gündür."); break;
		case 10: System.out.println("Ekim " + yil + " 31 gündür."); break;
		case 11: System.out.println("Kasım " + yil + " 30 gündür."); break;
		case 12: System.out.println("Aralık " + yil + " 31 gündür."); 
		}
	}
}
