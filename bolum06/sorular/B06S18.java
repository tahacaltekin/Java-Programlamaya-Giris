package bolum06.sorular;

/*
 * (Şifre kontrolü) Bazı web siteleri şifre oluşturmada kesin kurallar uygularlar. Girilen bir
 * string’in geçerli bir şifre olup olmadığını kontrol eden bir metot yazınız. Şifre kurallarının aşağıdaki gibi
 * olduğunu varsayalım:
 * 
 * 
 * ■ ​ Şifre en az 8 karakterden oluşmalıdır.
 * ■ ​ Şifre sadece harf ve rakamlardan oluşabilir.
 * ■ ​ Şifre en az iki rakam içermelidir.
 * 
 * Kullanıcıdan bir şifre girmesini isteyen ve eğer şifre belirtilen kurallara uygunsa “​Geçerli Şifre​” değilse
 * “​Geçersiz Şifre​” mesajını gösteren bir program yazınız.
 */


import java.util.Scanner;

public class B06S18 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir şifre giriniz: ");
		String sifre = girdi.nextLine();
		
		System.out.println((sifreGecerliMi(sifre) ? "Geçerli " : "Geçersiz ") + "Şifre");
	}
	
	public static boolean sifreGecerliMi(String sifre) {
		final int GECERLI_SIFRENIN_UZUNLUGU = 8;
		final int MIN_KARAKTER_SAYISI = 2;
		
		boolean gecerliSifre = uzunlukGecerliMi(sifre, GECERLI_SIFRENIN_UZUNLUGU) &&
				harflerVeRakamlar(sifre) && 
				karakterSayisi(sifre, MIN_KARAKTER_SAYISI);
		
		return gecerliSifre;
	}
	
	public static boolean uzunlukGecerliMi(String sifre, int uzunluk) {
		return sifre.length() >= uzunluk;
	}
	
	public static boolean harflerVeRakamlar(String sifre) {
		for (int i = 0; i < sifre.length(); i++) {
			if(!Character.isLetterOrDigit(sifre.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean karakterSayisi(String sifre, int n) {
		int basamakSayisi = 0;
		for (int i = 0; i < sifre.length(); i++) {
			if(Character.isDigit(sifre.charAt(i))) {
				basamakSayisi++;
			}
			if(basamakSayisi >= n) {
				return true;
			}
		}
		return false;
	}
}
