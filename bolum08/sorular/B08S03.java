package bolum08.sorular;

/*
 * (​Nota göre sıralama) Madde 8.2, GradeExam.java’yı, öğrencileri  doğru cevap sayısına göre artan
 * sırada gösterecek şekilde yeniden yazınız..
 */
public class B08S03 {

	public static void main(String[] args) {
		
		char[][] cevaplar = {
			      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		
		char[] cevapAnahtari = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		int[][] dogruCevapSayaci = new int[cevaplar.length][2];
		
		for (int i = 0; i < cevaplar.length; i++) {
			
			for (int j = 0; j < cevaplar[i].length; j++) {
				if (cevaplar[i][j] == cevapAnahtari[j]) {
					dogruCevapSayaci[i][0] = i;
					dogruCevapSayaci[i][1]++;
				}
			}
		}
		
		for (int satir = 0; satir < dogruCevapSayaci.length; satir++) {
			System.out.println((dogruCevapSayaci[satir][0] + 1) + ". Öğrencinin doğru cevap sayısı: " + dogruCevapSayaci[satir][1]);
		}
	}
	
	public static void sirala(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			
			int enKucukSutun1 = m[i][1];
			int enKucukSutun0 = m[i][0];
			int enKucukIndeks = i;
			
			
			for (int j = i + 1; j < m.length; j++) {
				if (enKucukSutun1 > m[j][1]) {
					enKucukSutun1 = m[j][1];
					enKucukSutun0 = m[j][0];
					enKucukIndeks = j;
				}
			}
			
			if (enKucukIndeks != i) {
				m[enKucukIndeks][1] = m[i][1];
				m[enKucukIndeks][0] = m[i][0];
				m[i][1] = enKucukSutun1;
				m[i][0] = enKucukSutun0;
			}
		}
	}
}
