package bolum06.sorular;

/*
 * (Seri toplamý) Aþaðýdaki serileri hesaplayan bir metot yazýnýz:
 * 
 * m(i) = 1 / 2 + 2 / 3 + ... + i / (i + 1)
 * 
 * Aþaðýdaki tabloyu oluþturacak bir test programý yazýnýz:
 * 
 * 		i 				m(i)
 * ­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­
 *		1 				0.5000
 * 		2 				1.1667
 * 		...
 * 		19 				16.4023
 * 		20 				17.3546

 */

public class B06S13 {

	public static void main(String[] args) {
		double seriBaslangici = 1.0;
		double seriSayisi = 20.0;
		
		System.out.println("i          m(i)\n" + 
							"------------------------");
		
		for (double i = seriBaslangici; i <= seriSayisi ; i++) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", seriToplami(i));
		}
	}
	
	public static double seriToplami(double n) {
		double toplam = 0;
		for (double i = 1; i <= n; i++) {
			toplam += i / (i + 1);
		}
		
		return toplam;
	}
}
