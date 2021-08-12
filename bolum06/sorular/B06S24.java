package bolum06.sorular;

/*
 *  ​(Şu anki tarih ve zamanı gösterme) Madde 2.7, ShowCurrentTime.java, şu anki zamanı
 * gösteriyordu.  Örneği geliştirip şu anki tarih ve zamanı gösterin.  Madde 6.12 deki PrintCalendar.java yıl,
 * ay ve günü bulmanız konusunda size fikir verecektir. 
 */

public class B06S24 {

	public static void main(String[] args) {
		
		System.out.println(zaman());
		System.out.println(tarih());
		System.out.println(ay());
		System.out.println(gun());
	}
	
	public static String zaman() {
		final long ZAMAN_DILIMI = +3;
		
		long toplamZaman = System.currentTimeMillis();
		
		toplamZaman /= 1000;
		
		String SimdikiDakikaVeSaniye = "";
		for (int i = 0; i < 2; i++) {
			SimdikiDakikaVeSaniye = (toplamZaman % 60 < 10 ? ":0" + toplamZaman % 60 : ":" + toplamZaman %60) +
					SimdikiDakikaVeSaniye;
			toplamZaman /= 60;
		}
		
		String amOrPm = "";
		
		long simdikiSaat =  toplamZaman % 24;
		if(simdikiSaat == 0) {
			simdikiSaat = 24;
		} if (simdikiSaat > 12) {
			simdikiSaat -= 12;
			amOrPm = " PM";
		} else {
			amOrPm = " AM";
		}
		
		simdikiSaat += ZAMAN_DILIMI;
		
		return simdikiSaat + SimdikiDakikaVeSaniye + amOrPm;
	}
	
	public static String tarih() {
		return yil() + "";
	}
	
	public static int yil() {
		
		int simdikiYil = (int)(System.currentTimeMillis() / birYildakiMilisaniye()) + 1970;
		
		return simdikiYil;
	}
	
	public static int ay() {
		
		int simdikiAy = (int)((System.currentTimeMillis() % birYildakiMilisaniye()) / birAydakiMilisaniye());
		
		return simdikiAy + 1;
	}
	
	public static int gun() {
		
		return toplamGunSayisi(yil(), ay());
	}
	
	public static double birYildakiMilisaniye() {
		return 3.15569E10;
	}
	
	public static double birAydakiMilisaniye() {
		return 2.63E9;
	}
	
	public static int toplamGunSayisi(int yil, int ay) {
		int toplam = 0;
		
		for (int i = 1800; i < yil; i++) {
			toplam += artikYilMi(i) ? 366 : 365;
		}
		
		for (int i = 1; i < ay; i++) {
			toplam = toplam + birAydakiGunSayisi(yil, i);	
		}
		return toplam;
	}
	
	public static boolean artikYilMi(int yil) {
		return yil % 400 == 0 || (yil % 4 == 0  && yil % 400 != 0);
	}
	
	public static int birAydakiGunSayisi(int yil, int ay) {
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
