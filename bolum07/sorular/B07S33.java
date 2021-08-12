package bolum07.sorular;

/*
 * (​Kültür: Çin Burçları) Madde 3.9’da hayvan isimlerini bir string dizisi kullanarak düzenleyiniz. 
 */
import java.util.Scanner;

public class B07S33 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		String[] cinBurclari = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
		
		System.out.println("Bir yıl giriniz: ");
		int yil = girdi.nextInt();
		
		System.out.println(cinBurclari[yil % 12]);
	}
}
