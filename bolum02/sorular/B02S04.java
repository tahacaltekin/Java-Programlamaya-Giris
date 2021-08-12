package bolum02.sorular;


/*
 * ​ (​Pound­kilogram dönüşümü) Poundu kilograma dönüştüren bir program yazınız.  Program,
 * kullanıcıdan pound değerini alır ve sonucu kilograma dönüştürüp gösterir. Bir pound​ 0.454
 * kilogramdır
 */

import java.util.Scanner;

public class B02S04 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Pound değerini giriniz: ");
		
		double pound = girdi.nextDouble();
		double kilogram = pound * 0.454;
		
		System.out.println("Girilen pound: " + pound + "Kilogram karşılığı: " + (int)(kilogram * 1000) / 1000.0);
	}

}
