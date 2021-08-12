package bolum02.sorular;


/*
 * (​Finans uygulaması: komisyon hesaplama) Kullanıcıdan ara toplam ve komisyon oranını
 * isteyen, komisyon miktarı ve toplamı hesaplayıp gösteren bir program yazınız. Örneğin,
 * kullanıcı ara toplamı​ 10 TL​ ve komisyon oranını​ 15%​ olarak girdiğinde program, komisyon
 * miktarı​ 1.5 TL​ ve toplamı​ 11.5 TL​ olarak gösterir.
 */
import java.util.Scanner;

public class B02S05 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.println("Komisyon hesaplanması için ara toplam ve komisyon oranını giriniz: ");

		double aratoplam = girdi.nextDouble();
		double komisyonOrani = girdi.nextDouble();

		double komisyonMiktari = (aratoplam * komisyonOrani) / 100;
		System.out.println(komisyonMiktari);

		double toplam = komisyonMiktari + aratoplam;
		System.out.println("Komisyon Miktarı " + komisyonMiktari + " ve toplam " + toplam);

	}

}
