package bolum06.sorular;

/*
 * (Basamak değerlerinin  ​ toplamı) Bir tamsayının basamak değerlerini toplayan bir metot yazınız.
 * Aşağıdaki metot bildirimini kullanınız:
 * 
 * public static int ​sumDigits(​long ​n)
 * 
 * Örneğin, ​sumDigits(234)​ ‘ün geri dönüş değeri ​9​ (​ 2 + 3 + 4).  (​İpucu: ​ % ​operatörünü kullanarak basamak
 * değerlerini elde edebilir, ​/​ operatörü ile değeri elde edilen basamağı kaldırabilirsiniz. Pratik olarak,
 * 234’ten 4’ü elde etmek için 234 % 10 (= 4). 4’ü atmak için 234 / 10 (= 23)  Bu basamakları dolaşan bir
 * döngü kullanarak basamak değerlerini elde ediniz. Kullanıcıdan bir tamsayı alan ve basamak değerleri
 * toplamını gösteren bir test programı yazınız.
 */

import java.util.Scanner;

public class B06S02 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir sayının basamaklarının toplamını görmek için sayı giriniz: ");
		long sayi = girdi.nextLong();
		
		System.out.println(sayi + " Sayısının basamkları toplamı: " + toplamBasamak(sayi));
	}
	
	public static long toplamBasamak(long n) {
		int toplam = 0;
		
		while (n > 0) {
			toplam += n % 10;
			n /= 10;
		}
		
		return toplam;
	}
}
