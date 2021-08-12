package bolum05.sorular;

/*
 * (Toplama) Aşağıdaki toplama işlemi yapan bir program yazınız.
 * 
 * 1 / (1 + √2) + 1 / (√2 + √3) + 1 / (√3 + √4) + ... +  1 / (√624 + √625)
 * 
 */

public class B05S35 {

	public static void main(String[] args) {
		double toplam = 0.0;
		
		for (double i = 1.0; i <= 624.0; i++) {
			toplam += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		
		System.out.println("Toplam: " + toplam );
	}
}
