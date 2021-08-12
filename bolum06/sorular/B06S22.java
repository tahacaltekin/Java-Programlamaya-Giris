package bolum06.sorular;

/*
 *   ​(​Matematik: yaklaşık karekök) ​Math​ sınıfındaki sqrt ​ ​ metodunu yazmak için birkaç yöntem
 *   bulunmaktadır.
 *   method in the ​Math ​class. Bu yöntemlerden biri de Babylonian tekniği’dir.​ Bu yöntem n sayısının
 *   karekökünün yaklaşık değerini hesaplamak için aşağıdaki formulü tekrar ederek kullanır.
 *   
 *   nextGuess = (lastGuess + n / lastGuess) / ​2
 *   
 *   nextGuess​ ve ​lastGuess​ neredeyese aynı olduklarında, ​nextGuess​ yaklaşık karakök değerini verir.  Başlangıç
 *   tahmin değeri herhangi bir pozitif sayı olabilir. (Ör., 1​ ​). Bu ​lastGuess​. değişkeni için başlangıç değeri
 *   olacaktır. Eğer ​nextGuess ​ve ​lastGuess​ arasındaki fark oldukça küçük bir sayı olursa (​0.0001​ gibi) ​nextGuess
 *   in ​n​ sayısının karekök değeri olduğuna hükmedebilirsiniz.​  Eğer değilse ​nextGuess ​in değeri ​lastGuess ​e
 *   atanır ve hesaplama devam eder.  ​n​ sayısının karekök değerini hesaplayan aşağıda bildirimi bulunan
 *   metodu yazınız.
 *   
 *   public static double ​sqrt(​long ​n)
 *   
 */

import java.util.Scanner;

public class B06S22 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		long sayi = girdi.nextLong();
		
		System.out.println(sayi + " sayısının yaklaşık olarak karekökü: " + sqrt(sayi));
	}
	
	
	public static double sqrt(long n) {
		long sonTahmin = 1;
		long siradakiTahmin = (sonTahmin + n / sonTahmin) / 2;
		
		
		while (siradakiTahmin - sonTahmin > 0.0001) {
			sonTahmin = siradakiTahmin;
			siradakiTahmin = (sonTahmin + n / sonTahmin) / 2;
		}
		
		sonTahmin = siradakiTahmin;
		return siradakiTahmin = (sonTahmin + n / sonTahmin) / 2;
	}
}
