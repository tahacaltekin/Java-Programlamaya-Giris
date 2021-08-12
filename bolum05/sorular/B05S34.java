package bolum05.sorular;

/*
 *  ​(Oyun:  makas, taş, kağıt) Programlama Alıştırmaları 3.17’de makas, taş, kağıt oyunu bulunmaktadır.
 * Bilgisayar ya da kullanıcının iki seferden fazla kazanana kadar oyunun devam etmesine imkan verecek şekilde
 * programı tekrar düzenleyiniz.
 */

import java.util.Scanner;

public class B05S34 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		int bilgisayarKazandi;
		int kullaniciKazandi;
		bilgisayarKazandi = kullaniciKazandi = 0;
		
		do {
			
			int bilgisayar = (int)(Math.random() * 3);
			
			
			System.out.println("Taş (0), kağıt (1), makas (2) : ");
			int kullanici = girdi.nextInt();
			
			switch (bilgisayar) {
			case 0: System.out.println("Bilgisayarın seçimi Taş"); break;
			case 1: System.out.println("Bilgisayarın seçimi Kağıt"); break;
			case 2: System.out.println("Bilgisayarın seçimi Makas"); 
			}
			
			switch (kullanici) {
			case 0: System.out.println("Sizin seçiminiz Taş"); break;
			case 1: System.out.println("Sizin seçiminiz Kağıt"); break;
			case 2: System.out.println("Sizin seçiminiz makas"); break;
			default : System.out.println("Hatalı sayı girdiniz!");
			System.exit(1);
			}
			
			if (kullanici == bilgisayar) {
				System.out.println("Berabere");
			} else {
				boolean win = (kullanici == 2 && bilgisayar == 1) || 
													(kullanici == 0 && bilgisayar == 2) || 
													(kullanici == 1 && bilgisayar == 0);
				
				if (win) {
					System.out.println(" Siz Kazandınız.");
					kullaniciKazandi++;
				} else {
					System.out.println(" Kaybettiniz.");
					bilgisayarKazandi++;
				}
			}
			System.out.println(bilgisayarKazandi + " kez bilgisayar kazandı. " + kullaniciKazandi + " kez siz kazandınız.");
		} while (Math.abs(bilgisayarKazandi - kullaniciKazandi) <= 2);
	}
}
