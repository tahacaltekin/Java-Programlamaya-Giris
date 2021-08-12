package bolum08.sorular;

/*
 * (​Satırları karıştır) İki boyutlu bir dizide satırları karıştıran  aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * public static void ​shuffle(​int​[][] m)
 * 
 * Aşağıdaki matrisi karıştıracak bir test programı yazınız:
 * 
 * int​[][] m = {{​1​, ​2​}, {​3​, ​4​}, {​5​, ​6​}, {​7​, ​8​}, {​9​, ​10​}};
 */

public class B08S18 {

	public static void main(String[] args) {
		
		int[][] dizi = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		
		karistir(dizi);
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print(dizi[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	
	public static void karistir(int[][] m) {
		
		int[] geciciDizi = new int[2];
		
		for (int i = 0; i < m.length; i++) {
			
			int d = (int)(Math.random() * m.length);
			
			
			geciciDizi[0] = m[i][0];
			geciciDizi[1] = m[i][1];
			m[i][0] = m[d][0];
			m[i][1] = m[d][1];
			m[d][0] = geciciDizi[0];
			m[d][1] = geciciDizi[1];
		}
	}
}
