package bolum03.sorular;

/*
 *  ​(Bilim: Hissedilen sıcaklık) Programlama Soruları 2.17 ‘de hissedilen sıcaklığı hesaplamak için
 * kullanılan formülü bulabilirsiniz. Bu formül sıcaklık değeri  −58ºF ve 41ºF arasında ve rüzgar hızı 2 ve
 * bundan büyük olduğu durumlarda geçerlidir.
 * Kullanıcıdan sıcaklık ve rüzgar hızını alan bir program yazınız. Eğer girilen değerler geçerliyse program
 * hissedilen sıcaklığı göstersin, değilse “Geçersiz sıcaklık ya da rüzgar hızı” mesajını göstersin
 * 
 */

import java.util.Scanner;

public class B03S20 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Hissedilen sıcaklığı hesaplamak için -58 ile 41 fahrenheit arasında bir değer giriniz: ");
		double sicaklik = girdi.nextDouble();
		
		System.out.println("2 mile eşit ve ya büyük rüzgar hızı giriniz: ");
		double ruzgarHizi = girdi.nextDouble();
		
		if(sicaklik <= -58 || sicaklik >= 41 || ruzgarHizi < 2) {
			if (sicaklik <= 58 || sicaklik >= 41) {
				
			} if ((sicaklik <= 58 || sicaklik >= 41) && ruzgarHizi <2) {
				
			} if (ruzgarHizi < 2) {
				
			} System.out.println("Geçersiz sıcaklık veya rüzgar hızı girdiniz.");
			System.exit(1);
		} else {
			double hissedilenSicaklik = 35.74 + (0.6215 * sicaklik) - (35.75 * Math.pow(ruzgarHizi, 0.16)) + (0.4275 * sicaklik * Math.pow(ruzgarHizi, 0.16));
			System.out.println("Hissedilen Sıcaklık " + (int)(hissedilenSicaklik * 100000) / 100000.0);
		}
		
		
	}
}
