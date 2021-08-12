package bolum06.sorular;

/*
 * (​Geometri: Düzgün çokgenin alanı) Düzgün çokgen; n kenardan oluşan ve her kenarın uzunluğu ve
 * aralarındaki açı aynı olan çokgenlere denir. Düzgün çokgenin alanını hesaplamak için kullanılacak
 * formül:
 * 
 * Alan = (n * s²) / (4 * tan(PI / n))
 * 
 * Düzgün çokgenin alanını hesaplayan aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * public static double ​area(​int ​n, ​double ​side)
 * 
 * main metodunda kullanıcıdan kenar sayısını ve kenar uzunluğunu alan ve alanını hesaplayıp gösteren
 * kodu yazınız. 
 */

import java.util.Scanner;

public class B06S36 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir kenar sayısını giriniz: ");
		int n = girdi.nextInt();
		System.out.println("Kenar uzunluğunu giriniz: ");
		double kenar = girdi.nextDouble();
		
		System.out.println("Girilen çokgenin alanı: " + alan(n, kenar));
	}
	
	public static double alan(int n, double kenar) {
		return (n * Math.pow(kenar, 2) / (4 * Math.tan(Math.PI / n)));
	}
}
