package bolum03.sorular;

/*
 * (�� tamsay�y� s�ralama) Kullan�c�dan �� tam say� alan ve bu tam say�lar� azalan �ekilde s�ralay�p
 * g�steren bir program yaz�n�z. 
 */

import java.util.Scanner;

public class B03S08 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Birinci say�y� giriniz: ");
		int sayi1 = girdi.nextInt();
		
		System.out.println("�kinci say�y� giriniz: ");
		int sayi2 = girdi.nextInt();
		
		System.out.println("���nc� say�y� giriniz: ");
		int sayi3 = girdi.nextInt();
		
		if (sayi1 > sayi2 && sayi1 > sayi3 && sayi2 > sayi3) {
			System.out.println(sayi1 + " > " + sayi2 + " > " + sayi3);
		} else if (sayi1 > sayi2 && sayi1 > sayi3 && sayi3 > sayi2) {
			System.out.println(sayi1 + " > " + sayi3 + " > " + sayi2);
		} else if (sayi2 > sayi1 && sayi2 > sayi3 && sayi1 > sayi3) {
			System.out.println(sayi2 + " > " + sayi1 + " > " + sayi3);
		} else if (sayi2 > sayi1 && sayi2 > sayi3 && sayi3 > sayi1) {
			System.out.println(sayi2 + " > " + sayi3 + " > " + sayi1);
		} else if (sayi3 > sayi1 && sayi3 > sayi2 && sayi1 > sayi2) {
			System.out.println(sayi3 + " > " + sayi1 + " > " + sayi2);
		} else {
			System.out.println(sayi3 + " > " + sayi2 + " > " + sayi1);
		}
			
	}
}
