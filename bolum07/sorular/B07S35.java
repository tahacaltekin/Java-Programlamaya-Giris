package bolum07.sorular;

/*
 *  (​Oyun: adam asmaca) Rastgele kelime üreten ve her seferinde kullanıcıdan bir harf girmesini
 * isteyen örnek akıştaki gibi bir adam asmaca oyunu yazınız. Kelimedeki her harf yıldız olarak
 * gösterilecek. Eğer kullanıcı doğru harfi tahmin ederse, bulunduğu yerdeki yıldız yerine harf gösterilecek.
 * Kullanıcıyı kelimeyi bulduğunda, yanlış girdiği harf sayısını gösterin ve başka bir kelimeyle yeniden
 * oynamak isteyip istemediğini sorunuz. Aşağıdaki gibi kelimeleri saklayacak bir dizi oluşturunuz:
 * 
 * // Bulunmasını istediğiniz kelimeleri bu diziye ekleyiniz.
 * String[] words = {​”yazmak”,​  ​“bu"​, ...};
 */

import java.util.Scanner;

public class B07S35 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		String oyna;
		do {
			char[] kelime = kelimeBul();
			
			char[] yildizlar = new char[kelime.length];
			yildizlarDoldur(yildizlar);
			
			int hata = 0;
			do {
				char tahminler = tahmin(yildizlar);
				
				if(!dogruTahminMi(kelime, yildizlar, tahminler)) {
					hata++;
				} 
			} while(!kelimeBittiMi(yildizlar));
			
			yazdir(kelime, hata);
			
			System.out.println("Bir daha oynamak ister misiniz? e ya da h basin>");
			oyna = girdi.next();
		} while(oyna.charAt(0) == 'e');
	}
	
	public static char[] kelimeBul() {
		String[] kelimeler = {"program", "kodlama", "yazılım", "java", "merhaba", "türkiye", "mrnobody"};
		
		String sec = kelimeler[(int)(Math.random() * kelimeler.length)];
		char[] kelime = new char[sec.length()];
		
		for (int i = 0; i < kelime.length; i++) {
			kelime[i] = sec.charAt(i);
		}
		return kelime;
	}
	
	public static void yildizlarDoldur(char[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = '*';
		}
	}
	
	public static boolean dogruTahminMi(char[] kelime, char[] bosluklar, char tahmin) {
		boolean dogru = false;
		int mesaj = 2;
		for (int i = 0; i < kelime.length; i++) {
			if(kelime[i] == tahmin) {
				dogru = true;
				if(bosluklar[i] == tahmin) {
					mesaj = 1;
				} else {
					bosluklar[i] = tahmin;
					mesaj = 0;
				}
			}
		}
		
		if (mesaj > 0) {
			yazdir(mesaj, tahmin);
		}
		return dogru;
	}
	
	public static boolean kelimeBittiMi(char[] bosluklar) {
		for (char c : bosluklar) {
			if (c == '*') {
				return false;
			}
		}
		return true;
	}
	
	public static void yazdir(char[] kelime, int hata) {
		System.out.print("Kelime: ");
		System.out.print(kelime);
		System.out.println("Yapılan hata sayısı: " + hata + " kez");
	}
	
	public static void yazdir(int m, char tahmin) {
		System.out.println("\t" + tahmin);
		switch (m) {
		case 1: System.out.println(" Bu harf zaten girildi."); break;
		case 2: System.out.println(" Bu harf kelimenin içinde yok."); 
		}
	}
	
	public static char tahmin(char[] yildizlar) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("(Tahmin) bir harf giriniz: ");
		System.out.print(yildizlar);
		System.out.print(" > ");
		String g = girdi.next();
		return g.charAt(0);
	}
}
