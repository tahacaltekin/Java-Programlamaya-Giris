package bolum01.sorular;

/*
 *  ​(​Alan ve çevre hesaplama) Aşağıdaki formülü kullanarak bir dikdörtgenin alanını hesaplayınız
 * genişliği 4.5 , yüksekliği 7.9 olarak alınız:
 * 
 * alan = ge​ nişlik * ​yükseklik
 * 
 */

public class B01S09 {
	public static void main(String[] args) {
		double genislik;
		double yukseklik;
		double alan;
		
		genislik = 4.5;
		yukseklik = 7.9;
		
		alan = genislik * yukseklik;
		
		System.out.println("yuksekligi " + yukseklik + " ve genisliği " + genislik + " olan dikdörtgenin alanı " + alan);
	}

}
