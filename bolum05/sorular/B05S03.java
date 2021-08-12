package bolum05.sorular;

/*
 * (Kilogram’dan pound’a dönüşüm) Aşağıdaki tabloyu oluşturan bir program yazınız. (1​ kilogram 2.2
 * pound’dur.)
 * 
 * 	Kilogram 	Pound
 * 	1		2.2
 * 	3		6.6
 * 	...		...
 * 	197             433.4
 *      199             437.8
 */

public class B05S03 {

	public static void main(String[] args) {
		final double POUND = 2.2;
		
		System.out.println("Kilogram         Pound");
		
		for (int i = 1; i <= 199; i+= 2) {
			System.out.printf("%-15d%6.1f\n", i, (i * POUND));
		}
	}
}
