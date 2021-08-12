package bolum02.sorular;

/*
 * (Fizik: ivme) Aşağıdaki formülde gösterildiği gibi, ortalama ivme hızdaki değişimin zamana
 * bölünmesiyle elde edilir.
 * 
 *     	        v1 - v0
 *          a = ---------
 *          	   t                               
 * 
 * Kullanıcıdan ilk hızı​ (v0) metre/saniye, son hızı (​v1) metre/saniye ve zamanı (​t) saniye olarak
 * alan ve ortalama ivmeyi gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B02S09 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("İvme hesaplaması için ilk hızı (m/s), son hızı(m/s) ve zamanı giriniz:  ");
		
		double ilkHiz = girdi.nextDouble();
		double sonHiz = girdi.nextDouble();
		double zaman = girdi.nextDouble();
		
		double ivme = (sonHiz - ilkHiz) / zaman;
		System.out.println("Girilen değerlere göre ortalama ivme: " + (int)(ivme * 10000) / 10000.0);
	}

}
