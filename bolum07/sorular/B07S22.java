package bolum07.sorular;

/*
 *  (​Oyun: Sekiz Vezir) Klasik sekiz vezir oyunu bir satranç tahtası üzerinde birbirini tehdit
 * etmeyecek şekilde 8 tane vezirin yerleştirilmesidir.  (Yani iki vezir yatay, dikey ya da çapraz doğrultuda
 * bulunmamalıdır). Birçok olası çözüm bulunmaktadır. Bu çözümlerden birini gösteren bir program
 * yazınız. Aşağıda örnek çözümlerden birini görebilirsiniz:
 * 
 * |Q| | | | | | | |
 * | | | | |Q| | | |
 * | | | | | | | |Q|
 * | | | | | |Q| | |
 * | | |Q| | | | | |
 * | | | | | | |Q| |
 * | |Q| | | | | | |
 * | | | |Q| | | | |
 * 
 */

public class B07S22 {
	public static void main(String[] args) {
		char[] tahta;
		
		do {
			tahta = yeniTahta();
			
			vezirlerinYerleri(tahta);
			
		} while(saldiriMi(tahta));
		
		yazdir(tahta);
	}
	
	public static void vezirlerinYerleri(char[] tahta) {
		int konum;
		for (int i = 0; i < 8; i++) {
			do {
				konum = vezirlerinYerleri();
			} while (mesgulMu(tahta[konum]));
			tahta[konum] = 'Q';
		}
	}
	
	public static int vezirlerinYerleri() {
		return (int)(Math.random() * 64);
	}
	
	public static boolean saldiriMi(char[] tahta) {
		return ayniSatirdaMi(tahta) || ayniSutundaMi(tahta) || caprazMi(tahta);
	}
	
	public static boolean ayniSatirdaMi(char[] tahta) {
		int[] satir = new int[8];
		for (int i = 0; i < tahta.length; i++) {
			if(mesgulMu(tahta[i])) {
				satir[satirBul(i)]++;
			}
			if(satir[satirBul(i)] > 1) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean ayniSutundaMi(char[] tahta) {
		int[] sutun = new int[8];
		for (int i = 0; i < tahta.length; i++) {
			if(mesgulMu(tahta[i])) {
				sutun[sutunBul(i)]++;
			}
			 if(sutun[sutunBul(i)] > 1) {
				 return true;
			 }
		}
		return false;
	}
	
	public static boolean caprazMi(char[] tahta) {
		for (int i = 0; i < tahta.length; i++) {
			if(mesgulMu(tahta[i])) {
				for (int j = 0; j < tahta.length; j++) {
					if(mesgulMu(tahta[j]) && Math.abs(sutunBul(j) - sutunBul(i)) == Math.abs(satirBul(j) - satirBul(i)) && j != i) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean mesgulMu(char x) {
		return x == 'Q';
	}
	
	public static char[] yeniTahta() {
		char[] tahta = new char[64];
		for (int i = 0; i < tahta.length; i++) {
			tahta[i] = ' ';
		}
		return tahta;
	}
	
	public static void yazdir(char[] tahta) {
		for (int j = 0; j < tahta.length; j++) {
			System.out.print("|" + ((satirBul(j + 1) == 0) ? tahta[j] + "|\n" : tahta[j]));
		}
	}
	
	public static int satirBul(int indeks) {
		return indeks % 8;
	}
	
	public static int sutunBul(int indeks) {
		return indeks / 8;
	}
}
