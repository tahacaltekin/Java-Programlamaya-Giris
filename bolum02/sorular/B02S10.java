package bolum02.sorular;

/*
 * (​Bilim: Enerji hesaplama) Belli miktar suyu, başlangıç sıcaklığından belirlenen sıcaklığa
 * çıkarmak için gerekli enerjiyi hesaplayan bir program yazınız. Programınız kullanıcıdan su
 * miktarını (kilogram), başlangıç ve hedef sıcaklığı alacak. Enerjiyi hesaplamak için
 * kullanabileceğiniz formül:
 * 
 * Q = M * (sonSicaklik – ilkSicaklik) * 4184
 * 
 * M​ kilogram cinsinden suyun ağırlığı, sıcaklık santigrat derece cinsinden, ve​ Q​ joule cinsinden
 * enerjiyi gösterir.
 */

import java.util.Scanner;

public class B02S10 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("Enerjiyi hesaplamak için su miktarını (kg),başlangış sıcaklığını ve ulaşması gereken hedef sıcaklığı giriniz: ");

		double suMiktari = girdi.nextDouble();
		double ilkSicaklik = girdi.nextDouble();
		double sonSicaklik = girdi.nextDouble();
		
		double enerji = (suMiktari * (sonSicaklik - ilkSicaklik)) * 4184;
		System.out.println("Girilen Su miktarının belirtilen son sıcaklığa ulaştığında ki enerjisi: " + (int)(enerji * 1000) / 1000.0);
	}
}
