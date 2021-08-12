package bolum02.sorular;

/*
 * (​Geometri: altıgenin alanı) Kullanıcıdan altıgenin kenar uzunluğunu isteyen ve alanını

formül:
javaci.net
javaci.net
​ ​

 * hesaplayıp gösteren bir program yazınız. Altıgenin alanını hesaplamak için kullanılacak
 * formül:
 * 
 * 			3√3
 *  alan = -----s²
 *  		 2 
 * 
 * s altıgenin kenar uzunluğunu gösterir.
 */

import java.util.Scanner;

public class B02S16 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.println("Altıgenin alanın hesaplanması için kenar uzunluğunu giriniz: ");
		double uzunluk = girdi.nextDouble();

		double alan = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(uzunluk, 2);

		System.out.println("Altıgenin alanı: " + (int) (alan * 10000) / 10000.0);
	}

}
