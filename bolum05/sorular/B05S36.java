package bolum05.sorular;

/*
 * ​(İş uygulaması: ISBN kontrolü) Programlama Alıştırması 3.9’u bir döngü kullanarak basitleştirin. 
 */

import java.util.Scanner;

public class B05S36 {

	public static void main(String[] args) {
Scanner girdi = new Scanner(System.in);
		
		System.out.println("Kitaba verilecek seri numarası için 9 adet tam sayı giriniz: ");
		String isbn = girdi.nextLine();
		
		int d10 = 0;
		
		for (int i = 0; i < 9; i++) {
			d10 += Integer.parseInt(isbn.charAt(i) + "") * (i + 1);
		}
		d10 %= 11;
		
		
		for (int i = 0; i < 9; i++) {
			System.out.print(isbn.charAt(i));
		}
		if (d10 == 10) {
			System.out.println("X");
		} else {
			System.out.println(d10);
		}
	}
}
