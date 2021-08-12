package bolum01.sorular;

/*
 * (​Alan ve çevre hesaplama) ​5.5​ yarı çapında bir çemberin çevresini ve alanını hesaplayan bir program
 * yazınız. Hesaplama için aşağıdaki formülleri kullanınız:
 * 
 * çevre = 2 * ​yarıçap * ​pi
 * 
 * alan = y​ arıçap * ​yarıçap * pi
 * 
 * 
 */

public class B01S08 {
	public static void main(String[] args) {
		double yaricap;
		double alan;
		double cevre;
		
		
		//yaricapi oku
		yaricap = 5.5;
		
		//alani hesapla
		alan = yaricap * yaricap * 3.14159;
		
		cevre = 2 * yaricap * 3.14159;
		
		//alani yazdir
		System.out.println("yaricapi " + yaricap + " olan cemberin alani: " + alan + " dir");	
		System.out.println("yaricapi " + yaricap + " olan cemberin cevresi " + cevre + " dir");
	
	}

}
