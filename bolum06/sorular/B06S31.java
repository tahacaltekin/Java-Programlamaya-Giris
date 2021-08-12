package bolum06.sorular;

/*
 * (​Finans: kredi kartı numarası geçerliliği) Kredi kart numaraları belirli bir kalıba sahiptirler.
 * Kredi kartı numaraları 13 ve16 arasında basamak sayısına sahiptir. Başlangıç numarasına göre kartlar:
 * 
 * ■ ​4 Visa kart
 * ■ ​5 Master kart
 * ■ ​37 American Express kart
 * ■ ​6 Discover kart
 * 
 * 1954 yılında IBM’den Hans Luhn kredi kartı numaralarının geçerliliğini kontrol etmek için bir algoritma
 * önerdi. Bu algortima kredi kartı numarasının doğru girilip girilmediğini ya da doğru taranıp
 * taranmadığını kontrol etmek için kullanılır. Genel olarak Luhn kontrolü ya da Mod 10 kontrolü olarak
 * bilinen bu algoritma kredi kartı numaralarının üretilmesinde ve kontrolünde kullanılır. (Deneme için
 * kart numarasının 4388576018402626 olduğunu varsayalım).
 * 
 * 1. Sağdan sola doğru her ikinci basamağın iki katını alın. Eğer sonuç iki basamaklı bir sayı çıkarsa
 * basamak değerlerini toplayınız ve tek basamaklı bir sayı elde ediniz.
 * 
 * 2. Elde ettiğiniz tüm rakamları toplayınız.
 * 4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
 * 
 * 3. Sağdan sola tek pozisyonunda duran rakamları toplayınız.
 * 6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
 * 
 * 4. 2. ve 3.adımda çıkan değerleri toplayınız.
 * 37 + 38 = 75
 * 
 * 5. Eğer 4. adımda elde edilen değer 10’a tam bölünüyorsa kredi kartı numarası geçerlidir. Aksi takdirde
 * geçersizdir. Örneğin 4388576018402626 numarası geçersizdir. Ancak 4388576018410707 numarası
 * geçerlidir.
 * 
 * Kullanıcıdan kredi kartı numarasını long sayı tipinde alan ve numaranın geçerli olup olmadığını gösteren
 * bir program yazınız. Programınızı aşağıdaki metodları kullanacak şekilde tasarlayınız.
 * 
 * Kredi kartı numarası geçerliye true döner. 
 * public static boolean ​isValid(​long ​number)
 * 
 * 2. adımdaki sonucu hesaplar
 * public static int ​sumOfDoubleEvenPlace(​long ​number)
 * 
 * Eğer tek basamak ise sayının kendi değerini döndürür.
 * değilse iki basamağın toplamını döndürür
 * public static int ​getDigit(​int ​number)
 * 
 * Tek pozisyonunda bulunan basamakların toplamını döndürür 
 * public static int ​sumOfOddPlace(​long ​number)
 * 
 * d basamağının önek olduğu durumda true döner 
 * public static boolean ​prefixMatched(​long ​number, ​int ​d)
 * 
 *  basamak sayısını hesaplar 
 *  public static int ​getSize(​long ​d)
 *  
 *  number değişkenin k kadar basamağını bulur. ​Eğer;
 *  basamak sayısı k’dan küçükse sayının kendisine döner
 *  public static long ​getPrefix(​long ​number, ​int ​k)
 *  
 *  (Bu programı kullanıcıdan kart numarasını string olarak okuyarak
 *  da alabilirsiniz. String’i işleyerek kredi kartı numarasının geçerliliğini kontrol edebilirsiniz. )
 */

import java.util.Scanner;

public class B06S31 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Kredi kartı numaranızı giriniz: ");
		long kartNo = girdi.nextLong();
		
		System.out.println(kartNo + (gecerliMi(kartNo) ? " Geçerli" : " Geçersiz"));
	}
	
	public static boolean gecerliMi(long kartNo) {
		boolean gecerli = boyutAl(kartNo) >= 13 && boyutAl(kartNo) <= 16 &&
				(onekEslesme(kartNo, 4) || onekEslesme(kartNo, 5) ||
				 onekEslesme(kartNo, 37) || onekEslesme(kartNo, 6)) &&
				((ciftYerlerinToplami(kartNo) + tekYerlerinToplami(kartNo)) % 10 == 0);
		
		return gecerli;
	}
	
	public static int ciftYerlerinToplami(long kartNo) {
		int toplam = 0;
		String sayi = kartNo + "";
		for (int i = boyutAl(kartNo) - 2; i >= 0; i -= 2) {
			toplam += karakterAl(Integer.parseInt(sayi.charAt(i) + "") * 2);
		}
		
		return toplam;
	}
	
	public static int karakterAl(int kartNo) {
		if(kartNo < 9) {
			return kartNo;
		} else {
			return kartNo / 10 + kartNo % 10;
		}
	}
	
	public static int tekYerlerinToplami(long kartNo) {
		int toplam = 0;
		String sayi = kartNo + "";
		for (int i = boyutAl(kartNo) - 1; i >= 0; i -= 2) {
			toplam += Integer.parseInt(sayi.charAt(i) + "");
		}
		return toplam;
	}
	
	// Eğer karakter sayi için bir önek ise true döner. 
	public static boolean onekEslesme(long kartNo, int karakter) {
		return onekAl(kartNo, boyutAl(karakter)) == karakter;
	}
	
	public static int boyutAl(long karakter) {
		String sayi = karakter + "";
		return sayi.length();
	}
	
	public static long onekAl(long kartNo, int karakter) {
		if(boyutAl(kartNo) > karakter) {
			String sayi = kartNo + "";
			return Long.parseLong(sayi.substring(0, karakter));
		}
		return kartNo;
	}
}
