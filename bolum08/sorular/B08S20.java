package bolum08.sorular;

/*
 * (​Oyun: dörtleme(connect four))Dörtleme, iki kişi ile oynanır. Oyuncular birbirinden farklı
 * renklerde diskleri 7 sütun ve 6 sıradan oluşan bir boşluklu tahta üzerinde, aşağıda gösterildiği gibi
 * yukarıdan bırakırlar.
 * 
 * Oyunun amacı aynı renkte olan 4 diski satır, sütun ya da diyagonal olarak rakibinden önce yan yana
 * getirmektir. Program sırasıyla iki oyuncudan; biri sarı(S), diğeri kırmızı(K) olmak üzere bir disk
 * koymalarını isteyecek. Aşağıdaki görselde kırmızı disk daha koyu, sarı disk daha açık renkte
 * gösterilmiştir. Oyuncu oynadıktan sonra program tablonun durumunu gösterecek ve oyunun durumuna
 * karar verecek. (Kazandınız, berabere, devam edin)
 */
import java.util.Scanner;

public class B08S20 {

	public static void main(String[] args) {
		oyunuBaslat();
	}
	
	public static void oyunuBaslat() {
		char[][] tahta = tahtayiCiz(6, 7);
		
		
		char oyuncu = 'S';
		
		while(oynayan(tahta)) {
			if (oyuncu == 'S') {
				oyuncu = 'K';
			} else {
				oyuncu = 'S';
			}
			
			tahtayiYazdir(tahta);
			siraKimde(tahta, oyuncu);
		}
		
		tahtayiYazdir(tahta);
		if (ardisikDortluMu(tahta)) {
			System.out.println("Kazanan oyuncu " + oyuncuSirasi(oyuncu));
		} else {
			System.out.println("Oyun berabere bitti!");
		}
	}
	
	public static void siraKimde(char[][] tahta, char oyuncu) {
		int sutun = 0;
		boolean gecerliOyun = false;
		while(!gecerliOyun) {
			sutun = sutunuAl(oyuncu);
			
			if(tahta[0][sutun] == ' ') {
				gecerliOyun = true;
			} else {
				System.out.println("Sutun tamamen dolu!");
			}
		}
		
		for (int i = tahta.length - 1; i >= 0; i--) {
			if (tahta[i][sutun] == ' ') {
				tahta[i][sutun] = oyuncu;
				break;
			}
		}
	}
	
	public static int sutunuAl(char oyuncu) {
		Scanner girdi = new Scanner(System.in);
		
		String renk = oyuncuSirasi(oyuncu);
		
		System.out.print("Sıra " + renk + " oyuncuda diski 0 - 6 arası bir sutuna atın: ");
		return girdi.nextInt();
	}
	
	public static String oyuncuSirasi(char oyuncu) {
		return oyuncu == 'S' ? "Sarı" : "Kırmızı";
	}
	
	public static boolean oynayan(char[][] tahta) {
		if (ardisikDortluMu(tahta)) {
			return false;
		} 
		
		for (int i = 0; i < tahta[0].length; i++) {
			if (tahta[0][1] == ' ') {
				return true;
			}
		}
		
		return false;
	}
	
	public static void tahtayiYazdir(char[][] tahta) {
		for (char[] tahta2 : tahta) {
			System.out.print("|");
			for (char tahta3 : tahta2) {
				System.out.print(tahta3 + "|");
			}
			
			System.out.println();
		}
		
		System.out.println("------------------");
	}
	
	public static char[][] tahtayiCiz(int satirlar, int sutunlar) {
		char[][] tahta = new char[satirlar][sutunlar];
		for (int i = 0; i < satirlar; i++) {
			for (int j = 0; j < sutunlar; j++) {
				tahta[i][j] = ' ';
			}
		}
		
		return tahta;
	}
	
	public static boolean ardisikDortluMu(char[][] degerler) {
		boolean ardisikDortluMu;
		
		//dikey kontrol
		for (int i = 0; i < degerler.length; i++) {
			for (int j = 0; j < degerler[i].length - 3; j++) {
				if (degerler[i][j] == ' ') 
					continue;
				ardisikDortluMu = true;
				
				for (int k = 1; k < 4; k++) {
					ardisikDortluMu &= degerler[i][j] == degerler[i][j + k];
				}
				
				if (ardisikDortluMu) {
					return true;
				}
			}
		}
		
		// yatay kontrol
		
		for (int i = 0; i < degerler.length - 3; i++) {
			for (int j = 0; j < degerler[i].length; j++) {
				if (degerler[i][j] == ' ') 
					continue;
				ardisikDortluMu = true;
				
				for (int k = 1; k < 4; k++) {
					ardisikDortluMu &= degerler[i][j] == degerler[i + k][j];
				}
				if (ardisikDortluMu) 
					return true;
			}
		}
		
		// Çapraz kontrol
		for (int i = 0; i < degerler.length - 3; i++) {
			for (int j = 0; j < degerler[i].length - 3; j++) {
				if (degerler[i][j] == ' ') 
					continue;
				ardisikDortluMu = true;
				
				for (int k = 1; k < 4; k++) {
					ardisikDortluMu &= degerler[i][j] == degerler[i + k][j + k];
				}
				if (ardisikDortluMu) 
					return true;
			}
		}
		
		for (int i = 4; i < degerler.length; i++) {
			for (int j = 0; j < degerler[i].length - 3; j++) {
				if (degerler[i][j] == ' ') 
					continue;
				ardisikDortluMu = true;
				
				for (int k = 1; k < 4; k++) {
					ardisikDortluMu &= degerler[i][j] == degerler[i - k][j + k];
				}
				
				if (ardisikDortluMu) {
					return true;
				}
			}
		}
		
		return false;
	}
}
