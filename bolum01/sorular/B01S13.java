package bolum01.sorular;

/*
 * 3 ​(​Cebir:  2 x 2 ​doğrusal denklem sistemi çözümü) 2x2 doğrusal denklem sisteminin çözümü için
 * Cramer kuralını kullanabilirsiniz.
 * 
 * 
 * ax + by = e   x = ed - bf	 y = af - ec
 * 		     ---------       ---------
 * cx + dy = f       ad - bc         ad - bc
 * 
 * 
 * Aşağıdaki denklemi çözerek x ve y’nin değerlerini gösteren bir program yazınız:
 * 
 *  3.4x + 50.2y = 44.5
 * 	2.1x + .55y = 5.9
 */

public class B01S13 {

	public static void main(String[] args) {
		System.out.println("x: " + ((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)));
		System.out.println("y: " + ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)));

	}

}
