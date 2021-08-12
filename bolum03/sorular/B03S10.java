package bolum03.sorular;

/*
 * (Oyun: toplama s�nav�) Madde 3.3, SubtractionQuiz.java, rasgele ��karma i�lemi sorular�
 * �retmektedir. Bu program� 100�den k���k rastgele iki tam say� ile toplama sorular� �retecek �ekilde
 * yeniden d�zenleyiniz.
 */

import java.util.Scanner;

public class B03S10 {
	public static void main(String[] args) {
		int sayi1 = (int)(Math.random() * 100);
		int sayi2 = (int)(Math.random() * 100);
		
		
		if (sayi2 > sayi1) {
			int temp = sayi1;
			sayi1 = sayi2;
			sayi2 = temp;
		}
		
		System.out.println(sayi1 + " + " + sayi2 + " = ?");
		
		Scanner girdi = new Scanner(System.in);
		int sonuc = girdi.nextInt();
		
		if (sayi1 + sayi2 == sonuc) {
			System.out.println("Tebrikler bildiniz.");
		} else {
			System.out.println("Yanl�� cevap. Do�rusu: " + (sayi1 + sayi2));
		}
		
	}
}
