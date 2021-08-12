package bolum02.sorular;

/*
 * (Fizik: iniş mesafesi) İvmesi a ve iniş anındaki hızı v olan bir uçak için gerekli en az pist
 * mesafesini hesaplamak için aşağıdaki formülü kullanabilirsiniz :
 * 
 * 					 v^2
 * 				length = ---
 *  					  2a							
 * 
 * Kullanıcıdan hızı v (metre/saniye) ve ivmeyi a (metre/saniye kare) alan ve gerekli en az pist
 * mesafesini hesaplayan bir program yazınız.
 */

import java.util.Scanner;

public class B02S12 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("İniş mesafesini hesaplamak için uçağın hızını(m/s) ve ivmeyi(m/s) giriniz: ");
		
		double hiz = girdi.nextDouble();
		double ivme = girdi.nextDouble();
		
		double mesafe = (hiz * hiz) / (2 * ivme);
		System.out.println("Uçağın piste inmesi için gerekli minimum mesafe " + (int)(mesafe * 1000) / 1000.0);
	}

}
