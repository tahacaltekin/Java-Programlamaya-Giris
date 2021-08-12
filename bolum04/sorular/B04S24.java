package bolum04.sorular;

/*
 * (Þehirleri sýralama) Kullanýcýdan üç þehir girmesini isteyen ve bu þehirleri artan þekilde sýralayýp
 * gösteren bir program yazýnýz.
 */
import java.util.Scanner;

public class B04S24 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("1.Þehiri giriniz: ");
		String sehir1 = girdi.nextLine();
		System.out.println("2.Þehiri giriniz: ");
		String sehir2 = girdi.nextLine();
		System.out.println("3.Þehiri giriniz: ");
		String sehir3 = girdi.nextLine();
		
		String temp;
		
		if ((sehir2.compareTo(sehir1) < 0) && (sehir2.compareTo(sehir3) < 0)) {
			
			temp = sehir1;
			sehir1 = sehir2;
			sehir2 = temp;
		} else if ((sehir3.compareTo(sehir1) < 0) && (sehir3.compareTo(sehir2) < 0)) {
			
			temp = sehir1;
			sehir1 = sehir3;
			sehir3 = temp;
		} 
		if (sehir3.compareTo(sehir2) < 0) {
			
			temp = sehir2;
			sehir2 = sehir3;
			sehir3 = temp;
		}
		
		System.out.println("3 þehirin alfabetik sýralamasý : " + sehir1 + " - " + sehir2 + " - " + sehir3);
	}
}
