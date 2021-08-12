package bolum08.sorular;


/*
 *  ​(​İki boyutlu dizinin sıralanması) Aşağıdkai bildirime sahip iki boyutlu diziyi sıralayan bir metot yazınız:
 *  
 *  public static void ​sort(​int ​m[][])
 *  
 *  Metot sıralamayı ilk olarak satırlar arasında, ardından sütunlar arasında yapacaktır.
 *  Örneğin; aşağıdaki dizi;
 *  
 *  {{​4​, ​2​},{​1​, ​7​},{​4​, ​5​},{​1​, ​2​},{​1​, ​1​},{​4​, ​1​}}
 *  
 * şeklinde sıralanacaktır 
 *  
 *  {{​1​, ​1​},{​1​, ​2​},{​1​, ​7​},{​4​, ​1​},{​4​, ​2​},{​4​, ​5​}}.
 */
public class B08S16 {

	public static void main(String[] args) {
		
		int[][] dizi = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
		
		
		sirala(dizi);
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print(dizi[i][j] + " ");
			}
		}
	}
	
	public static void sirala(int[][] m) {
		int[] enKucuk = new int[2];
		for (int satir = 0; satir < m.length - 1; satir++) {
			
			enKucuk[0] = m[satir][0];
			enKucuk[1] = m[satir][1];
			
			int indeks = satir;
			for (int i = satir + 1; i < m.length; i++) {
				if (m[i][0] <= enKucuk[0] && (m[i][0] < enKucuk[1] ||
						 m[i][1] < enKucuk[0] || m[i][1] < enKucuk[1])) { 
								enKucuk[0] = m[i][0];
								enKucuk[1] = m[i][1];
								indeks = i;
			}
		}
			
			if (indeks != satir) {
				m[indeks][0] = m[satir][0];
				m[indeks][1] = m[satir][1];
				m[satir][0] = enKucuk[0];
				m[satir][1] = enKucuk[1];
			}
		}
	}
}

