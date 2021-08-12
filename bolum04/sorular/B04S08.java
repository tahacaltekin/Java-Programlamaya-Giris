package bolum04.sorular;

/*
 * (ASCII kodun karakter karşılığı) ASCII kodun (0​ ve 127​ aralığında bir tam sayı) karakter karşılığını
 * gösteren bir program yazınız
 */
import java.util.Scanner;

public class B04S08 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("ASCII koduna dönüşüm için 0 ile 127 aralığında bir sayı giriniz: ");
		int i = girdi.nextInt();
		
		System.out.println("Girilen değerin ASCII karşılığı " + (char)i);
	}
}
