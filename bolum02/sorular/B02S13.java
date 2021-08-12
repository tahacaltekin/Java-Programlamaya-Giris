package bolum02.sorular;

/*
 * (​Finans uygulaması: birleşik faiz) Yıllık %5 faiz oranıyla hesabınızda her ay​ 100 TL
 * biriktirdiğinizi varsayalım. Bu durumda aylık faiz oranı 0.05/12 = 0.00417. İlk ayın sonunda
 * hesabınızdaki miktar:
 * 
 * 100 * (1 + 0.00417) = 100.417
 * 
 * İkinci ayın sonunda hesabınızdaki miktar:
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 * 
 * Üçüncü ayın sonunda hesabınızdaki miktar:
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 * olacaktır.
 * 
 * 
 * Kullanıcıdan aylık biriktirdiği para miktarını alan ve altı ay sonra hesabının durumunu
 * gösteren bir program yazınız. (Soru 5.30’da, bu kodu basitleştirmek için döngü kullanıyor
 * olacaksınız ve hesabın durumunu aylık olarak göstereceksiniz.)
 */

import java.util.Scanner;

public class B02S13 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("Aylık biriktirdiğiniz para miktarını giriniz: ");
		
		double paraMiktarı = girdi.nextDouble();
		
		double faiz = 0.05 / 12;
		
		double birikenMiktar = paraMiktarı * (1 + faiz);
		birikenMiktar = (paraMiktarı + birikenMiktar) * (1 + faiz);
		birikenMiktar = (paraMiktarı + birikenMiktar) * (1 + faiz);
		birikenMiktar = (paraMiktarı + birikenMiktar) * (1 + faiz);
		birikenMiktar = (paraMiktarı + birikenMiktar) * (1 + faiz);
		birikenMiktar = (paraMiktarı + birikenMiktar) * (1 + faiz);
		System.out.println("6 ay sonra hesabınızda ki toplam para: " + (int)(birikenMiktar * 100) / 100.0);
	}

}
