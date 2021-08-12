package bolum07.sorular;

/*
 * (​Madde 5.15, PrimeNumber.java yeniden düzenleyin) Madde 5.15  ​n​ ‘in asal sayı olup olmadığını  2​ ​,​ 3​,
 * 4​,​ 5​,​ 6​, ...,​ n/2​ sayıları tam böleni mi kontrol edilir. Eğer herhangi bir bölen bulunursa,​ n​ ‘in asal sayı
 * olmadığına karar verilir. Bunun daha verimli yöntemi şudur: √n ‘e eşit veya daha küçük olan sayılar
 * içinden tam böleni var mıdır diye kontrol edilir. Eğer tam böleni yoksa,​ n​ asal sayıdır. Bu yaklaşımı
 * kullanarak Madde 5.15  düzenleyerek ilk 50 asal sayıyı gösteriniz.​ Sonra n​ ‘in tam böleni olup olmadığını
 * kontrol etmek için bulduğunuz asal sayıları bir dizi içerisinde tutmanız gerekmektedir.
 */

public class B07S06 {

	public static void main(String[] args) {
		int[] asalSayilar = new int[50];
		int n = 2;
		int sayac = 0;
		
		while (sayac < 50) {
			if(asalMi(n, asalSayilar)) {
				asalSayilar[sayac] = n;
				sayac++;
			}
			n++;
		}
		
		for (int i = 0; i < asalSayilar.length; i++) {
			System.out.print(asalSayilar[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
	
	public static boolean asalMi(int adaySayi, int[] asalSayi) {
		for (int i = 0; i < asalSayi.length; i++) {
			if(asalSayi[i] > 1 && asalSayi[i] <= Math.round(Math.sqrt(adaySayi))) {
				if(adaySayi % asalSayi[i] == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
