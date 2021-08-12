package bolum08.sorular;

/*
 * (​Haftalık çalışma saati hesaplama) Her bir çalışanın haftalık çalışma saatlerinin iki boyutlu bir
 * dizide tutulduğunu varsayalım. Çalışanın yedi günlük çalışma saatleri bir satırın yedi ayrı sütununda
 * saklansın. Örneğin, dizi sekiz çalışanın haftalık çalışma saatlerini saklar. Çalışanı ve toplam
 * çalışma saatini azalan şekilde sıralanmış olarak gösteren bir program yazınız
 */

public class B08S04 {

	public static void main(String[] args) {
		
		int[][] haftalikSaatler = { 
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 5},
				{6, 3, 5, 9, 2, 7, 9}};
		
		
		int[][] toplamSaatler = satirlariTopla(haftalikSaatler);
		
		sirala(toplamSaatler);
		
		yazdir(toplamSaatler);
	}
	
	public static int[][] satirlariTopla(int[][] m) {
		
		int[][] toplamlar = new int[m.length][2];
		
		for (int satir = 0; satir < m.length; satir++) {
			toplamlar[satir][0] = satir;
			toplamlar[satir][1] = 0;
			for (int sutun = 0; sutun < m[satir].length; sutun++) {
				toplamlar[satir][1] += m[satir][sutun];
			}
		}
		
		return toplamlar;
	}
	
	public static void sirala(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			
			int enBuyukSutun0 = m[i][0];
			int enBuyukSutun1 = m[i][1];
			int enBuyukIndeks = i;
			
			
			for (int j = i + 1; j < m.length; j++) {
				if (enBuyukSutun1 < m[j][1]) {
					enBuyukSutun1 = m[j][1];
					enBuyukSutun0 = m[j][0];
					enBuyukIndeks = j;
				}
			}
			
			if (i != enBuyukIndeks) {
				m[enBuyukIndeks][1] = m[i][1];
				m[enBuyukIndeks][0] = m[i][0];
				m[i][1] = enBuyukSutun1;
				m[i][0] = enBuyukSutun0;
			}
		}
	}
	
	public static void yazdir(int[][] m) {
		System.out.println("Çalışan   Haftalık Çalışma Saati");
		System.out.println("----------------------------------");
		for (int satir = 0; satir < m.length; satir++) {
			System.out.printf("%4d%16d\n", m[satir][0], m[satir][1]);
		}
	}
}
