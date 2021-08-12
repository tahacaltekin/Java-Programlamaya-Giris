package bolum04.sorular;

/*
 *  ​(Taşıt plakası üretme) Taşıt plakalarının 4 rakam ve bunun ardından gelen 3 büyük harften
 * oluştuğunu varsayalım. Taşıt plakası üreten bir program yazınız.
 */

public class B04S25 {

	public static void main(String[] args) {
		
		int harf1 = 65 + (int)(Math.random() * (90-65));
		int harf2 = 65 + (int)(Math.random() * (90-65));
		int harf3 = 65 + (int)(Math.random() * (90-65));
		
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		int sayi3 = (int)(Math.random() * 10);
		int sayi4 = (int)(Math.random() * 10);
		
		System.out.println("" + sayi1 + sayi2 + sayi3 + sayi4 + (char)(harf1) + ((char)(harf2)) + ((char)(harf3)));
	}
}
