package bolum06.sorular;

/*
 * (Telefonun tuş takımı) Telefon tuşlarında kullanılan Uluslararası harf/sayı karşılıkları standardı
 * Programming Exercise 4.15 gösterilmişti. Girilen büyük harf karakterine karşılık gelen rakamı veren
 * aşağıdaki bildirime sahip bir metot yazınız:
 * 
 * int ​getNumber(​char ​uppercaseLetter)
 * 
 * Kullanıcıdan telefon numarasını yazı olarak girmesini isteyin, Girdi farklı karakterler içerebilir.
 * Program harfi (büyük ya da küçük) ona karşılık gelen rakama çevirecek ancak diğer karakterlerde
 * herhangi değişiklik yapmayacak. 
 */

import java.util.Scanner;

public class B06S21 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.println("Telefon numaranızı yazı olarak giriniz: ");
		String yazi = girdi.nextLine();

		for (int i = 0; i < yazi.length(); i++) {
			if (Character.isLetter(yazi.charAt(i))) {
				System.out.print(numarayiYaz(Character.toUpperCase(yazi.charAt(i))));
			} else {
				System.out.print(yazi.charAt(i));
			}
		}

		System.out.println();
	}

	public static int numarayiYaz(char yazi) {
		if (yazi >= 'W') 
			return 9;
		 else if (yazi >= 'T') 
			return 8;
		 else if (yazi >= 'P') 
			return 7;
		 else if (yazi >= 'M') 
			return 6;
		 else if (yazi >= 'J') 
			return 5;
		 else if (yazi >= 'G') 
			return 4;
		 else if (yazi >= 'D') 
			return 3;
		 else  
			return 2;
	}
}
