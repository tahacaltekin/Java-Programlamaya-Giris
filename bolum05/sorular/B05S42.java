package bolum05.sorular;

/*
 * (Finans uygulaması: satış miktarını bulma) 5.39 ‘daki Programlama Alıştırmasını aşağıdaki
 * açıklamalara uygun olarak yeniden düzenleyiniz.
 * 
 * ■ do-while​ döngüsü yerine for​ döngüsü kullanınız.
 * ■ COMMISSION_SOUGHT​ sabiti yerine bu değeri kullanıcının girmesini isteyiniz.
 */

import java.util.Scanner;

public class B05S42 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		double komisyon = 0.0;
		double satisMiktari;
		double bakiye;
		
		System.out.println("Hedef komisyonu giriniz: ");
		double hedefKomisyon = girdi.nextDouble();
		
		for (satisMiktari = 0.01; komisyon < hedefKomisyon; satisMiktari += 0.01) {
			bakiye = komisyon = 0.0;
			
			if (satisMiktari > 10000.01) 
				komisyon += (bakiye = satisMiktari - 10000) * 0.12;
				
			if (satisMiktari > 5000.01)
				komisyon += (bakiye -= bakiye - 5000) * 0.10;
			
			if (satisMiktari > 0.01)
				komisyon += bakiye * 0.08;
		}
		
		System.out.printf("$30.000 kazanmak için yapılması gereken minimum satış: $%.0f\n ", satisMiktari);
	}
}
