package bolum05.sorular;

/*
 * (n​²  > 12,000 olduğu durumda en küçük ’i bulma) n​²
 * ‘nin  12,000’den büyük olduğu en küçük tam sayısı n​’i
 * while ​döngüsü kullanarak bulunuz.
 */
public class B05S12 {

	public static void main(String[] args) {
		int n = 0;
		
		while (Math.pow(n, 2) <= 12000) {
			
			while (Math.pow(n, 2) < 12000) {
				n++;
			}
		}
		
		System.out.println("Karesi 12000 den büyük olan en küçük n sayısı: " + n);
		
	}
}
