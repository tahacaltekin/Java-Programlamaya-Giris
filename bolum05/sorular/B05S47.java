package bolum05.sorular;

/*
 * (İş: ISBN­13 kontrolü) ISBN­13 kitapları tanımlamak için kullanılan yeni bir standarttır. 13 basamaktan
 * oluşur. (d1d2d34d5d6d7d8d9d10d11d12d13) Son basamak d13 sağlama için kullanılır ve diğer basamaklar
 * kullanılarak aşağıdaki formülle hesaplanır.
 * 
 * 10 ­ (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
 * 
 * eğer sağlama değeri 10​ ise onu 0​ olarak alın. Programınız girdiyi string olarak okumalıdır.
 */

import java.util.Scanner;

public class B05S47 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("ISBN-13 numarasının 12 hanesini giriniz: ");
		String isbn = girdi.nextLine(); 
		
		if(isbn.length() != 12) {
			System.out.println(isbn + " eksik hane girdiniz");
			System.exit(1);
		}
		
		int kontrol = 0;
		
		for (int i = 0; i < isbn.length(); i++) {
			kontrol += i % 2 == 0 ? 3 * Integer.parseInt(isbn.charAt(i) + "") 
					: Integer.parseInt(isbn.charAt(i) + "");
		}
		
		kontrol = 10 - kontrol % 10;
		
		System.out.println("ISBN-13 numarası: " + isbn + (kontrol == 10 ? 0 : kontrol));
	}
}
