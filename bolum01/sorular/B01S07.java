package bolum01.sorular;

/*
 * (​Yaklaşık pi değerinin he ​ saplanması) Pi sayısı aşağıdaki formül kullanılarak hesaplanabilir:
 * 
 * 
 * pi = 4 X ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ...... )
 * 
 * Aşağıdaki ifadelerin sonuçlarını gösteren bir program yazınız
 * 
 * 4 X ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11)
 * 
 * 4 X ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13)
 * 
 * 
 * Programınızda​ 1 ​yerine ​1.0 ​kullanınız
 * 
 */

public class B01S07 {
	public static void main(String[] args) {
		System.out.println(4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));
		System.out.println(4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
	}

}
