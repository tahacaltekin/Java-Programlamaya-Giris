package bolum02.sorular;


/*
 * (​Finans uygulaması: faiz hesaplama) Bakiye ve yıllık faiz oranını biliyorsak aşağıdaki
 * formülü kullanarak bir sonraki ay elde edilecek faiz geliri hesap edilebilir.
 * 
 * 
 * 			faizGetirisi = bakiye * (yillikFaizOrani / 1200)
 * 
 * 
 * Kullanıcıdan, bakiye ve yıllık faiz oranını isteyen ve bir sonraki ay için elde edilecek faiz gelirini
 * hesaplayan bir program yazınız.
 */

import java.util.Scanner;

public class B02S20 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Gelecek ayın faiz getirisini öğrenmek için bakiyenizi giriniz: ");
		double bakiye = girdi.nextDouble();
		
		System.out.println("Yıllık faiz oranını giriniz: ");
		double yillikFaiz = girdi.nextDouble();
		
		double faizGetirisi = bakiye * (yillikFaiz / 1200);
		System.out.println("Gelecek ayın faiz getirisi " + (int)(faizGetirisi * 100000) / 100000.0);
		
	}

}
