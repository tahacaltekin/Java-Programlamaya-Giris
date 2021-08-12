package bolum03.sorular;


/*
 * (Geometri: iki çember) Kullanıcıdan iki çemberein merkez noktalarını ve yarıçap uzunluğunu alan
 * ve girilen ikinci çemberin birinci çembere göre durumunu gösteren bir
 * program yazınız. (İpucu: İki çemberin merkezleri arasındaki mesafe; |r1 ­ r2​| ‘den küçük ya da eşitse
 * ikinci çember birinci çemberin içerisindedir, r1 + r2​ ‘den küçük ya da eşitse iki çember kesişmektedir.
 * Tüm durumlar için programınızı test ediniz.
 */

import java.util.Scanner;

public class B03S29 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Birinci çemberin (x, y) noktalarını ve yarıçapını giriniz: ");
		double x1 = girdi.nextDouble();
		double y1 = girdi.nextDouble();
		double yaricap1 = girdi.nextDouble();
		
		System.out.print("İkinci çemberin (x, y) noktalarını ve yarıçapını giriniz: ");
		double x2 = girdi.nextDouble();
		double y2 = girdi.nextDouble();
		double yaricap2 = girdi.nextDouble();
		
		if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= Math.abs(yaricap1 - yaricap2)) {
			System.out.println("İkinci çember Birinci çemberin içindedir.");
		} else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= yaricap1 + yaricap2) {
			System.out.println("İkinci çember Birinci çember ile kesişiyor.");
		} else {
			System.out.println("İkinci çember Birinci çemberin dışındadır.");
		}
	}
}
