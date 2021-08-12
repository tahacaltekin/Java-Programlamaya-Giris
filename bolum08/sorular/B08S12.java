package bolum08.sorular;

/*
 *  ​(​Finans uygulaması: vergi hesaplama) Madde 3.5, ComputeTax.java,’yı dizi kullanarak yeniden
 *  yazınız. Her bir bildirim türü için altı farklı vergi oranı bulunur. Her oran vergilendirilebilir gelirin
 *  belirli miktarına uygulanır. Örneğin; vergilendirilebilir gelir 400 000$ ve mükellef bekar olsun ; $8,350
 *  için vergi oranı 10%, (33,950 ­ 8,350) için vergi oranı 15%, (82,250 ­ 33,950) için vergi oranı 25%,
 *  (171,550 ­ 82,550) için vergi oranı 28%, (372,550 ­ 82,250) için vergi oranı 33% ve (400,000 ­ 372,950) için
 *  vergi oranı 36%. Her bildirim türü için vergi oranları aynıdır ve bu oranlar aşağıdaki dizide verilmiştir.
 *  
 *  double​[] rates = {​0.10​, ​0.15​, ​0.25​, ​0.28​, ​0.33​, ​0.35​};
 *  
 *  Her bildirim türü için vergi oranıan göre beyan edilen miktarlar aşağıdaki iki boyutlu dizide verilmiştir.
 *  
 *  int​[][] brackets = {
 *  {​8350​, ​33950​, ​82250​, ​171550​, ​372950​}, ​// Bekar
 *  {​16700​, ​67900​, ​137050​, ​20885​, ​372950​}, ​// Eşler birlikte
 *  // ­ya da 2 yıldır dul
 *  {​8350​, ​33950​, ​68525​, ​104425​, ​186475​}, ​// Eşler ayrı ayrı
 *  {​11950​, ​45500​, ​117450​, ​190200​, ​372950​} ​// Aile reisi
 *  };
 *  
 *  Bekar bir mükellefin vergilendirilebilir gelirinin 400 000$ olduğunu varsayalım. Ödenecek vergi
 *  aşağıdaki şekilde hesaplanabilir.
 *  
 *  tax = brackets[​0​][​0​] * rates[​0​] +
 *  (brackets[​0​][​1​] – brackets[​0​][​0​]) * rates[​1​] +
 *  (brackets[​0​][​2​] – brackets[​0​][​1​]) * rates[​2​] +
 *  (brackets[​0​][​3​] – brackets[​0​][​2​]) * rates[​3​] +
 *  (brackets[​0​][​4​] – brackets[​0​][​3​]) * rates[​4​] +
 *  (​400000 ​– brackets[​0​][​4​]) * rates[​5​]
 */

import java.util.Scanner;

public class B08S12 {
	
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		double[] oranlar = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		
		int[][] vergiUcretleri = {
				{8350, 33950, 82250, 171550, 372950}, //bekar
				{16700, 67900, 137050, 20885, 372950}, //Evli ve ya 2 yıldır dul
				{8350, 33950, 68525, 104425, 186475}, //Evli eşler ayrı
				{11950, 45500, 117450, 190200, 372950} //Aile reisi
				};
		
		
		System.out.println("(Bekar için 0, Evli ya da 2 yıllık dul için 1" + 
				"Evli ama eşler ayrı ise 2, Aile reisi ise 3'e basınız: ");
		
		int durum = durumuGetir();
		
		System.out.println("Vergilendirelebilir gelirinizi giriniz: ");
		double gelir = girdi.nextDouble();
		
		System.out.printf("Vergi: $%6.2f\n", vergiHesapla(vergiUcretleri, oranlar, durum, gelir));
	}
	
	public static double vergiHesapla(int[][] vergiUcretleri, double[] oranlar, int durum, double gelir) {
		double vergi = 0;
		double vergilenenGelir = 0;
		for (int i = 4; i >= 0; i--) {
			if(gelir > vergiUcretleri[durum][i]) {
				vergi += (vergilenenGelir = gelir - vergiUcretleri[durum][i]) * oranlar[i + 1];
				gelir -= vergilenenGelir;
			}
		}
		
		return vergi += vergiUcretleri[durum][0] * oranlar[0];
	}

	
	public static int durumuGetir() {
		Scanner girdi = new Scanner(System.in);
		
		int durum;
		
		do {
			durum = girdi.nextInt();
			if (durum < 0 || durum > 3) {
				System.out.println("Hatalı bir değer girdiniz!");
			} 
		} while (durum < 0 || durum > 3);
		return durum;
	}
}
