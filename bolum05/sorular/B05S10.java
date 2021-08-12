package bolum05.sorular;

/*
 * (5 ve 6’ya bölünebilen sayýlarý bulma) 100’den 1000’e kadar olan sayýlardan 5 ve 6’ya tam olarak
 * bölünebilen sayýlarý her satýrda 10 sayý olacak ve sayýlar arasýnda birer boþluk olacak þekilde gösteren bir program
 * yazýnýz.
 */

public class B05S10 {

	public static void main(String[] args) {
		final int HER_SATIRDAKI_SAYI_SAYISI = 10;
		int sayac = 0;
		
		for(int i = 100; i <= 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				sayac++;
				
				if(sayac % HER_SATIRDAKI_SAYI_SAYISI == 0) 
					System.out.println(i);
				 else 
					System.out.print(i + " ");
				
			}
		}
		
	}
}
