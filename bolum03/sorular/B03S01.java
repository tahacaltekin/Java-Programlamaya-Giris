package bolum03.sorular;

/*
 * (Cebir: İkinci dereceden denklem çözümü) ax2 + bx + c = 0 denkleminin kökleri aşağıdaki formül
 * kullanılarak bulunabilir.
 * 
 * 		 	-b + √b² - 4ac				-b - √b² - 4ac
 * 	r1 =   ---------------    ve   r2 = ---------------
 * 			    2a							  2a
 * 
 * b² ­ 4ac ifadesine denklemin diskriminantı denir. Bu değer pozitifse, denklemin iki gerçek kökü vardır. Bu
 * değer sıfırsa, denklemin bir kökü vardır. Bu değer negatifse, denklemin hiç gerçek kökü yoktur.
 * Kullanıcıdan a, b, c değerlerini alan ve diskriminantı hesaplayıp, denklemin sonucunu gösteren bir
 * program yazınız. Eğer diskriminant pozitfse iki kökü gösteriniz. Eğer diskriminant 0​ ise bir kökü
 * gösteriniz. Aksi takdirde “Denklemin hiç bir gerçek kökü yoktur” mesajını gösteriniz.
 * √x ‘yı hesaplamak için Math.pow(a, 0.5) ​metodunu kullanabilirsiniz
 */

import java.util.Scanner;

public class B03S01 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("İkinci dereceden bir denklemin çözümü için a, b ve c değerlerini giriniz: ");
		double a = girdi.nextDouble();
		double b = girdi.nextDouble();
		double c = girdi.nextDouble();
		
		double r1 = (-b + Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a;
		double r2 = (-b - Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a;
		
		double diskriminant = Math.pow(b, 2) - 4 * a * c;
		
		if (diskriminant > 0) {
			System.out.println("ikinci dereceden denklemin iki kökü vardır " + (int)(r1 * 1000000) / 1000000.0 + " ve " + (int)(r2 * 1000000) / 1000000.0);
		} else if (diskriminant == 0) {
			System.out.println("ikinci dereceden denklemin bir kökü vardır " + r1);
		} else {
			System.out.println("ikinci dereceden denklemin hiç kökü yoktur.");
		}
	}
}
