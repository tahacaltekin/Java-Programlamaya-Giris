package bolum05.sorular;

/*
 * (Bir tam sayının çarpanlarını bulma) Bir tam sayıyı alan ve tüm en küçük çarpanlarını artan sırada
 * gösteren bir program yazınız. Örneğin, girdi tam sayı 120​ ise çıktı şöyle olmalıdır: 2​, 2​, 2​, 3​, 5​.
 */

import java.util.Scanner;

public class B05S16 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Çarpanlarını bulmak istediğiniz bir sayı giriniz:  ");
		int sayi = girdi.nextInt();
		int index = 2;
		
		while (sayi / index != 1) {
			if (sayi % index == 0) {
				System.out.print(index + ", ");
				sayi /= index;
			} else {
				index++;
			}
		}
		
		System.out.println(sayi + ".");
	}
}
