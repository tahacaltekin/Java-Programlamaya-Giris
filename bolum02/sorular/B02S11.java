package bolum02.sorular;

/*
 * (​Nüfus tahmini) Kullanıcıdan yıl ​sayısını ​alan ve bu yıl için nüfus tahminini gösterecek
 * şekilde Programlama Soruları 1.11 ‘i yeniden düzenleyiniz. Bu program için Bölüm 1
 * Sorulardan 11’incinin ipucunu kullanınız. Nüfus sonucu int türüne dönüştürülmelidir.
 */

import java.util.Scanner;

public class B02S11 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("Yıl sayısını giriniz: ");
		
		double yilSayisi = girdi.nextDouble();
		
		double dogumSayisi = (24 * 60 * 60 / 7.0);
		double olumSayisi = (24 * 60 * 60 / 13.0);
		double gocmenSayisi = (24 * 60 * 60 / 45.0);

		double nufusArtisi = ((dogumSayisi - olumSayisi + gocmenSayisi) * 365);
		double nufus = 312_032_486;
		double yeniNufus = (nufusArtisi * yilSayisi) + nufus;

		System.out.println("nufus Artisi: " + (int) nufusArtisi);
		System.out.println("Nüfus: " + (int) nufus);
		System.out.println((int)yilSayisi + " yıl sonraki nufus sayısı: " + (int)(yeniNufus));

		

	}

}
