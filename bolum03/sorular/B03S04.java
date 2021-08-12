package bolum03.sorular;

/*
 * (Rastgele ay) 1 ile 12 arasýnda rastgele bir sayý üreten ve 1 ­ Ocak, 2 ­ Þubat ...12 ­ Aralýk olacak
 * þekilde bu sayýya karþýlýk gelen ayý gösteren bir program yazýnýz.
 */
public class B03S04 {
	public static void main(String[] args) {
		int ay = (int)(Math.random() * 12) + 1;
		
		switch (ay) {
		case 1 : System.out.println("Ocak"); break;
		case 2 : System.out.println("Þubat"); break;
		case 3 : System.out.println("Mart"); break;
		case 4 : System.out.println("Nisan"); break;
		case 5 : System.out.println("Mayýs"); break;
		case 6 : System.out.println("Haziran"); break;
		case 7 : System.out.println("Temmuz"); break;
		case 8 : System.out.println("Aðustos"); break;
		case 9 : System.out.println("Eylül"); break;
		case 10 : System.out.println("Ekim"); break;
		case 11 : System.out.println("Kasým"); break;
		case 12 : System.out.println("Aralýk"); 
		}
	}
}
