package bolum05.sorular;

/*
 * (Finans uygulamas�: Gelecek okul �cretini hesaplay�n�z) Bu y�l�n okul �cretinin 10000 $ oldu�unu ve her
 * y�l %5 artt���n� varsayal�m. Bir sonraki y�l okul �creti 10 500$ olacakt�r. 10 y�l�n okul �cretini hesaplayan bir
 * program yaz�n�z ve 10 uncu y�ldan sonraki 4 y�l�n toplam �cretini hesaplay�n�z.
 */

public class B05S07 {

	public static void main(String[] args) {
		int toplamUcret = 0;
		int harc = 10000;
		int onyillikHarcUcreti = 0;
		
		for (int yil = 1; yil <= 14; yil++) {
			harc += (harc * 0.05);
			
			if (yil > 10) {
				toplamUcret += harc;
			}
			
			if (yil == 10) {
				onyillikHarcUcreti = harc;
			}
		}
		System.out.println("10 y�ll�k harc �creti: $" + onyillikHarcUcreti);
		
		System.out.println("10 y�ldan sonra ki 4 y�ll�k ��renim �creti i�in �denecek toplam �cret: $" + toplamUcret);
	}
}
