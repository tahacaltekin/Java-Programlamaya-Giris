package bolum05.sorular;

/*
 * (M�kemmel say�) Kendisi d���ndaki t�m pozitif b�lenlerinin toplam� kendisi olan pozitif bir tam say�ya
 * m�kemmel say� denir. �rne�in, 6 ilk m�kemmel say�d�r. 6 = 3 + 2 + 1 ikincisi ise, 28 = 14 + 7 + 4 + 2 + 1
 * 10.000�den k���k d�rt m�kemmel say� vard�r. Bu d�rt m�kemmel say�y� bulan bir program yaz�n�z.
 */

public class B05S33 {

	public static void main(String[] args) {
		
		System.out.println("10000'den k���k 4 m�kemmel say�");
		int toplam;
		
		for (int i = 1; i < 10000; i++) {
			toplam = 0;
			
			for (int k = 1; k < i; k++) {
				if (i % k == 0)
					toplam += k;
			}
			
			if (i == toplam) 
				System.out.printf("%20d\n", i);
			
			for (int sayi = 1; sayi <= 10000; sayi++) {
				Boolean mukemmelSayi = i == toplam;
			}
		}
	}
}
