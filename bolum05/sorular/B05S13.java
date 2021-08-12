package bolum05.sorular;

/*
 * (n​³  < 12,000 olduğu durumda en büyük ’i bulma) n​³
 * ‘ün 12,000’den küçük olduğu en büyük tam sayı n​ ‘i
 * while ​döngüsü kullanarak bulunuz.
 */

public class B05S13 {

	public static void main(String[] args) {
		int n = 0;
		
		while(Math.pow(n + 1, 3) < 12000) {
			n++;
		}
		System.out.println("Küpü 12000'den küçük olan en büyük n sayısı: " + n);
	}
}
