package bolum08.sorular;

/*
 * (​Oyun: Tic­tac­toe­) tic­tac­toe oyununda , iki oyuncu sırasıyla 3*3 bir tabloda boş olan bir kareyi
 * X ya da O (hangi taşa)taşını koyar. Eğer bir oyuncu aynı satır, aynı sütün ya da diyagonale üç taş
 * koyduysa oyun biter ve bu oyuncu kazanır. Tabloda ki tüm alanlar doldurulursa ve bir oyuncu kazanmış
 * durumda değilse oyun sonlanır ve bu oyun berabere biter. Tic­tac­toe oynatan bir program yazınız.
 * Program iki oyuncudan da X taşını ve O taşını tabloda bir yere koymasını istesin. Oyuncu oynadıktan
 * sonra program tablonun durumunu göstersin ve oyunun durumuna karar versin. (Kazandınız, berabere,
 * devam edin)
 */

import java.util.Scanner;

public class B08S09 {

	public static void main(String[] args) {
		
		String[][] tahta = tahtaOlustur();
		
		String[] jetonlar = {" X "," O "};
		
		int sonuc;
		
		do {
			 yazdir(tahta);
			 
			 int[] hucre = hucreOlustur(tahta, jetonlar[0]);
			 
			 jetonYerleri(tahta, hucre, jetonlar[0]);
			 
			 sonuc = oyunDurumu(tahta, jetonlar[0]);
			 
			 if (sonuc == 2) {
				 degistir(jetonlar);
			 }
		} while (sonuc == 2);
		
		yazdir(tahta);
		
		if (sonuc == 0) {
			System.out.println(jetonlar[0] + " oyuncu kazandı");
		} else {
			System.out.println("Berabere");
		}
	}
	
	public static String[][] tahtaOlustur() {
		String[][] m = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m[i][j] = "   ";
			}
		}
		
		return m;
	}
	
	public static void yazdir(String[][] m) {
		System.out.println("\n-------------");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("|" + m[i][j]);
			}
			
			System.out.println("|\n-------------");
		}
	}
	
	public static int[] hucreOlustur(String[][] m, String t) {
		Scanner girdi = new Scanner(System.in);
		
		int[] hucre = new int[2];
		
		do {
			System.out.print(t + " oyuncusu için satır giriniz(0, 1 ya da 2): ");
			hucre[0] = girdi.nextInt();
			System.out.print(t + " oyuncusu için sutun giriniz(0, 1 ya da 2): ");
			hucre[1] = girdi.nextInt();
		} while(!gecerliHucreMi(m, hucre));
		
		return hucre;
	}
	
	public static boolean gecerliHucreMi(String[][] m, int[] hucre) {
		for (int i = 0; i < hucre.length; i++) {
			if (hucre[i] < 0 || hucre[i] >= 3) {
				System.out.println("Hatalı girdiniz: ");
				return false;
			}
		}
		
		if (m[hucre[0]][hucre[1]] != "   ") {
			System.out.println("\nSatir " + hucre[0] + " sutun " + hucre[1] + " dolu");
			return false;
		}
		return true;
	}
	
	public static void jetonYerleri(String[][] m, int[] e, String t) {
		m[e[0]][e[1]] = t;
	}
	
	public static int oyunDurumu(String[][] m, String e) {
		if (kazandiMi(m, e)) {
			return 0;
		} else if (berabereMi(m)) {
			return 1;
		} else {
			return 2;
		}
	}
	
	public static boolean kazandiMi(String[][] m, String t) {
		return yatayMiKazandi(m, t) || dikeyMiKazandi(m, t) || caprazMiKazandi(m, t);
	}
	
	public static boolean yatayMiKazandi(String[][] m, String t) {
		for (int i = 0; i < m.length; i++) {
			int sayac = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == t) {
					sayac++;
				} 
				if (sayac == 3) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean dikeyMiKazandi(String[][] m, String t) {
		for (int i = 0; i < m.length; i++) {
			int sayac = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == t) {
					sayac++;
				} 
				if (sayac == 3) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean caprazMiKazandi(String[][] m, String t) {
		int sayac = 0;
		for (int i = 0; i < m.length; i++) {
			if(m[i][i] == t) {
				sayac++;
				
			if(sayac == 3) {
				return true;
				}
			}
		}
		
		sayac = 0;
		for (int i = 0, j = m[i].length - 1; j >= 0; j--, i++) {
			if (m[i][j] == t) {
				sayac++;
				
				if(sayac == 3) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean berabereMi(String[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == "   ") {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void degistir(String[] p) {
		String gecici = p[0];
		p[0] = p[1];
		p[1] = gecici;
	}
}
