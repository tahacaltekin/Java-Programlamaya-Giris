package bolum04.sorular;

/*
 * (Finans uygulaması: maaş bordrosu) Aşağıdaki bilgileri alan ve maaş bordrosunu gösteren bir
 * program yazınız.
 * 
 * Çalışan Adı (ör; Onur)
 * Haftalık çalışma süresi (ör 10)
 * Saat ücreti (ör; 9.75)
 * Gelir vergisi (ör; %20)
 * Damga vergisi (ör; %9)
 */
import java.util.Scanner;

public class B04S23 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Çalışan adını giriniz: ");
		String isim = girdi.next();
		System.out.print("Haftalık çalışma süresini giriniz: ");
		double calismaSuresi = girdi.nextDouble();
		System.out.print("Saatlik ücreti giriniz: ");
		double saatlikUcret = girdi.nextDouble();
		System.out.print("Gelir vergisi yüzdesini giriniz: ");
		double gelirVergisi = girdi.nextDouble();
		System.out.print("Damga vergisini giriniz: ");
		double damgaVergisi = girdi.nextDouble();
		
		double brütMaas;
		double gelir;
		double damga;
		double toplamKesinti;
		
		System.out.println(
				"Çalışan adı: " + isim + 
				"\nÇalışma Süresi : " + calismaSuresi + " saat" + 
				"\nSaatlik Ücret : " + saatlikUcret + " TL " +
				"\nBrüt Maaş : " + (brütMaas = calismaSuresi * saatlikUcret) + " TL " +
				"\nKesinti:\n  Gelir vergisi (%20.0): " + (gelir = brütMaas * gelirVergisi) + " TL " +
				"\n  Damga Vergisi (%9.0): " + (damga = brütMaas * damgaVergisi) + " TL " + 
				"\n  Toplam Kesinti: " + (toplamKesinti = gelir + damga) + " TL " +
				"\n Net Ödeme: " + (brütMaas - toplamKesinti) + " TL ");
	}
}
