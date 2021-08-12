package bolum03.sorular;

/*
 * (Palindrom say�lar) Kullan�c�dan �� basamakl� bir tam say� alan ve bu say�n�n palindrom olup
 * olmad���n� s�nayan bir program yaz�n�z. E�er say� sa�dan�sola ve soldan�sa�a ayn� ise, bu say�
 * palindromdur. Program�n �rnek ak���n� inceleyiniz
 */
import java.util.Scanner;

public class B03S12 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("3 basamakl� bir say� giriniz: ");
		int sayi = girdi.nextInt();
		
		int sayiBirlerBasamagi = sayi / 100;
		int kalanBasamak = sayi % 100;
		int sayiOnlarBasamagi = kalanBasamak / 10;
		int sayiYuzlerBasamagi = kalanBasamak % 10;
		
		if (sayiBirlerBasamagi == sayiYuzlerBasamagi) {
			System.out.println(sayi + " say�s� bir palindrome say�d�r.");
		} else {
			System.out.println(sayi + " say�s� palindrome say� de�ildir.");
		}
	}
}
