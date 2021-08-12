package bolum05.sorular;

/*
 * (Seri toplamý) Aþaðýdaki serinin toplamýný hesaplayan bir program yazýnýz.
 * 
 * 1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + ... + 95 / 97 + 97 / 99
 */

public class B05S24 {

	public static void main(String[] args) {
		double toplam = 0.0;
		
		for (double i = 1.0; i <= 97; i += 2) {
			toplam += i / (i + 2);
			
		}
		
		System.out.println("1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + " + 
				" ... + 95 / 97 + 97 / 99 : " + toplam);
	}
}
