package bolum06.sorular;

/*
 * (​Geometri: Beşgenin alanı) Bir beşgenin alanını aşağıdaki formülü kullanarak hesaplayabilirsiniz.
 * 
 * Alan = (5 * s²) / 4 * tan(PI / 5 )
 * 
 * Beşgenin alanını hesaplayan aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * public static double ​area(​double ​side)
 * 
 * main metodunda kullanıcıdan kenar uzunluğunu alan ve alanını gösteren kodu yazınız.
 */

import java.util.Scanner;

public class B06S35 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir kenar giriniz: ");
		double kenar = girdi.nextDouble();
		
		System.out.println("Beşgenin alanı: " + alan(kenar));
	}
	
	public static double alan(double kenar) {
		return (5 * Math.pow(kenar, 2)) / (4 * Math.tan(Math.PI / 5));
	}
}
