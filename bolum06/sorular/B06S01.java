package bolum06.sorular;

/*
 *  ​(​Matematik: beşgensel s​ ayılar) Beşgensel sayılar n = 1,2, 3 .... için n(3n–1)/2 şeklinde tanımlanır.
 * Buna bağlı olarak ilk birkaç beşgensel sayı 1, 5, 12, 22, ... ‘dir. Aşağıdaki şeklide bildirilen ve beşgensel
 * sayı üreten bir metot yazınız
 * 
 * public static int ​getPentagonalNumber(​int ​n)
 * 
 * Bu metodu kullanarak ilk 100 beşgensel sayıyı her satırda 10 sayı olacak şekilde gösteren bir test
 * programı yazınız.
 */

public class B06S01 {

	public static void main(String[] args) {
		final int BESGEN_SAYISI = 100;
		final int SATIR_SAYISI = 10;
		
		System.out.println("İlk 100 beşgenlerin sayısı: ");
		for (int i = 1; i < BESGEN_SAYISI; i++) {
			
			if(i % SATIR_SAYISI == 0) {
				System.out.printf("%7d\n", besgenSayisiniGetir(i));
			} else {
				System.out.printf("%7d", besgenSayisiniGetir(i));
			}
		}
	}
	
	public static int besgenSayisiniGetir(int n) {
		return (n * (3 * n - 1)) / 2;
	}
}
