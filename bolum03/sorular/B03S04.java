package bolum03.sorular;

/*
 * (Rastgele ay) 1 ile 12 aras�nda rastgele bir say� �reten ve 1 � Ocak, 2 � �ubat ...12 � Aral�k olacak
 * �ekilde bu say�ya kar��l�k gelen ay� g�steren bir program yaz�n�z.
 */
public class B03S04 {
	public static void main(String[] args) {
		int ay = (int)(Math.random() * 12) + 1;
		
		switch (ay) {
		case 1 : System.out.println("Ocak"); break;
		case 2 : System.out.println("�ubat"); break;
		case 3 : System.out.println("Mart"); break;
		case 4 : System.out.println("Nisan"); break;
		case 5 : System.out.println("May�s"); break;
		case 6 : System.out.println("Haziran"); break;
		case 7 : System.out.println("Temmuz"); break;
		case 8 : System.out.println("A�ustos"); break;
		case 9 : System.out.println("Eyl�l"); break;
		case 10 : System.out.println("Ekim"); break;
		case 11 : System.out.println("Kas�m"); break;
		case 12 : System.out.println("Aral�k"); 
		}
	}
}
