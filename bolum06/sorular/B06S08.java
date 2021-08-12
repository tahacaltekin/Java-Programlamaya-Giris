package bolum06.sorular;

/*
 * (Celsius ve Fahrenheit arasında dönüşüm) Aşağıdaki iki metoda sahip bir sınıf yazınız:
 * 
 *  Santiragttan fayrenhayta dönüşüm
 *  public static double ​celsiusToFahrenheit(​double ​celsius)
 *  
 *  Fayrenhayttan Santigrata dönüşüm 
 *  public static double ​fahrenheitToCelsius(​double ​fahrenheit)
 *  
 *  Dönüşüm için aşağıdaki formülü kullanabilirsiniz:
 *  
 *  fahrenhayt = (9,0 / 5) * santigrat + 32
 *  celsius = (5.0 / 9) * (fahrenheit – 32)
 */

public class B06S08 {

	public static void main(String[] args) {
		System.out.println("Derece    Fahrenheit 	   |   Fahrenheit      Derece\n" + 
							"-----------------------------------------------------------------");
		
		for (double derece = 40.0, fahrenheit = 120.0; derece >= 31.0; derece--, fahrenheit -= 10) {
			System.out.printf("%-12.1f", derece);
			System.out.printf("%-15.1f|", dereceToFahrenheit(derece));
			System.out.printf("     %-15.1f", fahrenheit);
			System.out.printf("%-7.2f\n", fahrenheitToDerece(fahrenheit));
		}
	}
	
	public static double dereceToFahrenheit(double derece) {
		return (9.0 / 5) * derece + 32;
	}
	
	public static double fahrenheitToDerece(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}
