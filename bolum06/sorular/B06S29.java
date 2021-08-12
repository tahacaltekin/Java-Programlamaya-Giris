package bolum06.sorular;

/*
 *  ​((İkili asal sayılar) İkili asal sayılar 2 dışında asal sayı çiftlerini ifade eder.  Örneğin, 3 ve 5 , 5 ve
 * 7 , 11 ve 13 ikili asal sayılardır.  1000’den küçük olan tüm ikili asal sayıları bulan bir program yazınız.
 * Programın sonucunu aşağıdaki gibi gösteriniz:
 * 
 * (3, 5)
 * (5, 7)
 * ...
 */

public class B06S29 {

	public static void main(String[] args) {
		
		System.out.println();
		
		for (int i = 2; i < 1000; i++) {
			if(ikiliAsalMi(i)) {
				System.out.println("(" + i + ", " + (i + 2) + ")");
			}
		}
	}
	public static boolean ikiliAsalMi(int sayi) {
		return AsalSayiYazdirMetod.asalMi(sayi) && AsalSayiYazdirMetod.asalMi(sayi + 2);
	}
}

