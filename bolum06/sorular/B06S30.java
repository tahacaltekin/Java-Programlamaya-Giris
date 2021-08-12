package bolum06.sorular;

/*
 * (​Oyun: Craps) Craps popüler bir zar oyunudur. Aşağıdaki yönergelere göre oyunu
 * oynayabileceğiniz bir program yazınız.
 * 
 * İki zar atın. Her bir zarın altı yüzü vardır ve üzerinde 1, 2, … ve 6’ya kadar rakamlar vardır. İki zarın
 * toplamını alın. Eğer toplam 2, 3 ya da 12 (craps denir) ise kaybedersiniz. Eğer toplam 7 ya da 11 (natural
 * denir) ise kazanırsınız. Eğer toplam bunların dışında bir değerse (ör., 4, 5, 6, 8, 9 ya da 10) bu sayıyla
 * oyun başlar. 7 ya da gelen sayı tekrar gelene kadar zar atılmaya devam edilir. Eğer önce 7 gelirse
 * kaybedersiniz. Aksi takdirde kazanırsınız.
 * Yazacağınız program tek oyuncu gibi davranacak. 
 */

public class B06S30 {

	public static void main(String[] args) {
		int puan = ikiZarAt();
		
		int sonuc = sonucuAl(puan);
		
		if(NaturalYadaCrapsMi(sonuc)) {
			sonucuYazdir(sonuc);
		} else {
			kazanilanaYadaKaybedileneKadarZarAt(sonuc);
		}
	}
	
	public static int zarAt() {
		
		return (int)(1 + Math.random() * 6);
	}
	
	public static int ikiZarAt() {
		int zar1 = zarAt();
		int zar2 = zarAt();
		int toplam = zar1 + zar2;
		
		System.out.println("Atılan zarlar: " + zar1 + " + " + zar2 + " = " + toplam);
		return toplam;
	}
	
	public static int sonucuAl(int puan) {
		
		switch (puan) {
		case 2:
		case 3:
		case 12: puan = 0; break;
		case 7:
		case 11: puan = 1; break;
		}
		return puan;
	}
	
	public static void sonucuYazdir(int sonuc) {
		if(sonuc == 0) {
			System.out.println("Kaybettiniz!");
		} else if (sonuc == 1) {
			System.out.println("Kazandınız!");
		}
	}
	
	public static boolean NaturalYadaCrapsMi(int sonuc) {
		return sonuc == 0 || sonuc == 1;
	}
	
	public static void kazanilanaYadaKaybedileneKadarZarAt(int puan) {
		int sonuc;
		
		do {
			sonuc = ikiZarAt();
		} while (sonuc != puan && sonuc != 7);
		
		
		if (sonuc == 7) {
			sonucuYazdir(0);
		} else {
			sonucuYazdir(1);
		}
	}
}
