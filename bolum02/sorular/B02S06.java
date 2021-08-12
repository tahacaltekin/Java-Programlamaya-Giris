package bolum02.sorular;

/*
 * (​Tam sayının basamak değerlerinin toplamı)​ 0​ ve​ 1000​ aralığında bir tam sayı alan ve
 * basamak değerlerinin toplamını gösteren bir program yazınız. Örneğin; Girilen tam sayı  ​932​,
 * ise basamak değerli toplamı​ 14​’tür.
 * 
 * İpucu:  ​%​ operatörünü kullanarak basamak değerlerini elde edebilir,  ​/​ operatörü ile değeri
 *  elde edilen basamağı kaldırabilirsiniz. Örneğin,​ 932 % 10 = 2​ ve​ 932 / 10 = 93
 */
import java.util.Scanner;

public class B02S06 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("0 ile 1000 arasında bir sayı giriniz: ");
		
		int sayi = girdi.nextInt();
		int sayi1 = (sayi % 10);
		sayi = sayi / 10;
		
		
		int sayi2 = sayi % 10;
		sayi = sayi / 10;
		
		int sayi3 = sayi % 10;
		
		int rakamlartoplami = sayi1 + sayi2 + sayi3;
		
		System.out.println("Girilen sayının rakamları toplamı: " + (int)rakamlartoplami + " dır.");
	}

}
