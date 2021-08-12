package bolum04.sorular;

/*
 * (Coğrafya: alan tahmini) www.gps­data­team.com/map/ Atlanta, Georgia; Orlando, Florida;
 * Savannah, Georgia; ve Charlotte, North Carolina’nın GPS koordinatlarını bulunuz ve bu dört şehrin
 * yaklaşık olarak kapladığı alanı hesaplayınız. (İpucu: İki şehir arasındaki mesafeyi hesaplamak için
 * Programlama Soruları 4.2 ‘deki formülü kullanabilirsiniz. Oluşan çokgeni iki üçgene ayırınız ve
 * Programlama Soruları 2.19’daki formülü kullanarak üçgenlerin alanlarını hesaplayınız. 
 */

public class B04S03 {

	public static void main(String[] args) {

		final double RADIUS = 6371.01;

		double atlantaEnlem = 33.7629;
		double atlantaBoylam = -84.4227;

		double orlandoEnlem = 28.4159;
		double orlandoBoylam = -81.2988;

		double savannahEnlem = 32.002;
		double savannahBoylam = -81.1536;

		double charlotteEnlem = 35.2062;
		double charlotteBoylam = -80.2326;

		double x1 = atlantaEnlem;
		double y1 = atlantaBoylam;
		double x2 = orlandoEnlem;
		double y2 = orlandoBoylam;
		double x3 = savannahEnlem;
		double y3 = savannahBoylam;
		double x4 = charlotteEnlem;
		double y4 = charlotteBoylam;

		double kenar1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double kenar2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double kenar3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		
		double s = (kenar1 + kenar2 + kenar3) / 2;
		
		double alan = Math.sqrt(s * (s - kenar1) * (s - kenar2 * (s - kenar3)));
	}
}
