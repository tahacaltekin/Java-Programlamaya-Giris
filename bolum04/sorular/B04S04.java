package bolum04.sorular;

/*
 *(Geometri: altıgenin alanı) Altıgenin alanı aşağıdaki formül kullanılarak hesaplanabilir.(s ​kenar

 
 * uzunluğu):
 * 
 * 			  6 x s²
 * 		alan = ----------------
 * 			4 x tan(pi / 6)
 * 
 * Kullanıcıdan altıgenin kenar uzunluğunu alan ve alanını gösteren bir program yazınız
 */
import java.util.Scanner;

public class B04S04 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Altıgenin alanını hesaplamak için bir kenar uzunluğunu giriniz: ");
		double kenar = girdi.nextDouble();
		
		double alan = (6 * Math.pow(kenar, 2)) / (4 * Math.tan(Math.PI / 6));
		
		System.out.println("Altıgenin alanı " + (int)(alan * 100) / 100.0);	
	}
}
