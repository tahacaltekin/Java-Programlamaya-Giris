package bolum04.sorular;

/*
 * (Bir aydaki g�n say�s�) Kullan�c�dan y�l ve ay�n ilk �� harfini (ilk harf b�y�k di�erleri k���k harf)
 * alan ve girilen aydaki g�n say�s�n� g�steren bir program yaz�n�z.
 */
import java.util.Scanner;

public class B04S17 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir y�l giriniz: ");
		int yil = girdi.nextInt();
		System.out.println("Bir ay giriniz: ");
		String ay = girdi.next();
		
		boolean artikYil = ((yil % 4  == 0) && (yil % 100 != 0)) || (yil % 400 == 0);
		
		System.out.println(ay + " " + yil);
		
		if (ay.equals("Ocak") || ay.equals("Mart") ||
				ay.equals("May�s") || ay.equals("Temmuz") ||
				ay.equals("A�ustos") || ay.equals("Ekim") ||
				ay.equals("Aral�k")) {
			System.out.println(31 + " g�nd�r.");
		} else if (ay.equals("Nisan") || ay.equals("Haziran") ||
				ay.equals("Eyl�l") || ay.equals("Kas�m")) {
			System.out.println(30 + " g�nd�r.");
		} else {
			System.out.println(((artikYil) ? 29 : 28) + " g�nd�r.");
		}
	}
}
