package bolum03.sorular;

/*
 * (Palindrom sayýlar) Kullanýcýdan üç basamaklý bir tam sayý alan ve bu sayýnýn palindrom olup
 * olmadýðýný sýnayan bir program yazýnýz. Eðer sayý saðdan­sola ve soldan­saða ayný ise, bu sayý
 * palindromdur. Programýn örnek akýþýný inceleyiniz
 */
import java.util.Scanner;

public class B03S12 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("3 basamaklý bir sayý giriniz: ");
		int sayi = girdi.nextInt();
		
		int sayiBirlerBasamagi = sayi / 100;
		int kalanBasamak = sayi % 100;
		int sayiOnlarBasamagi = kalanBasamak / 10;
		int sayiYuzlerBasamagi = kalanBasamak % 10;
		
		if (sayiBirlerBasamagi == sayiYuzlerBasamagi) {
			System.out.println(sayi + " sayýsý bir palindrome sayýdýr.");
		} else {
			System.out.println(sayi + " sayýsý palindrome sayý deðildir.");
		}
	}
}
