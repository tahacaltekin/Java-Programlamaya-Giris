package bolum08.sorular;


/*
 * (​Harf karesi) Harf karesi; n x n büyüklüğünde, ​n​ farklı harfin her bir satır ve sütunda aynı
 * harften bulunmayacak şekilde dizilmesiyle oluşan matrise denir. Kullanıcıdan harf sayısını (n) ve satır
 * satır harfleri alan bir program yazınız. Program girdinin harf karesi olup olmadığını kontrol edip sonucu
 * göstersin. Karakterler ​A​ harfinden başlar.
 */
import java.util.Scanner;

public class B08S36 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("nXn matris için bir n sayısı giriniz: ");
		
		int n = girdi.nextInt();
		
		char[][] kare = new char[n][n];
		
		System.out.println("Boşluk bırakarak " + n + " satır harf giriniz: ");
		kareyiCiz(kare);
		
		System.out.println("Dizi harf karesi" + (harfKaresiMi(kare) ? "dir." : " değildir"));
	}
	
	
	public static boolean harfKaresiMi(char[][] k) {
		return farkliSatirMi(k) && farkliSutunMu(k);
	}
	
	public static boolean farkliSatirMi(char[][] k) {
		for (int i = 0; i < k.length; i++) {
			int[] sayac = new int[k.length];
			for (int j = 0; j < k[i].length; j++) {
				sayac[k[i][j] - 65]++;
				if(sayac[k[i][j] - 65] > 1) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean farkliSutunMu(char[][] k) {
		for (int i = 0; i < k.length; i++) {
			int[] sayac = new int[k[0].length];
			for (int j = 0; j < k[i].length; j++) {
				sayac[k[j][i] - 65]++;
				if(sayac[k[j][i] - 65] > 1) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void kareyiCiz(char[][] kare) {
		
		Scanner girdi = new Scanner(System.in);
		
		for (int i = 0; i < kare.length; i++) {
			for (int j = 0; j < kare[i].length; j++) {
				String str = girdi.next();
				char ch = str.charAt(0);
				
				if (ch >= 'A' && ch < (char)('A' + kare.length)) {
					kare[i][j] = ch;
				} else {
					System.out.println("Hatalı giriş: Girilen harfler A ile " + (char)('A' + kare.length - 1) + " arasında olmalıdır.");
					System.exit(1);
				}
			}
		}
	}
	
}
