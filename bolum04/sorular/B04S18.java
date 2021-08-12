package bolum04.sorular;

/*
 * (Ders ve s�n�f) Kullan�c�dan iki karakter alan ve buna kar��l�k gelen ders ile s�n�f� g�steren bir
 * program yaz�n�z. �lk karakter dersi temsil eder, ikinci karakter 1, 2, 3, 4 rakamlar�ndan biridir ve s�ras�yla
 * 1. S�n�f 2. S�n�f, 3.S�n�f ve 4. S�n�f� temsil eder. A�a��daki girilen karakterin kar��l��� olan dersler
 * bulunmaktad�r.
 * 
 * M: Matematik
 * C: Bilgisayar Bilimleri
 * I: Bilgi Teknolojileri
 */

import java.util.Scanner;

public class B04S18 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("2 karakter giriniz: ");
		String str = girdi.nextLine();
		
		char karakter = Character.toUpperCase(str.charAt(0));
		char sinif = str.charAt(1);
		
		switch (karakter)
		{
			case 'M': System.out.print("Matematik "); break;
			case 'C': System.out.print("Bilgisayar Bilimleri "); break;
			case 'I': System.out.print("Bilgi Teknolojileri "); break;
			default : System.out.println("Hatal� karakter girdiniz!");
			System.exit(1);
		}
		
		switch (sinif) 
		{
			case '1': System.out.println("1.S�n�f"); break;
			case '2': System.out.println("2.S�n�f"); break;
			case '3': System.out.println("3.S�n�f"); break;
			case '4': System.out.println("4.S�n�f"); break;
			default : System.out.println("Hatal� giri�!");
		}
	}
}
