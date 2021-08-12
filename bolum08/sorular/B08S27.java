package bolum08.sorular;

/*
 * (​Sütun sıralama) İki boyutlu bir dizinin sütun elemanlarını sıralayan aşağıdaki bildirime sahip bir
 * metot yazınız.  Ana dizi değişmeden kalacak, metot yeni diziyi geri döndürecek.
 * 
 * public static double​[][] sortColumns(​double​[][] m)
 * 
 * Kullanıcıdan 3*3 boyutunda bir matrisin elemanlarını alan ve sütunları sıralanmış diziyi gösteren bir
 * program yazınız.
 */
import java.util.Scanner;

public class B08S27 {

	public static void main(String[] args) {
		double[][] matris = matrisAl();
		
		double[][] matrisSirala = sutunlariSirala(matris);
		
		System.out.println("Satirlari sıralanmış dizi: ");
		
		for (int i = 0; i < matrisSirala.length; i++) {
			for (int j = 0; j < matrisSirala.length; j++) {
				System.out.print(matrisSirala[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static double[][] matrisAl() {
		Scanner girdi = new Scanner(System.in);
		
		double[][] m = new double[3][3];
		
		System.out.println("3X3 büyüklüğünde bir matris giriniz: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = girdi.nextDouble();
			}
		}
		return m;
	}
	
	public static double[][] sutunlariSirala(double[][] m) {
		
		double[][] d = new double[m.length][m[0].length];
		
		matrisiKopyala(m, d);
		
		for (int sutun = 0; sutun < d.length; sutun++) {
			for (int satir = 0; satir < d.length - 1; satir++) {
				
				double enKucuk = d[satir][sutun];
				int indeks = satir;
				for (int i = satir + 1; i < d.length; i++) {
					if (enKucuk > d[i][sutun]) {
						enKucuk = d[i][sutun];
						indeks = i;
					}
				}
				
				if (indeks != satir) {
					d[indeks][sutun] = d[satir][sutun];
					d[satir][sutun] = enKucuk;
				}
			}
		}
		
		return d;
	}

	public static void matrisiKopyala(double[][] orijinalMatris, double[][] kopya) {
	for (int i = 0; i < orijinalMatris.length; i++) {
		for (int j = 0; j < orijinalMatris[i].length; j++) {
			kopya[i][j] = orijinalMatris[i][j];
			}
		}
	}
	
}
