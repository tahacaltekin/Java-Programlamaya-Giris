package bolum07.sorular;

/*
 * ​ (​Simülasyon: kupon toplayıcısı problemi)  Kupon toplayıcısı, birçok pratik uygulaması olan bir
 * istatistik problemdir. Bir dizi nesne arasından arka arkaya nesnelerin çekilmesiyle tüm nesnelerin en az
 * bir kere çekilmiş olması için gereken sayıyı bulmayı amaçlar. Bu problemin bir çeşidi de 52 karttan
 * oluşan karıştırılmış bir iskambil destesinden  ardı ardına kağıt çekip her bir seriden en az bir kartı
 * bulana kadar gerekecek çekme sayısını bulmaktır. Yeni bir kart çekmeden çektiğiniz kartı destenin en
 * altına koyduğunuzu varsayalım. Her bir seriden dört kart seçmiş olmak için gerekecek çekme sayısını
 * simüle eden bir program yazınız. Çekilen dört kartı ve çekme sayısını gösteriniz. (Aynı kartın iki kere
 * çekilme olasılığı bulunmaktadır)  
 */

public class B07S24 {

	public static void main(String[] args) {
		int[] deste = new int[52];
		int[] secimler = new int[4];
		
		for (int i = 0; i < deste.length; i++) {
			deste[i] = i;
		}
		
		kartlariKaristir(deste);
		
		int sayac = 0;
		
		do {
			kartSec(deste, secimler);
			sayac++;
		} while (!herDesendenBiri(secimler));
		
		yazdir(secimler);
		
		System.out.println("4 deseninde gelmesi için çekilen en az kart sayısı: " + sayac);
	}
	
	public static void kartlariKaristir(int[] deste) {
		for (int i = 0; i < deste.length; i++) {
			
			int indeks = kartSec(deste);
			int gecici = deste[i];
			deste[i] = deste[indeks];
			deste[indeks] = gecici;
		}
	}
	
	public static void kartSec(int[] deste, int[] secimler) {
		for (int i = 0; i < secimler.length; i++) {
			secimler[i] = deste[kartSec(deste)];
		}
	}
	
	public static int kartSec(int[] deste) {
		return (int)(Math.random() * deste.length);
	}
	
	public static boolean herDesendenBiri(int[] secimler) {
		for (int i = 0; i < secimler.length; i++) {
			for (int j = 0; j < secimler.length; j++) {
				if(i != j && (secimler[i] / 13 == secimler[j] / 13)) 
					return false;
			}
		}
		return true;
	}
	
	public static void yazdir(int[] secimler) {
		String[] desenler = {"Karo", "Maça", "Sinek", "Kupa"};
		String[] kagitlar = {"As", "2", "3", "4", "5", "6", "7", "8", "9",
								"10", "Vale", "Kız", "Papaz"};

		for (int i = 0; i < secimler.length; i++) {
			System.out.println(kagitlar[secimler[i] % 13] + " " + desenler[secimler[i] / 13]);
		}
	}
}
