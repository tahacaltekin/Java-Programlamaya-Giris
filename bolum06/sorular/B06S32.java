package bolum06.sorular;

/*
 *  ​(​Oyun: craps oyununda kazanma olasılığı) 6.30 daki alıştırmayı kullanarak oyunu 10 000 defa
 * oynatıp oyunu kaç defa kazandığınızı ekrana yazdırınız.
 */
public class B06S32 {

	public static void main(String[] args) {
		int sayac = 0;
		for (int i = 1; i <= 10000; i++) {
			if(crapsOyna() == 1) {
				sayac++;
			} 
				System.out.println("Kazanılan oyun sayısı: " + sayac);
			}
		}
	
	public static int crapsOyna() {
		
		int zar1 = zarAt();
		int zar2 = zarAt();
		
		skoruYaz(zar1, zar2);
		
		
		int puan = toplamiKontrolEt(zar1, zar2);
		if(puan <= 1) {
			sonucuYaz(puan);
			return puan;
		} 
		
		
		int toplam;
		
		do {
			
			zar1 = zarAt();
			zar2 = zarAt();
			toplam = zar1 + zar2;
		} while (toplam != puan && toplam != 7);
		
		skoruYaz(zar1, zar2);
		
		if (toplam == 7) {
			sonucuYaz(0);
			puan = 0;
		} else {
			sonucuYaz(1);
			puan = 1;
		}
		return puan;
	}
	
	public static int zarAt() {
		
		return (int)(1 + Math.random() * 6);
	}
	
	public static int toplamiKontrolEt(int zar1, int zar2) {
		
		int toplam = zar1 + zar2;
		
		switch (toplam) {
		case 2:
		case 3:
		case 12: return 0;
		case 7:
		case 11: return 1;
		}
		
		return toplam;
	}
	
	public static void sonucuYaz(int sonuc) {
		
		if(sonuc == 0) {
			System.out.println("Kaybettiniz!");
		} else {
			System.out.println("Kazandınız!");
		}
	}
	
	public static void skoruYaz(int zar1, int zar2) {
		System.out.println(
				"Atılan zarlar: " + zar1 + " + " + zar2 + " = " + (zar1 + zar2));
	}
}
