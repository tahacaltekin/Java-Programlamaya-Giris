package bolum03.sorular;

/*
 * (Rastgele nokta) Bir dikd�rtgen i�inde kalacak �ekilde rastgele nokta �reten bir program yaz�n�z.
 * Bu dikd�rtgenin merkezi (0, 0) noktas�, uzunlu�u 100 ve y�ksekli�i 200 olsun.
 */

public class B03S16 {
	public static void main(String[] args) {
		int genislik = (int)((Math.random() * (50  + 50)) - 50);
		int yukseklik = (int)((Math.random() * (100 + 100)) - 100);
		
		System.out.println("Dikd�rtgende rastgele koordinat merkezi (0,0)");
		System.out.println("100 cm geni�li�inde ve 200 cm y�ksekli�inde (" + genislik + ", " + yukseklik + ")");
	}
}
