package bolum05.sorular;

/*
 * (Finans uygulaması: kredi amortisman planı) Verilen kredi bakiyesi için aylık ödeme, anapara ve faizin
 * toplamıdır. Aylık faiz değeri,  aylık faiz oranı ve bakiyenin (kalan anapara) çarpımı ile hesaplanır. Aylık anapara
 * ödemesi ise aylık ödeme eksi aylık faizdir. Kullanıcının kredi miktarını, yılı, faiz oranını girmesine izin veren ve
 * kredi amortisman planını gösteren bir program yazınız.
 * 
 * Not:
 * Son ödemeden sonra bakiye sıfır olmayabilir. Öyle ise, son ödeme normal aylık ödeme artı son bakiye
 * olmalıdır.
 * 
 * İpucu: Tabloyu gösteren bir döngü yazınız. Aylık ödeme her ay için aynı olacağından döngüden önce
 * hesaplanmalıdır. Bakiye ilk kredi miktarıdır. Döngüdeki her bir iterasyon için faiz ve anaparayı hesaplayın ve
 * bakiyeyi güncelleyin. Döngü aşağıdaki gibi görünmelidir:
 * 
 * 
 * for ​(i = 1​; i <= yilSayisi * 12​; i++) {
 * faiz = aylikFaizOrani * bakiye;
 *  anapara = aylikOdeme - faiz;
 *  bakiye = bakiye - anapara;
 *   System.out.println(i + “\t\t” ​+ faiz
 *  + “\t\t” ​+ anapara + “\t\t” ​+ bakiye);
 *  }
 */
import java.util.Scanner;

public class B05S22 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Kredi Miktarını Giriniz: ");
		double krediMiktari = girdi.nextDouble();
		
		System.out.println("Yılı giriniz: ");
		int yil = girdi.nextInt();
		
		System.out.println("Yıllık Faiz Oranını Giriniz: ");
		double faizOrani = girdi.nextDouble();
		
		double aylikFaiz = faizOrani / 1200;
		
		double aylikOdeme = krediMiktari * aylikFaiz / (1 
				- 1 /  Math.pow(1 + aylikFaiz, yil * 12));
		
		System.out.printf("Aylık Ödeme: %.2f\n", aylikOdeme);
		
		System.out.printf("Toplam Ödeme: %.2f\n", (aylikOdeme * 12) * yil);
		
		double bakiye = krediMiktari, 
						anapara,
						faiz;
		System.out.println("Ödeme        Faiz         Anapara      Bakiye");
		for (int i = 1; i <= yil * 12 ; i++) {
			faiz = aylikFaiz * bakiye;
			anapara = aylikOdeme - faiz;
			bakiye = bakiye - anapara;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, faiz, anapara, bakiye);
			
		}
	}
}
