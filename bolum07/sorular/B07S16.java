package bolum07.sorular;

/*
 *  (​Çalışma süresi)  Rastgele 100,000  tamsayı içeren bir dizi ve anahtar oluşturan bir program yazınız.
 * Madde 7.6 daki  ​linearSearch​ metodunu çalışma süresini tahmin ediniz. Madde 7.7 daki  ​binarySearch
 * metodunu kullanarak diziyi sıralayınız ve  çalışma süresini tahmin ediniz. Aşağıdaki kod şablonunu
 * kullanarak çalışma sürelerini tahmin edebilirsiniz:
 * 
 * long​ startTime = System.currentTimeMillis();
 * Çalışan kod parçası;
 * 
 * long​ endTime = System.currentTimeMillis();
 * long​ executionTime = endTime ­ startTime;
 */

public class B07S16 {

	public static void main(String[] args) {
		
		int sayi;
		int[] sayilar = new int[100000];
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = rastgeleSayi();
		}
		
		int anahtar = rastgeleSayi();
		
		int aramaSonucu;
		long baslangicZamani = System.currentTimeMillis();
		aramaSonucu = linerArama(sayilar, anahtar);
		long bitisZamani = System.currentTimeMillis();
		long calismaZamani = bitisZamani - baslangicZamani;
		System.out.println("liner aramayı milisaniye cinsinden çalıştırma süresi: " + calismaZamani);
		
		
		secimSiralamasi(sayilar);
		
		baslangicZamani = System.currentTimeMillis();
		aramaSonucu = binaryArama(sayilar, anahtar);
		bitisZamani = System.currentTimeMillis();
		calismaZamani = bitisZamani - baslangicZamani;
		System.out.println("binary aramayı milisaniye cinsinden çalıştırma süresi: " + calismaZamani);
	}
	
	public static int rastgeleSayi() {
		return 1 + (int)(Math.random() * 100000);
	}
	
	public static int linerArama(int[] dizi, int anahtar) {
		for (int i = 0; i < dizi.length; i++) {
			if (anahtar == dizi[i]) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static int binaryArama(int[] dizi, int anahtar) {
		int dusuk = 0;
		int yuksek = dizi.length - 1;
		
		while (yuksek >= dusuk) {
			int orta = (dusuk + yuksek) / 2;
			if(anahtar < orta) {
				yuksek = orta - 1;
			} else if (anahtar == orta) {
				return orta;
			} else {
				dusuk = orta + 1;
			}
		}
		
		return -dusuk - 1;
	}
	
	public static void secimSiralamasi(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			int min = dizi[i];
			int minIndeks = i;
			
			for (int j = i + 1; j < dizi.length; j++) {
				if (min > dizi[j]) {
					min = dizi[j];
					minIndeks = j;
				}
			}
			
			if (minIndeks != i) {
				dizi[minIndeks] = dizi[i];
				dizi[i] = min;
			}
		}
	}
}
