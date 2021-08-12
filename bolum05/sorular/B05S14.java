package bolum05.sorular;

/*
 * (En büyük ortak böleni hesaplama) Madde 5.9’da n1​ ve n2​ tam sayılarının en büyük ortak bölenini bulmak
 * için burada farklı bir çözüm sunulmuştur: Öncelikle n1​ ve n2​ ‘nin minimumu olan d​ ‘yi bulunuz. d, d-1, d-2, ..., 2​,
 * veya 1​’in, n1​ ve n2​’nin her ikisi için de sırasıyla bölen olup olmadığını kontrol ediniz. n1​ ve n2​ için ilk ortak bölen
 * en büyük ortak bölendir. Kullanıcıdan iki pozitif tam sayı alan ve en büyük ortak böleni gösteren bir program
 * yazınız.
 */

import java.util.Scanner;

public class B05S14 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("1. sayıyı giriniz: ");
		int sayi1 = girdi.nextInt();
		
		System.out.println("2. sayıyı giriniz: ");
		int sayi2 = girdi.nextInt();
		
		int obeb = 1;
		
		int bolen = 2;
		while (bolen <= sayi1 && bolen <= sayi2) {
			if (sayi1 % bolen == 0 && sayi2 % bolen == 0) {
				obeb = bolen;
				
			}
			bolen++;
		}
		
		System.out.println(sayi1 + " ve " + sayi2 + " sayilarının obebi: " + obeb + " dir");
	}
}
