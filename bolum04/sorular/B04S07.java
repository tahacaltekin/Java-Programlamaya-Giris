package bolum04.sorular;

/*
 * 7 ​(Köşe noktası koordinatları) Beşgenin, merkezinin (0, 0) ve Şekil 4.7c gösterildiği gibi bir köşe
 * noktasının saat 12 (0) pozisyonunda olduğunu varsayalım. Kullanıcıdan beşgenin çevrel çemberin
 * yarıçapını alan ve beş köşe noktasının  da koordinatlarını gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B04S07 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Beşgenin yarıçapını giriniz: ");
		double yariCap = girdi.nextDouble();
		
		double aciArtisi = Math.toRadians(360 / 5.0);
		
		double aci1 = aciArtisi;
		double aci2 = aciArtisi * 2;
		double aci3 = aciArtisi * 3;
		double aci4 = aciArtisi * 4;
		double aci5 = aciArtisi * 5;
		
		System.out.println("Beş kenarın kooradinatları: ");
		System.out.printf("(%.4f, %.4f)\n", yariCap * Math.sin(aci1), yariCap * Math.cos(aci1));
		System.out.printf("(%.4f, %.4f)\n", yariCap * Math.sin(aci2), yariCap * Math.cos(aci2));
		System.out.printf("(%.4f, %.4f)\n", yariCap * Math.sin(aci3), yariCap * Math.cos(aci3));
		System.out.printf("(%.4f, %.4f)\n", yariCap * Math.sin(aci4), yariCap * Math.cos(aci4));
		System.out.printf("(%.4f, %.4f)\n", yariCap * Math.sin(aci5), yariCap * Math.cos(aci5));
	}
}
