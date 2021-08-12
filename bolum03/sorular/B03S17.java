package bolum03.sorular;

/*
 * (Oyun: makas, taş, kağıt) Makas, taş, kağıt oyununu oynatan bir program yazınız. (Makas
 * kağıdı keser, taş makası kırar, ve kağıt taşı sarar.) Program rastgele makas, taş ve kağıdı temsilen 0​, 1​,
 * 2​  sayılarını üretsin. Program kullanıcıdan 0, 1, 2​ sayılarından birini girmesini istesin ve bilgisayarın
 * sonucuna göre “kazandınız”, “kaybettiniz” ya da “berabere kaldınız” mesajlarından uygun olanı
 * göstersin.
 */

import java.util.Scanner;

public class B03S17 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
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
		case 2: System.out.println("Sizin seçiminiz makas");
		}
		
		if (kullanici == bilgisayar) {
			System.out.println("Berabere");
		} else {
			boolean win = (kullanici == 2 && bilgisayar == 1) || 
												(kullanici == 0 && bilgisayar == 2) || 
												(kullanici == 1 && bilgisayar == 0);
			
			if (win) {
				System.out.println("Siz Kazandınız.");
			} else {
				System.out.println("Kaybettiniz.");
			}
		}
	}
}
