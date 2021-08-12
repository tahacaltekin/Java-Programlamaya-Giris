package bolum05.sorular;


/*
 * ​ (Kilogramdan pounda ve pounddan kilograma dönüşüm) Aşağıdaki iki tabloyu yan yana gösteren bir program
 * yazınız.
 * 
 * 	Kilogram    Pound   |    Pound 	 Kilogram
 * 	   1         2.2    |     20       9.09
 * 	   3         6.6    |     25       11.36
 * 	  ...   
 * 	  197        433.4  |    510       231.82
 * 	  199        437.8  |    515       234.09
 */


public class B05S05 {

	public static void main(String[] args) {
		final double POUND = 2.2;

		System.out.println("Kilogram        Pound     |     Pound           Kilogram");

		for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
			System.out.printf("%-12d%7.1f", k, (k * POUND));
			System.out.print("       |     ");
			System.out.printf("%-9d%12.2f\n", p, (p / POUND));
		}
	}
	
}
