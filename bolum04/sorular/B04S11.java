package bolum04.sorular;

/*
 * (Onluk sayıyı, onaltılık sayı sistemine dönüştürme) Kullanıcıdan 0 ​ve 15 ​aralığında bir tam sayı
 * alan ve bunun onaltılık (hexadecimal) sayı sisteminde karşılığını gösteren bir program yazınız.
 */
import java.util.Scanner;

public class B04S11 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Decimal değeri giriniz: (0 - 15) ");
		int decimal = girdi.nextInt();
		
		if (decimal >= 0 && decimal <= 9) {
			System.out.println("Girilen sayının hex karşılığı " + decimal);
		} else if (decimal >= 10 && decimal <= 15) {
			System.out.println("Girilen değerin hex karşılığı " + (char)(decimal + 'A' - 10));
		} else 
			System.out.println("Hatalı değer girdiniz.");
	}
}
