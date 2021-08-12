package bolum03.sorular;

import java.util.Scanner;

/*
 * ​(Geometri: Nokta çemberin içinde mi?) Kullanıcıdan (x​, y​) şeklinde bir nokta alan ve bu noktanın
 * merkezi (0​, 0​) ve yarıçapı 10​ olan bir çemberin içinde olup olmadığını gösteren bir program yazınız.
 * Örneğin, şekil 3.7a ‘da görüleceği gibi (4​, 5​) çemberin içinde (9​, 9​) çemberin dışındadır.
 * (İpucu: Eğer bir nokta çemberin içinde ise bu noktanın merkeze olan uzaklığı, çemberin yarıçapından
 * küçük ya da eşit olmalıdır. İki nokta arasında bulunan uzaklığı hesaplamak için kullanılan formül
 * Programınızı tüm durumlar için test ediniz.)
 * 
 */
public class B03S22 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("(x, y) koordinatlarını giriniz: ");
		double x = girdi.nextDouble();
		double y = girdi.nextDouble();
		
		
		boolean cemberinIcinde = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);
		
		
		System.out.println("Girilen koordinatlarda ki (" + x + ", " + y + ") noktası çemberin içinde" + ((cemberinIcinde) ? "dir." : " değildir."));
	}
}
