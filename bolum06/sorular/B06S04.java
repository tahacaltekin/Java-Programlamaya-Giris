package bolum06.sorular;

/*
 *  (Tam sayının basamaklar ​ ını ters sıra ile gösterme) Bir tam sayının basamaklarını tersten gösteren
 * aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * public static void ​reverse(​int ​number)
 * 
 * Örneğin; ​reverse(3456)​ ‘in sonucu ​6543​.  Kullanıcıdan bir tamsayı alan ve bunu ters sıra ile gösteren bir
 * test programı yazınız.
 */

import java.util.Scanner;

public class B06S04 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Girilen sayının tersini görmek için bir sayı giriniz: ");
		int sayi = girdi.nextInt();
		
		System.out.println(sayi + " Sayısının tersten yazılışı: " + terstenSayi(sayi));
	}
	
	public static int terstenSayi(int sayi) {
		String ters = "";
		String n = sayi + "";
		
		for (int i = n.length() - 1; i >= 0; i--) {
			ters += n.charAt(i);
		}
		
		return Integer.parseInt(ters);
	}
}
