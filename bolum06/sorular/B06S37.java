package bolum06.sorular;

/*
 * (Tam sayı formatlama)Belirtilen genişlikte bir tam sayıyı formatlayan ve aşağıdaki bildirime sahip
 * bir metot yazınız.
 * 
 * public static String ​format(​int ​number, ​int ​width)
 * 
 * Geri dönüş değeri olan string’in uzunluğu girilen uzunluk parametresidir. Girilen sayının uzunluğunu
 * başına 0 ekleyerek tamamlayanız. Örneğin; ​format(34, 4)​ ise ​0034​ ya da ​format(34, 5)​ ise ​00034​ gibi. Eğer
 * girilen sayının basamak sayısı uzunluk değerinden büyük ise girilen sayının aynısını geri dönsün.
 * Örneğin; ​format(34, 1)​ ise ​34​.
 * Kullanıcıdan bir sayı ve formatlancağı genişlik değerini alan ve ​format(number, width)​. metodunu
 * çağırarak formatlanmış stringi gösteren bir program yazınız.
 */
import java.util.Scanner;

public class B06S37 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir sayı ve genişlik değeri giriniz: ");
		int sayi = girdi.nextInt();
		int genislik = girdi.nextInt();
		
		System.out.println(sayi + " formatlanacak genişliği: " + genislik + " formatlanan hali: " + format(sayi, genislik));
	}
	
	public static String format(int sayi, int genislik) {
		
		String s = sayi + "";
		
		if(s.length() < genislik ) {
			for (int i = genislik - s.length(); i > 0; i--) {
				s = 0 + s;
			}
		}
		
		return s;
	}
}
