package bolum05.sorular;

/*
 * (Piramit deseninde sayıları gösterme) İç içe for​ döngüsü kullanarak aşağıdaki çıktıyı oluşturun.
 */

public class B05S19 {

	public static void main(String[] args) {
		int azalanSayi = 0;
		int boslukSayisi = 7;
		
		for (int satir = 1; satir <= 128; satir += satir) {
			for (int bosluk = 0; bosluk < boslukSayisi; bosluk++) {
				System.out.print("    ");
			}
			for (int l = 1; l <= satir; l += l) {
				System.out.printf("%4d", (l));
			}
			for (int r = azalanSayi; r > 0; r /= 2) {
				System.out.printf("%4d", (r));
			}
			System.out.println();
			boslukSayisi--;
			azalanSayi = satir;
		}
	}
}
