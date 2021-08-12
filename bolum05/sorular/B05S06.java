package bolum05.sorular;

/*
 * (Milden kilometreye dönüþüm) Aþaðýdaki iki tabloyu yan yana gösteren bir program yazýnýz.
 * 
 * 	Mil   Kilometre   |    Kilometre 	Mil
 * 	1       1.609     |     20          12.430
 * 	2       3.218     |     25          15.538
 * 	...   
 * 	9       14.481    |     60          37.290
 * 	10      16.090    |     65          40.398
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class B05S06 {

	public static void main(String[] args) {
		final double KILOMETRE = 1.609;

		System.out.println("Mil           Kilometre   |    Kilometre       Mil ");

		for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k +=5) {
			System.out.printf("%-12d%7.1f", m, (m * KILOMETRE));
			System.out.print("       |     ");
			System.out.printf("%-9d%10.3f\n", k, (k / KILOMETRE ));
		}
	}
}
