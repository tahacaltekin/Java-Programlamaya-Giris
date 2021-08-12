package bolum05.sorular;

/*
 *  ​(Oyun: piyango) Madde 3.8 Lottery.java ‘yı yeniden düzenleyerek iki basamaklı sayılardan bir
 * piyango oluşturun. Sayının iki basamağı birbirinden farklı olmalıdır. (İpucu: İlk basamağı oluşturun. Bir döngü
 * kullanarak ikinci basamak için farklı olan yeni bir değer üretin.)
 */

import java.util.Scanner;

public class B05S32 {

	public static void main(String[] args) {
		int piyangoBasamak1;
		int piyangoBasamak2;

		piyangoBasamak1 = (int) (Math.random() * 10);

		do {
			piyangoBasamak2 = (int) (Math.random() * 10);
		} while (piyangoBasamak1 == piyangoBasamak2);

		Scanner girdi = new Scanner(System.in);

		System.out.println("Piyango için iki basamaklı bir sayı tahmin ediniz: ");
		int tahmin = girdi.nextInt();
		
		int tahminBasamak1 = tahmin % 10;
		int tahminBasamak2 = tahmin / 10;
		
		
		System.out.println("Piyango numarası: " + piyangoBasamak1 + piyangoBasamak2);
		
		
		if (tahminBasamak1 == piyangoBasamak1 && tahminBasamak2 == piyangoBasamak2) {
			System.out.println("Tebrikler bildiniz. 10000 TL kazandınız.");			
		} else if (piyangoBasamak1 == tahminBasamak2 
				&& piyangoBasamak2 == tahminBasamak1) {
			System.out.println("İki rakamı da tutturdunuz. 3000 TL kazandınız.");
		} else if (piyangoBasamak1 == tahminBasamak1 
				|| piyangoBasamak1 == tahminBasamak2
				|| piyangoBasamak2 == tahminBasamak1
				|| piyangoBasamak2 == tahminBasamak2) {
			System.out.println("Bir rakam tutturdunuz. 1000 TL kazandınız.");
		} else {
			System.out.println("Bilemediniz.");
		}

	}
}
