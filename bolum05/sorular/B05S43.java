package bolum05.sorular;

/*
 * (Matematik: kombinasyon) 1�den 7�ye kadar say�lar�n t�m olas� kombinasyonlar�n� g�steren bir program
 * yaz�n�z. Ek olarak buldu�unuz t�m kombinasyonlar�n say�s�n� da g�sterin.
 */

public class B05S43 {

	public static void main(String[] args) {
		int sayac = 0;
		
		for (int sayi1 = 1; sayi1 < 7; sayi1++) {
			for (int sayi2 = sayi1 + 1; sayi2 <= 7; sayi2++) {
				System.out.println(sayi1 + " " + sayi2);
				sayac++;
			}
		}
		
		System.out.println("T�m kombinasyonlar�n toplam say�s�: " + sayac);
	}
}
