package bolum04.sorular;

/*
 * (Onalt�l�k say�y� ikilik say�ya d�n��t�rme) Kullan�c�dan onalt�l�k say� sisteminde bir say� alan ve
 * bunun ikilik say� sisteminde kar��l���n� g�steren bir program yaz�n�z.
 */
import java.util.Scanner;

public class B04S12 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("hex de�eri giriniz: ");
		String hexString = girdi.nextLine();
		
		if (hexString.length() != 1) {
			System.out.println("Bir karakter girmelisiniz!");
			System.exit(1);
		}
		char ch = hexString.charAt(0);
		if ((ch >= 'A' && ch <= 'F') || (ch >= 0 && ch <= 9)) {
			System.out.println("Girilen de�er: ");
			switch (ch) {
			
			case 0: System.out.println(0000); break;
			case 1: System.out.println(0001); break;
			case 2: System.out.println(0010); break;
			case 3: System.out.println(0011); break;
			case 4: System.out.println(0100); break;
			case 5: System.out.println(0101); break;
			case 6: System.out.println(0110); break;
			case 7: System.out.println(0111); break;
			case 8: System.out.println(1000); break;
			case 9: System.out.println(1001); break;
			case 'A': System.out.println(1010); break;
			case 'B': System.out.println(1011); break;
			case 'C': System.out.println(1100); break;
			case 'D': System.out.println(1101); break;
			case 'E': System.out.println(1110); break;
			case 'F': System.out.println(1111); break;
			
			}
		} else {
			System.out.println(ch + " Hatal� de�er!");
		}
	}
}
