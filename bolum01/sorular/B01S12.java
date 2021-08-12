package bolum01.sorular;

/*
 * (​Ortalama hız) Bir koşucunun ​24 ​mili 1  ​ ​saat, ​40 ​dakika, ​35 ​saniyede koştuğunu varsayalım. Ortalama
 * hızı km/saat cinsinden gösterecek bir program yazınız. ( ​1 ​mil​, ​1.6 ​kilometredir.
 */
public class B01S12 {
	public static void main(String[] args) {
	 int toplamSaniye = (1 * 60 * 60 + 40 * 60 + 35 );
	 
	 double saattekiHiz = (24.0 / toplamSaniye) * 60 * 60 ;
	 
	 System.out.println("kilometre cinsinden saatteki hizi: " + saattekiHiz * 1.6);
	}

}
