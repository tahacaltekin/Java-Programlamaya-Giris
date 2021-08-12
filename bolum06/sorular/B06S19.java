package bolum06.sorular;

/*
 * (BenimUcgenim​ sınıfı)Aşağıda bildirilen iki metodu içeren ​BenimUcgenim​ isimli bir sınıf tanımlayın:
 * Eğer iki kenar uzunluğunun toplamı üçüncüden büyükse true döner. 
 * 
 * public static boolean ​isValid(​double ​side1, ​double ​side2, ​double ​side3)
 *  Üçgenin alanını hesaplar. 
 * 
 * public static double ​area(​double ​side1, ​double ​side2, ​double ​side3)
 * 
 * Kullanıcıdan kenar uzunluklarını alan ve girdiler geçerli ise üçgenin alanını hesaplayan bir test programı
 * yazınız. Eğer girdiler geçerli değil ise bunu kullanıcıya göster. Üçgenin alanının hesaplanması için
 * kullanılacak formül Programlama Soruları 2.19 verilmiştir.
 */

import java.util.Scanner;

public class B06S19 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Üçgen oluşturmak için 3 nokta giriniz: ");
		double kenar1 = girdi.nextDouble();
		double kenar2 = girdi.nextDouble();
		double kenar3 = girdi.nextDouble();
		
		System.out.println(gecerliMi(kenar1, kenar2, kenar3) ? "Üçgenin alanı: " + 
		alan(kenar1, kenar2, kenar3) : " girilen değerler geçersiz");
	}
	
	public static boolean gecerliMi(double kenar1, double kenar2, double kenar3) {
		boolean gecerliDeger = kenar1 + kenar2 > kenar3 && kenar1 + kenar3 > kenar2 && kenar2 + kenar3 > kenar1;
		return gecerliDeger;
	}
	
	public static double alan(double kenar1, double kenar2, double kenar3) {
		double a = (kenar1 + kenar2 + kenar3) / 2;
		return Math.sqrt(a * (a - kenar1) * (a - kenar2) * (a - kenar3));
	}
}
