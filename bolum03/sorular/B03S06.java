package bolum03.sorular;

/* ​(Sağlık uygulaması: VKİ) Madde 3.4, ComputeAndInterpretBMI.java, dosyasını yeniden
 * düzenleyerek kullanıcıdan ağırlığı feet ve inç olarak alınız. Örneğin; Kullanıcı 5 feet 10 inç girmek
 * isterse, 5​ feet olarak ve 10​ u inç olarak alınız.
 */
import java.util.Scanner;

public class B03S06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter weight in pounds: ");
	    double weight = input.nextDouble();
	    
	    System.out.println("Enter feet: ");
	    double feet = input.nextDouble();
	    
	    System.out.print("Enter height in inches: ");
	    double inches = input.nextDouble();
	    
	    final double KILOGRAMS_PER_POUND = 0.45359237; 
	    final double METERS_PER_INCH = 0.0254; 
	    final double FEET_PER_INCH = 0.0833333;
	    
	    weight *= KILOGRAMS_PER_POUND; 
	    double height = (inches += feet / FEET_PER_INCH) * METERS_PER_INCH;
	    double bmi = weight / (Math.pow(height, 2));

	    System.out.println("BMI is " + bmi);
	    if (bmi < 18.5)
	      System.out.println("Underweight");
	    else if (bmi < 25)
	      System.out.println("Normal");
	    else if (bmi < 30)
	      System.out.println("Overweight");
	    else
	      System.out.println("Obese");
	}
}
