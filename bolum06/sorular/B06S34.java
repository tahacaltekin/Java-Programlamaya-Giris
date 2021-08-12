package bolum06.sorular;

/*
 *  ​(​Takvim) Programlama Soruları 3.21 Zeller algoritması ile verilen bir tarihin hangi gün olduğu
 * hesaplar. Madde 6.12’deki  PrintCalendar.java, kodunu zeller algoritmasını kullanarak basitleştirin.
 */

import java.util.Scanner;

public class B06S34 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir yıl giriniz: ");
		int yil = girdi.nextInt();
		
		while(!yilGecerliMi(yil)) {
			System.out.println("Geçersiz yıl girdiniz!");
			System.out.print("Bir yıl giriniz: ");
			yil = girdi.nextInt();
		}
		
		System.out.print("Bir ay giriniz: ör: Ocak = 1, Aralık = 12: ");
		int ay = girdi.nextInt();
		while(!ayGecerliMi(ay)) {
			System.out.println("Geçersiz ay girdiniz!");
			System.out.print("Bir ay giriniz: ");
			ay = girdi.nextInt();
		}
		
		
		takviminBasliginiYazdir(ay, yil);
		
		ilkGunuYazdir(ay, yil);
		
		takvimiYazdir(ay, yil);
	}
	
	public static boolean yilGecerliMi(int yil) {
		return yil > 0;
	}
	
	public static boolean ayGecerliMi(int ay) {
		return ay > 0 && ay <= 12;
	}
	
	public static void takviminBasliginiYazdir(int ay, int yil) {
		String[] aylar = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
		
		System.out.print("\t\t" + aylar[ay-1] + "\t");
		System.out.println(yil);
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Pzr\tPzrt\tSl\tÇrş\tPrş\tCm\tCmt");
	}
	
	public static void ilkGunuYazdir(int ay, int yil) {
		int ilkGun = haftaninGunleri(1, ay, yil);
		
		String onSekmeler = "1";
		
		for (int i = 1; i < ilkGun; i++) {
			onSekmeler = "\t" + onSekmeler;
		}
		
		System.out.print(onSekmeler + "\t");
	}
	
	
	public static void takvimiYazdir(int ay, int yil) {
		
		int ayinSonGunu = ayinSonGunu(ay, yil);
		
		
		for (int i = 2; i <= ayinSonGunu; i++) {
			int gunuYazdir = haftaninGunleri(i, ay, yil);
			if(gunuYazdir == 1) {
				System.out.println();
			} 
			System.out.print(i + "\t");
		}
	}
	
	public static int haftaninGunleri(int ayinGunleri, int ay, int yil) {
		if(ay == 1 || ay == 2) {
			ay += 12;
			yil--;
		}
		int g = ayinGunleri;
		int a = ay;
		int y = yil / 100;
		int k = yil % 100;
		int haftaninGunleri = (g + (26 * (a + 1) / 10) + k + k / 4 + y / 4 + (5 * y)) % 7; 
		
		return haftaninGunleri;
	}
	
	public static boolean artikYilMi(int yil) {
		return yil % 400 == 0 || (yil % 4 == 0 && yil % 100 != 0);
	}
	
	public static int ayinSonGunu(int ay, int yil) {
		int ayinSonGunu;
		if(ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12) {
			ayinSonGunu = 31;
		} else if(ay == 2) {
			if(artikYilMi(yil)) {
				ayinSonGunu = 29; 
			} else {
				ayinSonGunu = 28;
			}
		} else {
			ayinSonGunu = 30;
		}
		
		return ayinSonGunu;
	}
}
