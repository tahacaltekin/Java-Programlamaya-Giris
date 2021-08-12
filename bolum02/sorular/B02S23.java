package bolum02.sorular;

/*
 * (​Yakıt maliyeti) Kullanıcıdan mesafe, aracın yakıt tüketimi ve yakıt fiyatını isteyen ve
 * aracın sürüş boyunca yakıt maliyetini hesaplayan bir program yazınız.
 */

import java.util.Scanner;

public class B02S23 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Yakıt maliyetini hesaplamak için mesafe giriniz: ");
		double mesafe = girdi.nextDouble();
		
		System.out.println("Aracın yakıt tüketimini giriniz: ");
		double yakitTuketimi = girdi.nextDouble();
		
		System.out.println("Yakıt fiyatını giriniz: ");
		double yakitFiyati = girdi.nextDouble();
		
		double yakitMaliyeti = (mesafe * yakitFiyati) / yakitTuketimi;
		System.out.println("Aracın yakıt maliyeti $" + (int)(yakitMaliyeti * 100) / 100.0);
	}

}
