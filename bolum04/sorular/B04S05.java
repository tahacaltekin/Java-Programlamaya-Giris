package bolum04.sorular;

/*
 * (Geometri: Düzgün çokgenin alanı) n kenardan oluşan, her bir kenar uzunluğu ve açıları aynı olan
 * çokgene düzgün çokgen denir. (Düzgün çokgen eşkenar ve eş açılıdır). Düzgün çokgenin alanını
 * hesaplamak için kullanılacak formül:
 * 
 * 
 * 					n x s²
 * 		alan = ----------------
 * 				4 x tan(pi / n)
 * 
 * s ​altıgenin kenar uzunluğunu gösterir. Kullanıcıdan düzgün çokgenin kenar sayısını ve uzunluğunu alan
 * ve alanını gösteren bir program yazınız
 */

import java.util.Scanner;

public class B04S05 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Düzgün çokgenin kenar sayısını giriniz: ");
		double kenarSayisi = girdi.nextDouble();
		
		System.out.println("Çokgenin kenar uzunluğunu giriniz: ");
		double kenarUzunlugu = girdi.nextDouble();
		
		double alan = (kenarSayisi * Math.pow(kenarUzunlugu, 2)) / (4 * Math.tan(Math.PI / kenarSayisi));
		
		System.out.println("Düzgün çokgenin alanı " + alan);
	}
}
