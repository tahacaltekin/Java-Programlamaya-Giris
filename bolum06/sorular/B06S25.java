package bolum06.sorular;

/*
 * (Milisaniyeyi ; saat, dakika ve saniyeye çevirme) Aşağıdaki bildirime sahip Milisaniyeyi ; saat,
 * dakika ve saniyeye çeviren bir metot yazınız.
 * 
 * public static ​String convertMillis(​long ​millis)
 * 
 * Metot saat:dakika:saniye formatında bir string geri döndürsün. Örneğin, ​convertMillis(5500)​ ‘ın sonucu
 * 0:0:5​ , ​convertMillis(100000)​ ‘ın soucu ​0:1:40​ ve ​convertMillis(555550000)​ sonucu ​154:19:10​.
 */

import java.util.Scanner;

public class B06S25 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Milisaniye giriniz: ");
		long miliSaniye = girdi.nextLong();
		
		System.out.println("Saat:dakika:saniye: " + miliSaniyeDonustur(miliSaniye));
	}
	
	public static String miliSaniyeDonustur(long miliSaniye) {
		miliSaniye /= 1000;
		
		String simdikiDakikaVeSaniye = "";
		
		for (int i = 0; i < 2; i++) {
			simdikiDakikaVeSaniye = ":" + miliSaniye % 60 + simdikiDakikaVeSaniye;
			miliSaniye /= 60;
		}
		
		return miliSaniye + simdikiDakikaVeSaniye;
	}
}
