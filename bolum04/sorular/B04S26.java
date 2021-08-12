package bolum04.sorular;

/*
 * (Finans uygulaması: Madeni paralar) Madde 2.10, ComputeChange.java’yı float​ türünden int
 * türüne olan dönüşümlerde değer kaybı olmadan hesaplayacak biçimde yeniden yazınız. “11.56”​ gibi bir
 * girişi string olarak alınız. Noktanın solunda bulunan dolar kısmını ve noktanın sağında bulunan cent
 * kısmını indexOf ​ve substring ​metodlarını kullanarak ayırabilirsiniz. 
 */

import java.util.Scanner;

public class B04S26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    System.out.print(
	      "Enter an amount in double, for example 11.56: ");
	    String amount = input.nextLine();

	    String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

	    int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
	    
	    
	    int numberOfQuarters = cents / 25;
	    cents %= 25;

	    int numberOfDimes = cents / 10;
	    cents %= 10;

	    int numberOfNickels = cents / 5;
	    cents %= 5;

	    System.out.println("Your amount " + amount + " consists of\n "
	    		+ numberOfOneDollars + " dollars\n "
	    		+ numberOfQuarters + " quarters\n "
	    		+ numberOfDimes + " dimes\n "
	    		+ numberOfNickels + " nickels\n "
	    		+ cents + " pennies\n "); 
	  }
}
