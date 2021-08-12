package bolum02.sorular;

/*
 * 1​ (​Santigrat Fahrenhayt Dön​ üşümü) Konsoldan d​ ouble​ türünde Santigrat değerini alan ve
 * bunu Fahrenhayt olarak gösteren bir program yazınız. Dönüşüm için aşağıdaki formülü
 * kullanabilirsiniz:
 * 
 * fahrenhayt = (9 / 5) * santigrat + 32
 * 
 * İpucu: Java’da​ 9 / 5​ işleminin sonucu 1​ ​’dir. Sonucu gerçek sayı olarak hesaplamak için​ 9.0 / 5 = 1.8​ yazılabilir.
 * 
 */

import java.util.Scanner;

public class B02S01 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Dereceyi giriniz: ");
		
		double derece = girdi.nextDouble();
		double fahrenheit = (9.0 / 5) * derece + 32 ;
		
		System.out.println("Girdiğiniz Derecenin Fahrenheit karşılığı: "  + fahrenheit);
		
	}

}
