package bolum06.sorular;

/*
 * (​Finans uygulaması: vergi tablosu oluşturma) Madde 3.5 ‘te vergileri hesaplayan bir program
 * mevcut. Aşağıdaki bildirime sahip vergi oranlarını hesaplayan bir metot yazınız.
 * 
 * public static double ​computeTax(​int ​status, ​double ​taxableIncome)
 * 
 * Vergilendirilebilir geliri $50,000 ile $60,000 aralığında $50’lık arttırarak aşağıda belirtilen her durum
 * için yukarıda bildirilen metodu kullanarak aşağıdaki tabloyu gösteren bir program yazınız.
 * 
 * 
 * 
 * Vergilendirilebilir 		Bekar 			Married Joint 		    Married     Head of  House
 *       Gelir                         ya da  Qualifying Separate
 *                                             Widow(er)
 * ------------------------------------------------------------------------------------------------  
 *   50000 					8688 				6665 				8688 			7353
 *   50050 					8700 				6673 				8700 			7365
 *   ...
 *   59950 					11175 				8158 				11175 			9840
 *   60000 					11188 				8165 				11188 			9853
 *   
 *   İpucu: vergiyi bu metot aracılığıyla tam sayıya yuvarlayabilirsiniz. Math.round
 *   (ör.,​Math.round(computeTax(status, taxableIncome)​)
 */

public class B06S15 {

	public static void main(String[] args) {
		
		double baslangicDegeri = 50000;
		double bitisDegeri = 60000;
		double aralikDegeri = 50;
		
		System.out.println("Vergilendirilebilir       Bekar      Evli Ortak       Evli       Ev\n" +
						   "     Gelir                            ya da Dul       Ayrı     Çalışanı\n " + 
				           "------------------------------------------------------------------------------");
		
		for (double gelirVergisi = baslangicDegeri; gelirVergisi <= bitisDegeri; gelirVergisi += aralikDegeri) {
			System.out.printf("%-26.0f", gelirVergisi);
			System.out.printf("%-15d", Math.round(vergiHesapla(0, gelirVergisi)));
			System.out.printf("%-13d", Math.round(vergiHesapla(1, gelirVergisi)));
			System.out.printf("%-10d", Math.round(vergiHesapla(2, gelirVergisi)));
			System.out.printf("%-10d\n", Math.round(vergiHesapla(3, gelirVergisi)));
		}
	}
	public static double vergiHesapla(int durum, double gelirVergisi) {
		double vergi;
		double vergiOrani;
		double gelirVergili;
		double gelirVergisiz;
		double vergiYuzde15;
		double vergiYuzde25;
		double vergiYuzde28;
		double vergiYuzde33;
		double vergiYuzde35;
		
		vergiYuzde15 = vergiYuzde25 = vergiYuzde28 = vergiYuzde33 = vergiYuzde35 = 
		gelirVergisiz = vergi = vergiOrani = 0.0;
		
		switch (durum) {
		case 0:
						vergiYuzde15 = 8351;
						vergiYuzde25 = 33951;
						vergiYuzde28 = 82251;
						vergiYuzde33 = 171551;
						vergiYuzde35 = 372951; break;
		case 1:
						vergiYuzde15 = 16701;
						vergiYuzde25 = 67901;
						vergiYuzde28 = 137051;
						vergiYuzde33 = 208851;
						vergiYuzde35 = 372951; break;
		case 2:
						vergiYuzde15 = 8351;
						vergiYuzde25 = 33951;
						vergiYuzde28 = 68526;
						vergiYuzde33 = 104426;
						vergiYuzde35 = 186476; break;			
		case 3:
						vergiYuzde15 = 11951;
						vergiYuzde25 = 45501;
						vergiYuzde28 = 117451;
						vergiYuzde33 = 190201;
						vergiYuzde35 = 372951; break;
		}
		
		while (gelirVergisi >= vergiYuzde15) {
			
			if (gelirVergisi >= vergiYuzde35) {
				vergiOrani = 0.35;
				gelirVergisiz = vergiYuzde35 - 1;		
			} 
			else if (gelirVergisi >= vergiYuzde33) {
				vergiOrani = 0.33;
				gelirVergisiz = vergiYuzde33 - 1;
			} 
			else if (gelirVergisi >= vergiYuzde28) {
				vergiOrani = 0.28;
				gelirVergisiz = vergiYuzde28 - 1;
			} 
			else if (gelirVergisi >= vergiYuzde25) {
				vergiOrani = 0.25;
				gelirVergisiz = vergiYuzde25 - 1;
			} 
			else if (gelirVergisi >= vergiYuzde15) {
				vergiOrani = 0.15;
				gelirVergisiz = vergiYuzde15 - 1;
			} 
			
			vergi += (gelirVergili = gelirVergisi - gelirVergisiz) * vergiOrani;
			gelirVergisi -= gelirVergili;
		}
		
		return vergi += gelirVergisi * 0.10;
	} 
}
