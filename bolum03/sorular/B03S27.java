package bolum03.sorular;

/*
 *  ​(Geometri:  Nokta üçgenin içinde mi?) Bir dik üçgenin aşağıdaki gibi koordinat düzleminde
 * gösterildiğini düşünelim. Dik açının bulunduğu köşe (0, 0) noktasında ve diğer iki köşe (200, 0) ve (0,100)
 * noktalarında olsun. Kullanıcıdan bir noktanın x­ ve y­ koordinatlarını alan ve bu noktanın üçgenin
 * içinde olup olmadığını test eden bir program yazınız.
 */

import java.util.Scanner;

public class B03S27 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("(x, y) noktası için koordinatları giriniz: ");
		double x = girdi.nextDouble();
		double y = girdi.nextDouble();
		
		
		double kesisimx = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double kesisimy = (-y * (200 * 100)) / (-y * 200 - x * 100);
		
		System.out.println("Girilen koordinatta ki nokta üçgenin içinde" + ((x > kesisimx || y > kesisimy) ? " değildir." : "dir."));
	}
}
