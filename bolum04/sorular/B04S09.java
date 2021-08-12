package bolum04.sorular;

/*
 * (Karakterin Unicode karþýlýðý) Bir karakterin, Unicode karþýlýðýný gösteren bir program yazýnýz.
 */
import java.util.Scanner;

public class B04S09 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Unicode dönüþümü için bir karakter giriniz: ");
		String i = girdi.nextLine();
		
		char ch = i.charAt(0);
		
		System.out.println("Girilen karakterin Unicode karþýlýðý " + (int)ch);
	}
}
