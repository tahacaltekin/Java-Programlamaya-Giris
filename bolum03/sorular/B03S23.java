package bolum03.sorular;

import java.util.Scanner;

/*
 * (Geometri: Nokta dikdörtgenin içinde mi?) Kullanıcıdan (x, y)​ biçiminde bir nokta girmesini isteyen
 * ve girilen noktanın merkezi (0​, 0​), boyu 10 ​ve eni 5​.olan bir dikdörtgenin içinde olup olmadığını gösteren
 * bir program yazınız. Örneğin; Şekil 3.7b de gösterildiği gibi (2​, 2​) noktası dikdörtgenin içinde (6​, 4​)
 * noktası değildir. (İpucu: Eğer bir nokta dikdörtgenin içinde ise bu noktanın (0, 0)​ noktasına yatay uzaklığı
 * 10 / 2​ ‘den küçük ya da eşit olmalıdır ve
 * (0, 0)​ noktasına dikey uzaklığı 5 / 2​ ‘den küçük ya da eşit olmalıdır. Programınızı tüm durumlar için test
 * ediniz.) 
 */

public class B03S23 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("(x, y) koordinatlarını giriniz: ");
		double x = girdi.nextDouble();
		double y = girdi.nextDouble();
		
		boolean kareninIcinde = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);
		
		
		System.out.println("Girilen koordinatlarda ki (" + x + ", " + y + ") noktası karenin içinde" + ((kareninIcinde) ? "dir." : " değildir."));
	}
}
