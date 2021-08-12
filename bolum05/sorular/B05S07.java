package bolum05.sorular;

/*
 * (Finans uygulamasý: Gelecek okul ücretini hesaplayýnýz) Bu yýlýn okul ücretinin 10000 $ olduðunu ve her
 * yýl %5 arttýðýný varsayalým. Bir sonraki yýl okul ücreti 10 500$ olacaktýr. 10 yýlýn okul ücretini hesaplayan bir
 * program yazýnýz ve 10 uncu yýldan sonraki 4 yýlýn toplam ücretini hesaplayýnýz.
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
		System.out.println("10 yýllýk harc ücreti: $" + onyillikHarcUcreti);
		
		System.out.println("10 yýldan sonra ki 4 yýllýk öðrenim ücreti için ödenecek toplam ücret: $" + toplamUcret);
	}
}
