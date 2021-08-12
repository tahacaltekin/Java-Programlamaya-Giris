package bolum01.sorular;


/*
 * (​Nüfus tahmini) ABD’nin  Census Bureau projesinin temel varsayımları aşağıda verilmiştir:
 * ​Her 7 saniyede bir doğum
 * ​Her 13 saniyede bir ölüm
 * Her 45 saniyede yeni bir göçmen gelmektedir
 * 
 * Gelecek beş yıl için, her bir yılın nüfus tahminlerini gösterecek bir program yazınız. Şu an nüfusun
 * 312,032,486 olduğunu ve bir yılın 365 gün olduğunu varsayalım.
 * 
 * ​İpucu: Java’da, iki tam sayının bölümü, yine bir tamsayıdır. Ondalık kısım atılır. Örneğin; ​5 ​/ ​4 ​değeri ​1
 * (​1.25​ değil) ve ​10 ​/ ​4 ​değeri ​2 ​(​2.5​ değil) olur. Eğer noktadan sonraki kısım kaybedilmek istenmiyorsa
 * sayılardan birinin noktalı olması gerekir. Örneğin; ​5.0 ​/ ​4 ​değeri ​1.25 ​ve ​10 ​/ ​4.0 ​değeri ​2.5​.
 * 
 */

public class B01S11 {
	public static void main(String[] args) {
		double dogumSayisi = (24 * 60 * 60 / 7.0);
		double olumSayisi = (24 * 60 * 60 / 13.0);
		double gocmenSayisi = (24 * 60 * 60 / 45.0);

		double nufusArtisi = ((dogumSayisi - olumSayisi + gocmenSayisi) * 365);
		double nufus = 312_032_486;
		double yeniNufus;

		System.out.println("nufus Artisi: " + (int) nufusArtisi);
		System.out.println("Nüfus: " + (int) nufus);

		yeniNufus = nufus + nufusArtisi;
		System.out.println("1. yıldaki nüfus artışı: " + (int) yeniNufus);

		yeniNufus = yeniNufus + nufusArtisi;
		System.out.println("2. yıldaki nüfus artışı: " + (int) yeniNufus);

		yeniNufus = yeniNufus + nufusArtisi;
		System.out.println("3. yıldaki nüfus artışı: " + (int) yeniNufus);

		yeniNufus = yeniNufus + nufusArtisi;
		System.out.println("4. yıldaki nüfus artışı: " + (int) yeniNufus);

		yeniNufus = yeniNufus + nufusArtisi;
		System.out.println("5. yıldaki nüfus artışı: " + (int) yeniNufus);

	}

}
