package bolum06.sorular;

/*
 * (Bir yıldaki gün sayısı) Bir yıldaki gün sayını gösteren, aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * public static int ​numberOfDaysInAYear(​int ​year)
 * 
 * 2000’den 2020’ye kadar tüm yıllar için gün sayısını gösteren bir test programı yazınız.
 */

public class B06S16 {

	public static void main(String[] args) {
		
		System.out.println("Yıl    Gün Sayısı");
		for (int yil = 2000; yil <= 2020; yil++) {
			System.out.println(yil + "      " + birYildakiGunSayisi(yil));
		}
	}
	
	public static int birYildakiGunSayisi(int yil) {
		if (artikYilMi(yil)) {
			return 366;
		} else {
			return 365;
		}
	}
	
	public static boolean artikYilMi(int yil) {
		return yil % 400 == 0 || (yil % 4 == 0 && yil % 100 != 0);
	}
}
