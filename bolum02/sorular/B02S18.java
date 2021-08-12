package bolum02.sorular;


/*
 * (​Tablo oluşturma) Aşağıdaki tabloyu oluşturacak bir program yazınız: Gerçek sayıları tam
 * sayıya dönüştürün.
 * 
 * a 	b	 pow(a, b)
 * 1	2 	   1
 * 2 	3 	   8
 * 3 	4 	   81
 * 4 	5	   1024
 * 5 	6 	   15625
 */

public class B02S18 {
	public static void main(String[] args) {
		System.out.println("a     b   pow(a,b)");
		
		double islem1 = Math.pow(1, 2);
		System.out.println("1     2    " +  (int)islem1);
		
		double islem2 = Math.pow(2, 3);
		System.out.println("2     3    " +  (int)islem2);
		
		double islem3 = Math.pow(3, 4);
		System.out.println("3     4    " +  (int)islem3);
		
		double islem4 = Math.pow(4, 5);
		System.out.println("4     5    " +  (int)islem4);
		
		double islem5 = Math.pow(5, 6);
		System.out.println("5     6    " +  (int)islem5);
	}

}
