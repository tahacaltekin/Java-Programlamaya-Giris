package bolum04.sorular;

/*
 * (Rastgele karakter) Math.random() ​metodunu kullanarak bir tane rastgele büyük harf üretip
 * gösteren bir program yazınız.
 */

public class B04S16 {

	public static void main(String[] args) {
		int sayi = 65 + (int)(Math.random() * (91 - 65));
		
		System.out.println((char)(sayi));
	}
}
