package bolum03.sorular;

/*
 * (Finans: Döviz kuru) Kullanýcýdan Amerikan dolarý (USD) ve Çin yuaný (RMB) paritesini alan bir
 * program yazýnýz. Ekranda 0 girilirse USD’den RMB’ye, 1 girilirse RMB’den USD’ye dönüþüm
 * yapýlacaðýný gösterin. Kullanýcý dönüþüm seçimini yaptýktan sonra miktarý girmesini isteyin ve yaptýðý
 * seçime göre USD ­>RMB ya da RMB ­> USD karþýlýðýný ekranda gösteriniz. 
 */

import java.util.Scanner;

public class B03S31 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("USD > Yuan döviz kurunu giriniz: ");
		double dovizKuru = girdi.nextDouble();
		
		System.out.println("USD > Yuan için 0, Yuan > USD dönüþümü için 1 yazýn: ");
		int donusum = girdi.nextInt();
		
		double deger;
		
		if (donusum == 0) {
			System.out.println("Dolar Giriniz: ");
			deger = girdi.nextDouble();
			System.out.println("$" + deger + " = " + (deger * dovizKuru) + " Yuan");
		} else if (donusum == 1) { 
			System.out.println("Yuan Giriniz: ");
			deger = girdi.nextDouble();
			System.out.println(deger + " Yuan " + " = $" + ((int)((deger * 100) / dovizKuru)) / 100.0);			
		} else {
			System.out.println("Hatalý bir giriþ yaptýnýz.");
		}		
	}
}
