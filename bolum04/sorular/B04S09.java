package bolum04.sorular;

/*
 * (Karakterin Unicode kar��l���) Bir karakterin, Unicode kar��l���n� g�steren bir program yaz�n�z.
 */
import java.util.Scanner;

public class B04S09 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Unicode d�n���m� i�in bir karakter giriniz: ");
		String i = girdi.nextLine();
		
		char ch = i.charAt(0);
		
		System.out.println("Girilen karakterin Unicode kar��l��� " + (int)ch);
	}
}
