package bolum04.sorular;

/*
 * (Geometri: be�genin alan�) A�a��da bulunan �ekildeki gibi kullan�c�dan be�genin merkezinden
 * k��esine kadar olan uzunlu�u alarak, alan�n� hesaplayan bir program yaz�n�z.
 * 
 * 
 * Be�genin alan�n� hesaplamak i�in kullan�lacak form�l:
 * 
 *  	    	5 x s�
 *  alan = ----------------  
 * 			4 x tan(pi / 5)
 * 
 * s be�genin kenar uzunlu�unu g�sterir. Kenar uzunlu�u a�a��daki form�l kullan�larak hesaplanabilir.
 * 
 * 
 * 
 *  s = 2r sin(pi / 5)
 *  
 *  r be�genin merkezinin k��esine olan uzakl���n� g�sterir. Ondal�k k�sm� iki basamak olacak �ekilde
 *  yuvarlay�n�z
 */

import java.util.Scanner;

public class B04S01 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Be�genin alan hesaplamas� i�in merkezinden k��esine olan uzunlu�u giriniz: ");
		double r = girdi.nextDouble();
		
		double s = (2 * r) * (Math.sin(Math.PI / 5));
		
		double alan = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.println("Be�genin alan� " + (int)(alan * 100) / 100.0);
	}
}
