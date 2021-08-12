package bolum08.sorular;

/*
 * (​En büyük blok) 0 ve 1 değerlerinden oluşan bir kare matrisin, 1 değerinden oluşan en büyük
 * kare alt matrisini bulan bir program yazınız. Kullanıcı matrisin satır sayısını girecek. Program bulduğu
 * kare alt matrisin ilk elemanın konumunu ve satır sayısını ekranda gösterecek.
 * 
 * En büyük kare alt matrisi bulmak için aşağıda bildirimi verilen metodu yazınız ve programınızda
 * kullanınız.
 * 
 * public static int​[] findLargestBlock(​int​[][] m)
 * 
 * 
 * Metodun geri dönüş değeri olan dizinin  üç elemanı olacak. İlk iki elman satır ve sütun indeksi, üçüncü
 * eleman ise satır sayısını tutacaktır.
 */
import java.util.Scanner;

public class B08S35 {
	private final static int satirIndeks = 0;
	private final static int sutunIndeks = 1;
	private final static int altKareMatris = 2;

	public static void main(String[] args) {
		int matrisBoyutu = matrisBoyutuAl();
		int[][] matris = matrisAl(matrisBoyutu, matrisBoyutu);
		
		int[] enBuyukBlok = enBuyukBlokBul(matris);
		enBuyukBlokYazdir(enBuyukBlok);
	}
	
	public static void enBuyukBlokYazdir(int[] enBuyukBlok) {
		System.out.print("En büyük kare alt matris blok: (" + enBuyukBlok[satirIndeks] + ", " + 
				enBuyukBlok[sutunIndeks] + ") ve boyutu: " + enBuyukBlok[altKareMatris]);
	}
	
	public static int matrisBoyutuAl() {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Matrisin boyutunu giriniz: ");
		int matrisBoyutu = girdi.nextInt();
		return matrisBoyutu;
	}
	
	public static int[][] matrisAl(int satirlar, int sutunlar) {
		int[][] matris = new int[satirlar][sutunlar];
		Scanner girdi = new Scanner(System.in);
		System.out.println("Matrisi satır satır olacak şekilde boyutuna uygun şekilde giriniz: ");
		for (int i = 0; i < satirlar; i++) {
			for (int j = 0; j < sutunlar; j++) {
				matris[i][j] = girdi.nextInt();
			}
		}
		
		return matris;
	}
	
	public static int[] enBuyukBlokBul(int[][] matris) {
		int[] enBuyukBlok = new int[3];
		for (int satir = 0; satir < matris.length; satir++) {
			for (int sutun = 0; sutun < matris.length; sutun++) {
				if (matris[satir][sutun] == 0) 
					continue;
				
				int enBuyukBlokIndeks = bloklarinIndeksiniKontrolEt(satir, sutun, matris);
				if (enBuyukBlokIndeks > enBuyukBlok[altKareMatris]) {
					enBuyukBlok[satirIndeks] = satir;
					enBuyukBlok[sutunIndeks] = sutun;
					enBuyukBlok[altKareMatris] = enBuyukBlokIndeks;
				}
			}
		}
		
		return enBuyukBlok;
	}
	
	public static int bloklarinIndeksiniKontrolEt(int satir, int sutun, int[][] m) {
		int enBuyukBlokOlabilir = m.length - (satir > sutun ? satir : sutun);
		for (int blokBoyutu = enBuyukBlokOlabilir; blokBoyutu >= 0; blokBoyutu--) {
			if (hepsiBirMi(satir, sutun, m, blokBoyutu)) 
				return blokBoyutu;
		}
		
		return 0;
	}
	
	public static boolean hepsiBirMi(int satir, int sutun, int[][] m, int altKareBoyutu) {
        for (int i = satir; i < altKareBoyutu + satir; i++) {
            for (int j = sutun; j < altKareBoyutu + sutun; j++) {
                if (m[i][j] == 0) 
                	return false;
            }
        }
        return true;
    }
}
