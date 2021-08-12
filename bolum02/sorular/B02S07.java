package bolum02.sorular;

/*
 * (​Kaç yıl) Kullanıcıdan dakika olarak giriş yapılmasını isteyen (ör. 1 000 000) ve buna
 * karşılık gelen yıl, gün ve dakikayı gösteren bir program yazınız. Her zaman bir yılın​ 365​ gün
 * olduğunu varsayın.
 */
import java.util.Scanner;

public class B02S07 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.println("Dakikayı yıl gün ve dakika cinsine çevirmek için dakika giriniz: ");

		int dakika = girdi.nextInt();

		
		int yil = dakika / 525600;
		
		int gun = (dakika % 525600) / 1440;
		
		System.out.println(dakika + " dakika " + yil + " yıl ve " + gun + " güne eşittir.");
		
		
	}

}
