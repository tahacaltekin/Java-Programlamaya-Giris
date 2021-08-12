package bolum05.sorular;

/*
 * (Bilgisayar mimarisi: bitsel işlemler) short​ türü 16​ bit büyüklüğündedir. Kullanıcıdan short tam sayı
 * türünde bir değer girmesini isteyin ve bu tam sayının 16​ bitini gösteren bir program yazınız.
 * 
 * (İpucu: Bitsel sağa kaydırma operatörü (>>​) ve bitsel AND​ operatörünü (&​) kullanmanız gerekecek. Bitsel
 * operatörler için EK G’ye bakabilirsiniz.)
 */

import java.util.Scanner;

public class B05S44 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir integer giriniz: ");
		short sayi = girdi.nextShort();
		
		String bits = "";
		
		for (int i = 0; i < 16; i++) {
			bits = (sayi & 1) + bits;
			
			sayi >>= 1;
		}
		
		System.out.println("Girilen değerin bit karşılığı " + bits + " dir");
	}
}
