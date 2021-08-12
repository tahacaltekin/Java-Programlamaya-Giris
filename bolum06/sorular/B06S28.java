package bolum06.sorular;

/*
 * (Mersenne asal sayıları) Mersenne asal sayıları; bir asal sayının 2p ­ 1 işleminin sonucu da bir
 * asal sayı ise bu sonuç Mersenne asal sayısıdır.​  31’e kadar tüm Mersenne asal sayılarını bulan ve bir
 * program yazınız. Program çıktısı aşağıdaki tabloyu oluşturacak şekilde formatlayınız:
 * 
 * 		p 				2^p –1
 * ­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­
 * 		2 				3
 * 		3 				7
 * 		5 				31
 *		...
 */

public class B06S28 {

	public static void main(String[] args) {
		System.out.println("\np          2^p-1\n" + 
						   "--------------------");
		
		for (int p = 2; p <= 31; p++) {
			if(AsalSayiYazdirMetod.asalMi(p)) {
				System.out.printf("%-13d", p);
				System.out.println(mersenneAsalSayilari(p));
			}
		}
	}
	
	public static int mersenneAsalSayilari(int sayi) {
		return (int)Math.pow(2, sayi) - 1;
	}
}
