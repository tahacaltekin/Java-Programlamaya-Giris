package bolum01.sorular;


/*
 * (​Ortalama hız) Bir koşucunun  ​14 ​kilometreyi  ​45 ​dakika ​30 ​saniyede koştuğunu varsayalım.
 * Ortalama hızı mil/saat cinsinden gösterecek bir program yazınız. ( ​1 ​mil​, ​1.6 ​kilometredir.)
 */

public class B01S10 {
	public static void main(String[] args) {
		double saatlikHiz = (14 / 45.5 ) * 60;
		double milCinsindenSaatlikHizi = saatlikHiz / 1.6;
		
		System.out.println("Mil Cinsinden saatlik Hiz: " + milCinsindenSaatlikHizi);
	}

}
