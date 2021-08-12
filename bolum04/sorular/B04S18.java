package bolum04.sorular;

/*
 * (Ders ve sýnýf) Kullanýcýdan iki karakter alan ve buna karþýlýk gelen ders ile sýnýfý gösteren bir
 * program yazýnýz. Ýlk karakter dersi temsil eder, ikinci karakter 1, 2, 3, 4 rakamlarýndan biridir ve sýrasýyla
 * 1. Sýnýf 2. Sýnýf, 3.Sýnýf ve 4. Sýnýfý temsil eder. Aþaðýdaki girilen karakterin karþýlýðý olan dersler
 * bulunmaktadýr.
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
			default : System.out.println("Hatalý karakter girdiniz!");
			System.exit(1);
		}
		
		switch (sinif) 
		{
			case '1': System.out.println("1.Sýnýf"); break;
			case '2': System.out.println("2.Sýnýf"); break;
			case '3': System.out.println("3.Sýnýf"); break;
			case '4': System.out.println("4.Sýnýf"); break;
			default : System.out.println("Hatalý giriþ!");
		}
	}
}
