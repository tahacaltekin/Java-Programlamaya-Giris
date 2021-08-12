package bolum04.sorular;

/*
 * (Geometri: en iyi çember mesafesi) En iyi çember mesafesi, küre yüzeyinde bulunan iki nokta
 * arasındaki uzaklığa denir. (x1, y1) ve (x2, y2) coğrafi enlem ve boylam değerlerini gösteren iki nokta
 * olsun. İki nokta arasındaki en iyi çember mesafesi aşağıdaki formül kullanılarak hesaplanabilir.
 * 
 * d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 ­ y2))
 * 
 * Kullanıcıdan derece olarak dünya üzerindeki iki noktanın enlem ve boylam bilgisini alan ve bu iki nokta
 * arasında mesafeyi gösteren bir program yazınız. Dünyanın yarıçapı yaklaşık, 6,371.01 km‘dir. Javanın
 * trigonometri fonksiyonları radyan cinsinden hesaplama yaptığı için Math.toRadians ​ metodunu kullanarak
 * dereceyi radyana çevirmelisiniz. Formüldeki enlem ve boylam dereceleri kuzey ve batı içindir. Güney ve
 * doğu için negatif değerler kullanınız. 
 */

import java.util.Scanner;

public class B04S02 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		final double RADIUS = 6371.01;
		
		System.out.println("Enlem ve boylam dereceleri kuzey ve batı içindir. Doğu ve güney için negatif değerler giriniz.");
		System.out.println("1. noktanın enlem ve boylamını derece cinsinden giriniz: ");
		double x1 = girdi.nextDouble();
		double y1 = girdi.nextDouble();
		
		System.out.println("2. noktanın enlem ve boylamını derece cinsinden giriniz: ");
		double x2 = girdi.nextDouble();
		double y2 = girdi.nextDouble();
		
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		double d = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		System.out.println("2 nokta arasındaki mesafe " + d + " km");
	}
}
