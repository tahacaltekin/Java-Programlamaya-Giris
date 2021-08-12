package bolum02.sorular;

/*
 *  (​Sağlık: VKİ hesaplama) Vucüt Kitle İndeksi (VKİ) ideal kilonun hesaplanması için
 * kullanılır. Kilogram olarak ağırlığınızın, metre cinsinden boy uzunluğunun karesine
 * bölünmesiyle elde edilir. Kullanıcıdan ağırlığını pound ve boyunu inch olarak girmesini isteyen
 * ve VKİ değerini gösteren bir program yazınız. Bir pound​ 0.45359237​ kilogram ve bir inch
 * 0.0254​ metredir.
 */

import java.util.Scanner;

public class B02S14 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("Vücut kitle indeksinizi hesaplamak için kilonuzu pound olarak ve boyunuzu inç olarak giriniz: ");
		final double poundBasinaKilogram =  0.45359237;
		final double inchBasinaMetre = 0.0254;
		
		System.out.println("Ağırlığınızı Giriniz: ");		
		double agirlik = girdi.nextDouble();
		
		System.out.println("Boyunuzu Giriniz: ");
		double boy = girdi.nextDouble();
		
		agirlik = agirlik * poundBasinaKilogram ;
		boy = boy * inchBasinaMetre;
		
		double vucutKitleIndeksi = (agirlik / Math.pow(boy, 2));
		
		System.out.println("Vücut kitle indeksi: " + (int)(vucutKitleIndeksi * 10000) / 10000.0);
	}

}
