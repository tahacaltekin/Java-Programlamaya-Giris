package bolum02.sorular;

/*
 *  (​Bilim: hissedilen sıcaklık) Dışarısı ne kadar soğuk? Bu soruyu cevaplamak için sadece
 * sıcaklığı bilmek yeterli olmayacaktır. Havanın ne kadar soğuk olduğunu ölçmek için sıcaklığın
 * yanında; rüzgarın hızı, nispi nem ve güneş ışığı önemli rol oynarlar. 2001 yılında, Ulusal Hava
 * İstasyonu (UHİ) hissedilen sıcaklığı ölçmek için rüzgar hızını ve sıcaklığı kullanan yeni bir
 * algoritma geliştirdiler.
 * Bunun için geliştirilen formül:
 * 
 * twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
 * 
 * ta Fahrenhayt olarak dış sıcaklığı ve​ v mil/saat olarak hızı gösterir.​ twc hissedilen sıcaklığı
 * gösterir. Bu formül eğer rüzgar 2 mil/saat üzerinde ve sıcaklık ­58 ºF ile 41ºF arasında ise
 * geçerlidir.
 * Kullanıcıdan ­58 ºF ile 41ºF arasında sıcaklığı ve 2 mil / saate eşit ya da daha yüksek rüzgar
 * hızını isteyen ve hissedilen sıcaklığı hesaplayan bir program yazınız.  ​v0.16. Hesaplamak için
 * Math.pow(a, b)​ metodunu kullanınız.
 */

import java.util.Scanner;

public class B02S17 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Hissedilen sıcaklığı hesaplamak için -58 ile 41 fahrenheit arasında bir değer giriniz: ");
		double fahrenheit = girdi.nextDouble();
		
		System.out.println("2 mile eşit ve ya büyük rüzgar hızı giriniz: ");
		double ruzgarHizi = girdi.nextDouble();
		
		double hissedilenSicaklik = 35.74 + (0.6215 * fahrenheit) - (35.75 * Math.pow(ruzgarHizi, 0.16)) + (0.4275 * fahrenheit * Math.pow(ruzgarHizi, 0.16));
		System.out.println("Hissedilen Sıcaklık " + (int)(hissedilenSicaklik * 100000) / 100000.0);
	}

}
