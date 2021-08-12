package bolum06.sorular;

/*
 * (feet ve metre arasında dönüşüm) Aşağıdaki iki metoda sahip bir sınıf yazınız:
 *  Feetten metreye dönüşüm
 *  Metreden feete dönüşüm
 *  
 *  public static double ​meterToFoot(​double ​meter)
 *  
 *  Dönüşüm için aşağıdaki formülü kullanabilirsiniz:
 *  
 *  metre = 0.305 * foot
 *  foot = 3.279 * metre
 */

public class B06S09 {

	public static void main(String[] args) {
		System.out.println("Feet        Metre       |     Metre        Feet\n" +
						   "----------------------------------------------------");
		
		for (double feet = 1.0, metre = 20.0; feet <= 10.0; feet++, metre += 5) {
			System.out.printf("%4.1f       ", feet);
			System.out.printf("%6.3f", feetToMetre(feet));
			System.out.printf("       |      ");
			System.out.printf("%-11.1f", metre);
			System.out.printf("%7.3f\n", metreToFeet(metre));
		}
	}
	
	public static double feetToMetre(double feet) {
		return 0.305 * feet;
	}
	
	public static double metreToFeet(double metre) {
		return 3.279 * metre;
	}
}
