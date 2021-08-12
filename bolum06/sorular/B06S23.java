package bolum06.sorular;

/*
 * (Bir karakterin tekrar sayısı) Belirlenen bir karakterin bir string içerisinde kaç defa bulunduğunu
 * bulan aşağıdaki bildirime sahip bir metot yazınız.
 * 
 * public static int ​count(String str, ​char ​a)
 * 
 * Örneğin, ​count(”Merhaba”, ‘a’)​ metodunun geri dönüş değeri ​2​’dir. Kullanıcıdan bir string ve arkasından
 * bir karakter girmesini isteyen ve girilen karakterin string içerisinde kaç defa tekrarlandığını kullanıcıya
 * gösteren bir test programı yazınız.
 */

import java.util.Scanner;

public class B06S23 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz ve bir harf belirtiniz Örn: Merhaba, a: ");
		String kelime = girdi.nextLine();
		
		int k = kelime.indexOf(", ");
		String str = kelime.substring(0, k);
		char ch = kelime.charAt(k + 2);
		
		System.out.println("Girilen kelime: " + str + "\nTekrar eden harf: " + ch + "\nTekrar sayısı:" + sayac(str,ch));
	}
	
	public static int sayac(String str, char a) {
		int sayac = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(a == str.charAt(i)) {
				sayac++;
			}
		}
		return sayac;
	}
}
