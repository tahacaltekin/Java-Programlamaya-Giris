package bolum05.sorular;

/*
 * ​ (Mil’den kilometre’ye dönüşüm) Aşağıdaki tabloyu oluşturan bir program yazınız. (1 mil 1,609 kilometredir)
 * 
 * 
 * 	Mil 	  Kilometre
 * 	 1			1.609
 * 	 2			3.218
 *  ...			...
 * 	 9      	14.481
 *   10      	16.090
 * 
 * 
 */

public class B05S04 {

	public static void main(String[] args) {
		final double KILOMETRE = 1.609;
		
		System.out.println("Mil               Kilometre");
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-15d%10.3f\n", i, (i * KILOMETRE));
		}
	}
}
