package bolum03.sorular;

/*
 * 2 ​(Oyun: üç sayıyı toplama) Madde 3.1’deki, AdditionQuiz.java, iki adet tam sayı üretip,
 * kullanıcıdan bu sayıların toplamını girmesini istiyordu.
 * Bu programı, üç tam sayı üretecek ve kullanıcıdan bu üç tam sayının toplamını alacak şekilde yeniden
 * düzenleyiniz. 
 */

import java.util.Scanner;

public class B03S02 {
	public static void main(String[] args) {
		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);
		int sayi3 = (int) (Math.random() * 10);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("What is " + sayi1 + " + " + sayi2 + " + " + sayi3 + " = ? ");

		int answer = input.nextInt();

		System.out.println(sayi1 + " + " + sayi2 + " + " + sayi3 + " = " + answer + " is " + (sayi1 + sayi2 + sayi3== answer));
	}
}
