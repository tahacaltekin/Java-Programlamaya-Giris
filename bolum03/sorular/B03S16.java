package bolum03.sorular;

/*
 * (Rastgele nokta) Bir dikdörtgen içinde kalacak þekilde rastgele nokta üreten bir program yazýnýz.
 * Bu dikdörtgenin merkezi (0, 0) noktasý, uzunluðu 100 ve yüksekliði 200 olsun.
 */

public class B03S16 {
	public static void main(String[] args) {
		int genislik = (int)((Math.random() * (50  + 50)) - 50);
		int yukseklik = (int)((Math.random() * (100 + 100)) - 100);
		
		System.out.println("Dikdörtgende rastgele koordinat merkezi (0,0)");
		System.out.println("100 cm geniþliðinde ve 200 cm yüksekliðinde (" + genislik + ", " + yukseklik + ")");
	}
}
