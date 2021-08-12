package bolum03.sorular;

/*
 * (Bilim: haftanın günü) Christian Zeller tarafından geliştirilen Zeller algoritması ile verilen bir
 * tarihin hangi gün olduğu hesaplanabilir. Bunun için geliştirilen formül:
 * 
 * 			 26(m + 1)		  k   j
 *  h = (q + ---------  + k + - + - + 5j) % 7
 *  			10			  4   4
 *
 * olduğunda
 * 
 *  h ​haftanın günü  (0: Cumartesi ,1: Pazar, 2: Pazartesi, 3: Salı, 4: Çarşamba, 5: Perşembe, 6: Cuma).
 *  q ​ayın kaçı
 *  m ​ay(3: Mart, 4: Nisan, …, 12: Aralık). Ocak ve Şubat aylarının değeri sırasıyla 13 ve 14’tür. Bu
 *  değerler bir sonraki yılı gösterir.
 *  j ​yüzyıl (ör., yıl / 100 ).
 *  k ​yüzyılın kaçıncı yılı (ör., yıl % 100).
 * Verilen formüldeki bölme işlemlerinin sonucu tam sayı olacaktır. Kullanıcıdan gün, ay, yıl bilgisini alan
 * haftanın hangi günü olduğunu gösteren bir program yazınız.
 * 
 * (İpucu: Formülde Ocak ve Şubat ayları 13 ve 14 değerleri girilmesi gerekmektedir. Kullanıcı 1 girdiyse
 * bunu 13 ve 2 girdiyse bunu 14 olarak değiştirip yılı da bir azaltmalısınız.
 */

import java.util.Scanner;

public class B03S21 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Yıl giriniz: ");
		int yil = girdi.nextInt();
		
		System.out.println("Ay giriniz: Örn Ocak 1 aralık 12");
		int ay = girdi.nextInt();
		
		System.out.println("Ayın bir gününü giriniz: 1-31");
		int gun = girdi.nextInt();
		
		if (ay == 1 || ay == 2) {
			ay = (ay == 1) ? 13: 14;
			yil--;
		}
		
		int HaftaninGunleri = (gun + (26* (ay + 1) / 10) + (yil % 100) + (yil % 100 ) / 4 + (yil / 100) / 4 + 5 * (yil / 100)) % 7;
		
		switch (HaftaninGunleri) {
		case 0: System.out.println("Haftanın günü Cumartesidir."); break;
		case 1: System.out.println("Haftanın günü Pazardır."); break;
		case 2: System.out.println("Haftanın günü Pazartesidir."); break;
		case 3: System.out.println("Haftanın günü Salıdır."); break;
		case 4: System.out.println("Haftanın günü Çarşambadır."); break;
		case 5: System.out.println("Haftanın günü Perşemdir."); break;
		case 6: System.out.println("Haftanın günü Cumadır.");
		}
		
	}

}
