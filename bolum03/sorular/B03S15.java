package bolum03.sorular;

/*
 * (Oyun: piyango) Madde 3.8 Lottery.java ‘yı yeniden düzenleyerek üç basamaklı sayılardan bir
 * piyango oluşturun. Program kullanıcıdan üç basamaklı bir sayı alsın ve aşağıdaki kurallara göre
 * kazancını göstersin:
 * 
 * 1. Eğer girilen sayı piyangoda kazanan sayı ile birebir aynısı ise; ödül 10 000 TL
 * 2. Eğer girilen sayının tüm basamakları piyangoda kazanan sayı ile aynı ise; ödül 3 000 TL
 * 3. Eğer girilen sayının bir basamağı piyangoda kazanan sayı ile aynı ise; ödül 1 000 TL 
 */
import java.util.Scanner;

public class B03S15 {
public static void main(String[] args) {
		
		int piyango = (int)(Math.random() * 900) + 100 ;
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Piyango için üç basamaklı bir sayı tahmin ediniz: ");
		int tahmin = girdi.nextInt();
		
		
		int piyangoBirlerBasamagi = piyango / 100;
		int kalanBasamak = piyango % 100;
		int piyangoOnlarBasamagi = kalanBasamak / 10;
		int piyangoYuzlerBasamagi = kalanBasamak % 10;
		
		int tahminBirlerBasamagi = tahmin / 100;
		int tahminKalanBasamak = tahmin % 100;
		int tahminOnlarBasamagi = tahminKalanBasamak / 10;
		int tahminYuzlerBasamagi =  tahminKalanBasamak % 10;
		
		System.out.println("Piyango numarası: " + piyango);
		
		if (piyango == tahmin) {
			System.out.println("Tebrikler bildiniz. 10000 TL kazandınız.");			
		} else if (piyangoBirlerBasamagi == tahminOnlarBasamagi 
				&& piyangoOnlarBasamagi == tahminBirlerBasamagi
				&& piyangoYuzlerBasamagi == tahminYuzlerBasamagi) {
			System.out.println("İki rakamı da tutturdunuz. 3000 TL kazandınız.");
		} else if (piyangoBirlerBasamagi == tahminBirlerBasamagi 
				|| piyangoBirlerBasamagi == tahminOnlarBasamagi
				|| piyangoBirlerBasamagi == tahminYuzlerBasamagi
				|| piyangoOnlarBasamagi == tahminBirlerBasamagi
				|| piyangoOnlarBasamagi == tahminOnlarBasamagi
				|| piyangoOnlarBasamagi == tahminYuzlerBasamagi
				|| piyangoYuzlerBasamagi == tahminBirlerBasamagi
				|| piyangoYuzlerBasamagi == tahminOnlarBasamagi
				|| piyangoYuzlerBasamagi == tahminYuzlerBasamagi) {
			System.out.println("Bir rakam tutturdunuz. 1000 TL kazandınız.");
		} else {
			System.out.println("Bilemediniz.");
		}
	}

}
