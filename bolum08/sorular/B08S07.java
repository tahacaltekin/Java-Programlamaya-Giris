package bolum08.sorular;

/*
 * (​Birbirine en yakın noktalar) Madde 8.3 ‘de; iki boyutlu uzayda birbirine en yakın iki noktayı bulan
 * bir program bulunmaktadır. Bu programı üç boyutlu uzayda birbirine en yakın iki noktayı bulacak
 * şekilde düzenleyiniz. Noktaları saklamak için iki boyutlu bir dizi kullanınız. Aşağıda verilen noktaları
 * kullanarak programınızı test ediniz.
 * double​[][] points = {{​­1​, ​0​, ​3​}, {​­1​, ​­1​, ​­1​}, {​4​, ​1​, ​1​}, {​2​, ​0.5​, ​9​}, {​3.5​, ​2​, ​­1​}, {​3​, ​1.5​, ​3​}, {​­1.5​, ​4​, ​2​}, {​5.5​, ​4​, ​­0.5​}};
 * ​ (x1, y1, z1) ​ve ​(x2, y2, z2) ​gibi iki nokta arasındaki mesafeyi hesaplamak için 2(​x2 ​­ ​x1​)​2 ​+ (​y2 ​­ ​y1​)​2 ​+ (​z2 ​­ ​z1​)​2​.
 * formülü kullanılabilir.
 */

public class B08S07 {

	public static void main(String[] args) {
		
		double[][] noktalar = {
				{-1, 0, 3}, {-1, -1, -1}, 
				{4, 1, 1}, {2, 0.5, 9}, 
				{3.5, 2, -1}, {3, 1.5, 3}, 
				{-1.5, 4, 2}, {5.5, 4, -0.5}};
		
		
		int p1 = 0;
		int p2 = 1;
		int p3 = 3;
		
		double enKisaMesafe = mesafe(noktalar[p1][0], noktalar[p1][1], noktalar[p1][2], 
				noktalar[p2][0], noktalar[p2][p1], noktalar[p3][p2]);
		
		
		for (int i = 0; i < noktalar.length; i++) {
			for (int j = i + 1; j < noktalar.length; j++) {
				double mesafe = mesafe(noktalar[i][0], noktalar[i][1], noktalar[i][2], 
						noktalar[j][0], noktalar[j][1], noktalar[j][2]);
				
				if(enKisaMesafe > mesafe) {
					p1 = i;
					p2 = j;
					enKisaMesafe = mesafe;
				}
			}
		}
		
		System.out.println("En yakın noktalar: " + "(" + noktalar[p1][0] + ", " + noktalar[p1][1] + ") ve (" + 
							noktalar[p2][0] + ", " + noktalar[p2][1] + ")");
	}
	
	
	public static double mesafe(double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
