package bolum04.sorular;

/*
 * (Bir aydaki gün sayýsý) Kullanýcýdan yýl ve ayýn ilk üç harfini (ilk harf büyük diðerleri küçük harf)
 * alan ve girilen aydaki gün sayýsýný gösteren bir program yazýnýz.
 */
import java.util.Scanner;

public class B04S17 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir yýl giriniz: ");
		int yil = girdi.nextInt();
		System.out.println("Bir ay giriniz: ");
		String ay = girdi.next();
		
		boolean artikYil = ((yil % 4  == 0) && (yil % 100 != 0)) || (yil % 400 == 0);
		
		System.out.println(ay + " " + yil);
		
		if (ay.equals("Ocak") || ay.equals("Mart") ||
				ay.equals("Mayýs") || ay.equals("Temmuz") ||
				ay.equals("Aðustos") || ay.equals("Ekim") ||
				ay.equals("Aralýk")) {
			System.out.println(31 + " gündür.");
		} else if (ay.equals("Nisan") || ay.equals("Haziran") ||
				ay.equals("Eylül") || ay.equals("Kasým")) {
			System.out.println(30 + " gündür.");
		} else {
			System.out.println(((artikYil) ? 29 : 28) + " gündür.");
		}
	}
}
