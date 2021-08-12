package bolum02.alistirmalar;

import java.util.Scanner;

public class DegisimHesaplama {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir para deðeri giriniz: (Örn. 11.56) ");
		double para = girdi.nextDouble();
		
		int kalanMiktar = (int)(para * 100);
		
		int toplamtl = kalanMiktar / 100;
		kalanMiktar %= 100;
		
		int elliKurus = kalanMiktar / 50;
		kalanMiktar %= 50;
		
		int yirmiBesKurus = kalanMiktar / 25;
		kalanMiktar %= 25;
		
		int onKurus = kalanMiktar / 10;
		kalanMiktar %= 10;
		
		int besKurus = kalanMiktar / 5;
		kalanMiktar %= 5;
		
		int birKurus = kalanMiktar;
		
		System.out.println("Para Miktarý " + para + " TL");
		System.out.println("TL miktarý: " + toplamtl);
		System.out.println("50 Kuruþ Miktarý: " + elliKurus);
		System.out.println("25 Kuruþ Miktarý: " + yirmiBesKurus);
		System.out.println("10 Kuruþ Miktarý: " + onKurus);
		System.out.println("5 Kuruþ Miktarý: " + besKurus);
		System.out.println("1 Kuruþ Miktarý: " + birKurus);
		
		
		
		
		
		
		  
	}

}
