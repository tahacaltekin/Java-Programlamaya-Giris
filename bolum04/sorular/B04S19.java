package bolum04.sorular;

/*
 *(Ýþ: ISBN­10 kontrolü) Programlama Sorularý 3.9’u ISBN numarasýný string olarak alacak þekilde
 * yeniden düzenleyiniz.
 */

import java.util.Scanner;

public class B04S19 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.println("Kitaba verilecek seri numarasý için 9 adet tam sayý giriniz: ");
		String isbn = girdi.nextLine();
		
		int d1 = Integer.parseInt(isbn.substring(0, 1));
		int d2 = Integer.parseInt(isbn.substring(1, 2));
		int d3 = Integer.parseInt(isbn.substring(2, 3));
		int d4 = Integer.parseInt(isbn.substring(3, 4));
		int d5 = Integer.parseInt(isbn.substring(4, 5));
		int d6 = Integer.parseInt(isbn.substring(5, 6));
		int d7 = Integer.parseInt(isbn.substring(6, 7));
		int d8 = Integer.parseInt(isbn.substring(7, 8));
		int d9 = Integer.parseInt(isbn.substring(8));

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		System.out.println("ISBN-10 numarasý: " + isbn + ((d10 == 10) ? "X" : d10));
	}

}
