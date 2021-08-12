package bolum08.sorular;


/*
 * (​Başkenti tahmin et) Kullanıcıdan art arda bir eyaletin başkentini girmesini isteyen bir program
 * yazınız. Kullanıcı giriş yaptıktan sonra program girilen cevabın doğru olup olmadığını göstersin. 
 * 50 eyaletin ve başkentlerinin iki boyutlu bir dizide tutulduğunu varsayalım.
 * Program kullanıcıya tüm eyaletlerin başkentlerini soracak ve sonunda toplam doğru sayısını gösterecek.
 */
import java.util.Scanner;

public class B08S37 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		String[][] ulkelerVeBaskentleri = dataAl();
		
		int sayac = 0;
		System.out.println("ilk Harf büyük olmalıdır!");
		for (int i = 0; i < ulkelerVeBaskentleri.length; i++) {
			System.out.print(ulkelerVeBaskentleri[i][0] + " ülkesinin başkenti neresidir? " );
			
			String baskent = girdi.nextLine();
			
			
			if (dogruMu(ulkelerVeBaskentleri[i][1], baskent)) {
				System.out.println("Cevabınız doğru");
				sayac++;
			} else {
				System.out.println("Cevabınız Yanlış! Doğru cevap " + ulkelerVeBaskentleri[i][1]);
			}
		}
		
		System.out.println("Doğru cevap sayısı: " + sayac);
	}
	
	
	public static boolean dogruMu(String c, String a) {
		if (c.length() != a.length()) 
			return false;
		
		for (int i = 0; i < c.length(); i++) {
			if(c.charAt(i) != a.charAt(i))
				return false;
		}
		
		return true;
	}
	
	
	public static String[][] dataAl() {
		String[][] dizi = {
				{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
				{"Arkansas", "Little Rock"}, {"California", "Sacramento"},
				{"Colorado", "Denver"}, {"Connecticut", "Hartford"}, 
				{"Delaware", "Dover"}, {"Florida", "Tallahassee"}, 
				{"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
				{"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
				{"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"}, 
				{"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, 
				{"Maryland", "Annapolis"}, {"Massachusetts", "Boston"}, 
				{"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, 
				{"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"}, 
				{"Montana", "Helena"}, {"Nebraska", "Lincoln"}, 
				{"Nevada	", "Carson City"}, {"New Hampshire", "Concord"}, 
				{"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"}, 
				{"New York", "Albany"}, {"North Carolina", "Raleigh"}, 
				{"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
				{"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"}, 
				{"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, 
				{"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, 
				{"Tennessee", "Nashville"}, {"Texas", "Austin"}, 
				{"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"}, 
				{"Virginia", "Richmond"}, {"Washington", "Olympia"}, 
				{"West Virginia", "Charleston"}, {"Wisconsin", "Madison"}, 
				{"Wyoming", "Cheyenne"}};
		
		return dizi;
	}
}
