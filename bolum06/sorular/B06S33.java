package bolum06.sorular;

/*
 *  ​(Şimdiki saat ve tarih) ​System.currentTimeMillis()​ metodu 1 ocak 1976 tarihinden, o na kadar geçen
 * zamanı mili saniye olarak verir. Tarih ve saati gösteren bir program yazınız
 */

public class B06S33 {

	public static void main(String[] args) {
		System.out.println(zamaniAl());	
	}
	
	public static String zamaniAl() {
		
		long toplamMiliSaniye = System.currentTimeMillis();
		
		long toplamSaniye = toplamMiliSaniye / 1000;
		
		long simdikiSaniye = toplamSaniye % 60;
		
		long toplamDakika = toplamSaniye / 60;
		
		long simdikiDakika = toplamDakika % 60;
		
		long toplamSaat = toplamDakika / 60;
		
		long simdikiSaat = toplamSaat % 24;
		
		long toplamGun = toplamSaat / 24;
		
		return gunAl((int)toplamGun) + " " + simdikiSaat + ":" + simdikiDakika + ":" + simdikiSaniye + " GMT";
	}
	
	public static String ayYazdir(int ay) {
		String aylar = "";
		
		switch (ay) {
		case 1: aylar = "Ocak"; break;
		case 2: aylar = "Şubat"; break;
		case 3: aylar = "Mart"; break;
		case 4: aylar = "Nisan"; break;
		case 5: aylar = "Mayıs"; break;
		case 6: aylar = "Haziran"; break;
		case 7: aylar = "Temmuz"; break;
		case 8: aylar = "Ağustos"; break;
		case 9: aylar = "Eylül"; break;
		case 10: aylar = "Ekim"; break;
		case 11: aylar = "Kasım"; break;
		case 12: aylar = "Aralık"; break;
		}
		return aylar;
	}
	
	public static String gunAl(int gunler) {
		int yil = 1970;
		int ay = 1;
		int gun = 1;
		int aydakiGunSayisi = aydakiGunSayisiniAl(yil, ay);
		
		for (int i = 0; i < gunler; i++) {
			gun++;
			if(gun > aydakiGunSayisi) {
				ay++;
				gun = 1;
			} 
			if(ay > 12) {
				yil++;
				ay = 1;
			}
			aydakiGunSayisi = aydakiGunSayisiniAl(yil, ay);
		}
		
		return ayYazdir(ay) + " " + gun + ", " + yil;
	}
	
	public static boolean artikYilMi(int yil) {
		
		return yil % 400 == 0 || (yil % 4 == 0  && yil % 100 != 0);
	}
	
	public static int aydakiGunSayisiniAl(int yil, int ay) {
		if (ay == 1 || ay == 3 || ay == 5 || ay == 7 ||
				ay == 8 || ay == 10 || ay == 12) {
			return 31;
		}
		
		if (ay == 4 || ay == 6 || ay == 9 || ay == 11) {
			return 30;
		}
		
		if (ay == 2) {
			return artikYilMi(yil) ? 29 : 28;
		}
		
		return 0;
	}
}
