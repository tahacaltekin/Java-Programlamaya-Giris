package bolum07.sorular;

/*
 * ​ (​Oyun: Kilitli dolap bilmecesi) 100 kilitli dolap ve 100 öğrencinin olduğu bir okulda, okulun ilk
 * günü tüm dolaplar kilitlidir. Öğrenciler sırayla okula girerler ve ilk öğrenci (O1) tüm dolapların kilidini
 * açar. İkinci öğrenci, O2, ikinci dolaptan, D2, başlar ve bunun ardından gelen tün dolapları kilitler.
 * Üçüncü öğrenci O3, üçüncü dolaptan başlar D3 ve üçün katı olan dolapları değiştirir. (Açıksa kilitler,
 * kilitliyse açar)  O4, D4’ten başlar ve dördün katı olan dolapları değiştirir. O5, D5’ten başlar ve beşin katı
 * olan dolapları değiştirir ve bu O100 ve D100 olana kadar böyle devam eder.
 * 
 * 
 * Tüm öğrenciler geçtikten sonra hangi dolaplar açık olacaktır? Bu sorunun cevabını bulmak için
 * bir program yazınız ve tüm açık dolapların numaralarını aralarında bir boşluk olacak şekilde
 * gösteriniz. (​İpucu: 100 tane Boolean elemanı olan bir dizi alınız,  eğer bir dolap açıksa onu  (​true​)
 * olarak atayın ve kapalıysa  (​false​) değeri atayınız. Başlngıç durumunda tüm çekmeceler
 * kapalıdır.) 
 */

public class B07S23 {

	public static void main(String[] args) {
		String[] dolaplar = new String[100];
		
		butunDolaplarKapali(dolaplar);
		
		ogrenciDolapDegistirme(dolaplar);
		
		yazdir(dolaplar);
	}
	
	public static boolean acikMi(String d) {
		return d == "AÇIK";
	}
	
	public static void butunDolaplarKapali(String[] dolaplar) {
		for (int i = 0; i < dolaplar.length; i++) {
			dolaplar[i] = "KAPALI";
		}
	}
	
	public static void ogrenciDolapDegistirme(String[] dolaplar) {
		int baslangic = 0;
		
		for (int o = 1; o <= dolaplar.length; o++) {
			for (int d = 0; d < dolaplar.length; d += o) {
				if (acikMi(dolaplar[d])) {
					dolaplar[d] = "KAPALI";
				} else {
					dolaplar[d] = "AÇIK";
				}
			}	
			
			baslangic++;
		}
		
	}
	
	public static void yazdir(String[] dolaplar) {
		for (int i = 0; i < dolaplar.length; i++) {
			if (acikMi(dolaplar[i])) {
				System.out.print("D" + (i + 1) + " ");
			}
		}
		
		System.out.println();
	}
}
