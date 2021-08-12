package bolum05.sorular;

/*
 * (Finans uygulaması: Satış miktarını bulma) Bir mağazada satış elemanı olarak çalışmaya başladığınızı
 * varsayalım. Kazancınız sabit maaş ve satış komisyonundan oluşmaktadır. Sabit maaşınız 5 000 $. Aşağıdaki tablo
 * komisyon miktarlarını göstermektedir.
 * 
 * Sales Amount                   Commission Rate
 * ------------------------------------------------
 * $0.01–$5,000                     8 percent
 * $5,000.01–$10,000               10 percent
 * $10,000.01 and above            12 percent
 * 
 * Bu oranların kademeli olarak değiştiğine dikkat ediniz. Oranlar, ilk 5 000$ için oran %8, bir sonraki 5 000$ için
 * %10 ve bunun üstündekiler için %12’dir. Eğer satış miktarı 25 000$ ise; komisyon 5,000 * 8% + 5,000 * 10% +
 * 15,000 * 12% = 2,700 olur.
 * 
 * Hedefiniz yılda 30 000$ kazanmak. 30 000$ kazanmak için yapmanız gereken minimum satış miktarını hesaplayan
 * bir program yazınız
 */

public class B05S39 {

	public static void main(String[] args) {
		final double HEDEF = 30000;
		double satisMiktari = 0;
		double komisyon;
		double bakiye;
		
		do {
			bakiye = komisyon = 0;
			satisMiktari += 0.01;
			
			if (satisMiktari > 10000) 
				komisyon += (bakiye = satisMiktari - 10000) * 0.12;
				
			if (satisMiktari > 5000)
				komisyon += (bakiye -= bakiye - 5000) * 0.10;
			
			if (satisMiktari > 0)
				komisyon += bakiye * 0.08;
		} while (komisyon < HEDEF);
		
		System.out.printf("$30.000 kazanmak için yapılması gereken minimum satış: $%.0f\n ", satisMiktari);
	}
}
