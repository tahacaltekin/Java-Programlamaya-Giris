package bolum07.sorular;

/*
 * (​Oyun: fasülye makinesi) Fasülye makinesi ya da diğer isimleri quincunx ya da Galton kutusu
 * İngiliz istatistikçisi Francis Galton (1822­1911) tarafından hazırlanmış bir deney/öğretim aletidir. Şekil
 * 7.13 ‘te gösterildiği gibi bu makine; dikey bir tahta üzerine üçgen biçiminde tek tek çakılmış çivilerden
 * oluşur.
 * 
 *  Top tahtanın üst kısmından bırakılır. Her seferinde top bir çiviye çarpar ve %50 ihtimalle sola
 *  ya da sağa doğru düşer. Toplar tahtanın altında bulunan yuvalarda birikir.
 *  Fasulye makineini simüle den bir program yazınız. Programınız kullanıcından top sayısını ve
 *  tahtanın altında kaç yuva olacağı bilgisini alsın.
 *  Her topun düşüşünü düşüş rotasını göstererek simüle ediniz. Örneğin; Şekil 7.13b de topun
 *  izlediği yol Sol, Sol, Sağ, Sağ, Sol, Sol, Sağ ve Şekil 7.13c de topun izlediği yol Sağ, Sol, Sağ, Sağ,
 *  Sol, Sağ, Sağ Yuvalarda biriken topların son görüntüsü sıklık grafiği şeklinde gösteriniz.
 */

import java.util.Scanner;

public class B07S21 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Top sayısını giriniz: ");
		int topSayisi = girdi.nextInt();
		
		System.out.println("Topların düşeceği delik sayısını giriniz: ");
		int delik = girdi.nextInt() - 1;
		
		String[] yollar = new String[delik * topSayisi];
		int[] toplar = new int[delik];
		
		int rsSayisi = 0;
		for (int i = 0; i < yollar.length; i++) {
			yollar[i] = randomYol();
			
			if(yollar[i] == "R") {
				rsSayisi++;
			}
			
			if ((i + 1) % delik == 0) {
				toplar[rsSayisi]++;
				rsSayisi = 0;
			}
		}
		
		yazdir(yollar, delik);
		
		yazdir(toplar);
	}
	
	public static String randomYol() {
		if((int)(Math.random() * 2) == 0) {
			return "L";
		} else {
			return "R";
		}
	}
	
	public static void yazdir(String[] dizi, int n) {
		System.out.println();
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(((i + 1) % n == 0) ? dizi[i] + "\n" : dizi[i]);
		}
	}
	
	public static void yazdir(int[] dizi) {
		int enBuyuk = enBuyuk(dizi);
		
		while(enBuyuk > 0) {
			System.out.println();
			for (int i = 0; i < dizi.length; i++) {
				if (dizi[i] >= enBuyuk) {
					System.out.print("O");
				} else {
					System.out.print(" ");
				}
			}
			
			enBuyuk--;
		}
		
		System.out.println();
	}
	
	public static int enBuyuk(int[] dizi) {
		int enBuyuk = dizi[0];
		
		for (int i = 1; i < dizi.length; i++) {
			if(dizi[i] > enBuyuk) {
				enBuyuk = dizi[i];
			}
		}
		
		return enBuyuk;
	}
}
