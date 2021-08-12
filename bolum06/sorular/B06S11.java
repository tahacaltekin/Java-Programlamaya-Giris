package bolum06.sorular;

/*
 * (​Finans uygulaması:  komisyon hesaplama) Programming Exercise 5.39. daki şemayı kullanarak
 * komisyon oranlarını hesaplayan bir metot yazınız.​  Metot bildirimi aşağıdaki şekildedir;
 * 
 * public static double ​computeCommission(​double ​salesAmount)
 * 
 * Aşağıdaki tabloyu oluşturacak bir test programı yazınız:
 * 
 * Satış Miktarı 		Komisyon
 * ­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­
 * 10000 			900.0
 * 15000 			1500.0
 * ...
 * 95000 			11100.0
 * 100000 			11700.0
 */

public class B06S11 {

	public static void main(String[] args) {
		System.out.println("Satış Miktarı      Komisyon\n" + 
						   "---------------------------------");
		for (double satisMiktari = 10000; satisMiktari <= 100000; satisMiktari += 5000) {
			System.out.printf(" %-16.0f", satisMiktari);
			System.out.printf("%8.1f\n", komisyonHesaplama(satisMiktari));
		}
	}
	
	public static double komisyonHesaplama(double satisMiktari) {
		double bakiye;
		double komisyon;
		
		bakiye = komisyon = 0;
		
		if (satisMiktari > 10000.01) 
			komisyon += (bakiye = satisMiktari - 10000) * 0.12;
			
		if (satisMiktari > 5000.01)
			komisyon += (bakiye -= bakiye - 5000) * 0.10;
		
		if (satisMiktari > 0.01)
			komisyon += bakiye * 0.08;
		
		return komisyon;
	}
}
