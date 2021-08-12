package bolum07.sorular;

/*
 * ​ (​Rakamların sayısı) 0 ile 9 arasında 100 adet rastgele rakam üreten ve bu rakamların her birinin
 * kaç defa tekrarlandığını gösteren bir program yazınız. (​İpucu: On tane tamsayıdan oluşan ve adı​ counts​,
 * olan bir dizi oluşturun ve 0, 1, ..., 9 rakamlarının tekrar sayılarını bu dizide tutunuz.)
 */

public class B07S07 {

	public static void main(String[] args) {
		int[] sayac = new int[10];
		
		for (int i = 0; i <= 100; i++) {
			sayac[(int)(Math.random() * 10)]++;
		}
		
		System.out.println("0 ile 9 arasındaki her sayı için sayac: ");
		for (int i = 0; i < sayac.length; i++) {
			System.out.println(i + " tekrarlama sayısı: " + sayac[i]);
		}
	}
}
