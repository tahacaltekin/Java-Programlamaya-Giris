package bolum02.sorular;

/*
 *  (​Feet ­ metre dönüşümü) Kullanıcıdan feet değerini alan ve bunun metre karşılığını
 * hesaplayıp gösteren bir program yazınız. Bir feet​ 0.305​ metredir
 */

import java.util.Scanner;

public class B02S03 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Feet değeri giriniz: ");
		
		double feet = girdi.nextDouble();
		double metre = feet * 0.305;
		
		System.out.println("Girdiğiniz Feet: " + feet);
		System.out.println("Feet'in metre karşılığı: " + (int)(metre * 10000) / 10000.0);
	}

}
