package bolum03.sorular;

/*
 * (İş: ISBN­10 kontrolü) ISBN­10 ​(Uluslararası Standart Kitap Numarası) 10 basamaktan oluşur:
 * d1d2d3d4d5d6d7d8d9d10. Son basamak d10 sağlama için kullanılır ve diğer basamaklar kullanılarak
 * aşağıdaki formülle hesaplanır
 * 
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6  * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 * 
 * ISBN­10 standartlarına göre eğer sağlama değeri 10​ elde edilirse, bu X olarak gösterilir. Kullanıcıdan ilk
 * 9 basamağı alan ve 10 basamaklı ISBN numarasını gösteren bir program yazınız. (Baştaki sıfırları da
 * gösteriniz.) Programınız girdiyi tam sayı olarak okumalıdır.
 */
import java.util.Scanner;

public class B03S09 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Kitaba verilecek seri numarası için 9 adet tam sayı giriniz: ");
		int d1 = girdi.nextInt();
		int d2 = girdi.nextInt();
		int d3 = girdi.nextInt();
		int d4 = girdi.nextInt();
		int d5 = girdi.nextInt();
		int d6 = girdi.nextInt();
		int d7 = girdi.nextInt();
		int d8 = girdi.nextInt();
		int d9 = girdi.nextInt();
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		if (d10 == 10) {
			System.out.println("ISBN-10 numarası: " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "X" );
		} else {
			System.out.println("ISBN-10 numarası: " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + d10 );
		}
	}
}
