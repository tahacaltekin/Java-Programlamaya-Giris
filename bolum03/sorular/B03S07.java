package bolum03.sorular;

/*
 *  ​(Finans uygulaması: madeni paralar) Madde 2.10 ComputeChange .java dosyasını sonuç 1 ise
 * bunu tekil kelime yani 1 dollar ya da 1 penny, sonuç 1 den büyükse bunu çoğul kelime 2 dollars ya da 3
 * pennies gibi gösterecek ve eğer sonuç sıfır ise bunu göstermeyecek şekilde yeniden düzenleyiniz.
 */
import java.util.Scanner;

public class B03S07 {
	public static void main(String[] args) {  
		    Scanner input = new Scanner(System.in);
 
		    System.out.print(
		      "Enter an amount in double, for example 11.56: ");
		    double amount = input.nextDouble();

		    int remainingAmount = (int)(amount * 100);

		    int numberOfOneDollars = remainingAmount / 100;
		    remainingAmount = remainingAmount % 100;

		    int numberOfQuarters = remainingAmount / 25;
		    remainingAmount = remainingAmount % 25;

		    int numberOfDimes = remainingAmount / 10;
		    remainingAmount = remainingAmount % 10;

		    int numberOfNickels = remainingAmount / 5;
		    remainingAmount = remainingAmount % 5;

		    int numberOfPennies = remainingAmount;

		    
		    System.out.println("Your amount " + amount + " consists of"); 
		    System.out.println("    " + numberOfOneDollars + 
		    		(numberOfOneDollars == 1 ? " dollar" : " dollars"));
		    System.out.println("    " + numberOfQuarters +
		    		(numberOfQuarters == 1 ? " quater" : " quarters "));
		    System.out.println("    " + numberOfDimes + 
		    		(numberOfDimes == 1 ? " dime" : " dimes")); 
		    System.out.println("    " + numberOfNickels + 
		    		(numberOfNickels == 1 ? " nickel" : " nickels"));
		    System.out.println("    " + numberOfPennies + 
		    		(numberOfPennies == 1 ? " pennie" : " pennies"));
	}
}
