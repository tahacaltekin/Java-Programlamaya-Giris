package bolum04.sorular;

/*
 * (SN kontrol�) Kullan�c�dan sigorta numaras�n�, RRR�RR�RRRR (R bir rakam g�sterir) bi�iminde
 * alan bir program yaz�n�z. Program�n�z girdinin bi�iminin do�ru olup olmad���n� kontrol edecek.
 */

import java.util.Scanner;

public class B04S21 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Sigorta numaran�z� giriniz: ORN: RRR-RR-RRRR ");
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
		
		System.out.println(sigortaNumarasi + " sigorta numaras� " + ((isValid) ? "do�ru" : "yanl��"));
	}
}
