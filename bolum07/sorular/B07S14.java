package bolum07.sorular;

/*
 *  (​OBEB hesaplama) Belirsiz sayıda tamsayı için OBEB değerini geri döndüren bir metod yazınız.
 * Metod bildirimi aşağıdaki şekildedir:
 * 
 * public static int​ gcd(​int​... numbers)
 * 
 * Kullanıcıdan beş adet sayı alan ve bu metodu çağırarak sayıların OBEB değerini hesaplayıp
 * gösteren bir test programı yazınız.
 */

import java.util.Scanner;

public class B07S14 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		int[] sayilar = new int[5];
		
		System.out.println("5 tane sayı giriniz: ");
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = girdi.nextInt();
		}
		
		System.out.println("EBOB = " + ebob(sayilar));
	}
	
	public static int ebob(int[] sayilar) {
		int ebob = 1;
		boolean bolenMi;
		
		for (int i = 2; i < min(sayilar); i++) {
			bolenMi = true;
			for (int e : sayilar) {
				if (e % i != 0) {
					bolenMi = false;
				}
			}
			if(bolenMi)
				ebob = i;
		}
		return ebob;
	}
	
	public static int min(int[] sayilar) {
		int min = sayilar[0];
		for (int i : sayilar) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
}
