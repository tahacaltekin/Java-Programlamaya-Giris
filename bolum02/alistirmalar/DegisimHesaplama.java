package bolum02.alistirmalar;

import java.util.Scanner;

public class DegisimHesaplama {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir para de�eri giriniz: (�rn. 11.56) ");
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
		
		System.out.println("Para Miktar� " + para + " TL");
		System.out.println("TL miktar�: " + toplamtl);
		System.out.println("50 Kuru� Miktar�: " + elliKurus);
		System.out.println("25 Kuru� Miktar�: " + yirmiBesKurus);
		System.out.println("10 Kuru� Miktar�: " + onKurus);
		System.out.println("5 Kuru� Miktar�: " + besKurus);
		System.out.println("1 Kuru� Miktar�: " + birKurus);
		
		
		
		
		
		
		  
	}

}
