package bolum04.sorular;

/*
 * (SN kontrolü) Kullanýcýdan sigorta numarasýný, RRR­RR­RRRR (R bir rakam gösterir) biçiminde
 * alan bir program yazýnýz. Programýnýz girdinin biçiminin doðru olup olmadýðýný kontrol edecek.
 */

import java.util.Scanner;

public class B04S21 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Sigorta numaranýzý giriniz: ORN: RRR-RR-RRRR ");
		String sigortaNumarasi = girdi.nextLine();
		
		boolean isValid = 
				(sigortaNumarasi.length() == 11) && 
				(Character.isDigit(sigortaNumarasi.charAt(0))) &&
				(Character.isDigit(sigortaNumarasi.charAt(1))) &&
				(Character.isDigit(sigortaNumarasi.charAt(2))) &&
				(sigortaNumarasi.charAt(3) == '-') &&
				(Character.isDigit(sigortaNumarasi.charAt(4))) &&
				(Character.isDigit(sigortaNumarasi.charAt(5))) &&
				(sigortaNumarasi.charAt(6) == '-') &&
				(Character.isDigit(sigortaNumarasi.charAt(7))) &&
				(Character.isDigit(sigortaNumarasi.charAt(8))) &&
				(Character.isDigit(sigortaNumarasi.charAt(9))) &&
				(Character.isDigit(sigortaNumarasi.charAt(10)));
		
		System.out.println(sigortaNumarasi + " sigorta numarasý " + ((isValid) ? "doðru" : "yanlýþ"));
	}
}
