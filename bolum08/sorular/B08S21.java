package bolum08.sorular;

/*
 * (​Merkez şehir) Verilen şehirler arasında, diğer şehirlere mesafelerin toplamı en küçük olan şehir,
 * merkez şehirdir. Kullanıcıdan şehir sayını ve şehirlerin konumlarını (koordinat) alan, merkez şehri ve
 * onun diğer şehirlere olan toplam mesafesini gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B08S21 {

	public static void main(String[] args) {
		int sehirSayisi = sehirSayisiniAl();
		double[][] sehirKoordinatlari = sehirKoordinatlariniAl(sehirSayisi);
		double[] merkezSehir = merkezSehirAl(sehirKoordinatlari);
		sehirBilgisiniYazdir(merkezSehir);
	}
	
	public static void sehirBilgisiniYazdir(double[] merkezSehir) {
		final int X_KOORDINATI = 0;
		final int Y_KOORDINATI = 1;
		final int MESAFE = 2;
		
		System.out.println("Merkez şehir koordinatları: (" + merkezSehir[X_KOORDINATI] + ", " + merkezSehir[Y_KOORDINATI] + ")");
		System.out.printf("Diğer şehirler ile arasındaki toplam mesafe %.2f", merkezSehir[MESAFE]);
	}
	
	public static double[] merkezSehirAl(double[][] sehirKoordinatlari) {
		double sehirlerArasiToplamMesafe = 0;
		final int X_KOORDINATI = 0;
		final int Y_KOORDINATI = 1;
		final int MESAFE = 2;
		double[] merkezSehir = new double[3];
		for (double[] sehirKoordinati : sehirKoordinatlari) {
			sehirlerArasiToplamMesafe += Math.sqrt(Math.pow(sehirKoordinati[X_KOORDINATI] - sehirKoordinatlari[0][X_KOORDINATI], 2) + 
					Math.pow(sehirKoordinati[Y_KOORDINATI] - sehirKoordinatlari[0][Y_KOORDINATI], 2));
		}
		
		merkezSehir[X_KOORDINATI] = sehirKoordinatlari[0][X_KOORDINATI];
		merkezSehir[Y_KOORDINATI] = sehirKoordinatlari[0][Y_KOORDINATI];
		merkezSehir[MESAFE] = sehirlerArasiToplamMesafe;
		
		for (int i = 1; i < sehirKoordinatlari.length; i++) {
			sehirlerArasiToplamMesafe = 0;
			
			for (double[] sehirKoordinati : sehirKoordinatlari) {
				sehirlerArasiToplamMesafe += Math.sqrt(Math.pow(sehirKoordinati[X_KOORDINATI] - sehirKoordinatlari[i][X_KOORDINATI], 2) + 
						Math.pow(sehirKoordinati[Y_KOORDINATI] - sehirKoordinatlari[i][Y_KOORDINATI], 2));
			}
			
			if(merkezSehir[MESAFE] > sehirlerArasiToplamMesafe) {
				merkezSehir[X_KOORDINATI] = sehirKoordinatlari[i][X_KOORDINATI];
				merkezSehir[Y_KOORDINATI] = sehirKoordinatlari[i][Y_KOORDINATI];
				merkezSehir[MESAFE] = sehirlerArasiToplamMesafe;
			}
		}
		
		return merkezSehir;
	}
	
	public static double[][] sehirKoordinatlariniAl(int sehirSayisi) {
		final int X_KOORDINATI = 0;
		final int Y_KOORDINATI = 1;
		double[][] sehirKoordinatlari = new double[sehirSayisi][2];
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Şehirlerin koordinatlarını giriniz: ");
		for (int i = 0; i < sehirSayisi; i++) {
			sehirKoordinatlari[i][X_KOORDINATI] = girdi.nextDouble();
			sehirKoordinatlari[i][Y_KOORDINATI] = girdi.nextDouble();
		}
		
		return sehirKoordinatlari;
	}
	
	public static int sehirSayisiniAl() {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Şehir sayısını giriniz: ");
		return girdi.nextInt();
	}
}
