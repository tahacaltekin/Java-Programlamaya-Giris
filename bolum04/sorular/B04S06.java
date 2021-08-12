package bolum04.sorular;

/*
 * (Çember üzerinde rastgele noktalar) Merkezi (0, 0) ve yarýçapý 40 olan bir çember üzerinde üç
 * tane rastgele nokta üretiniz ve Þekil 4.7a daki gibi bu noktalarýn oluþturduðu üçgenin açýlarýný gösteriniz.
 * (Ýpucu: Þekil 4.7b ‘de gösterildiði gibi 0 ­ 2 pi aralýðýnda radyan cinsinden rastgele bir açý üretiniz ve bu
 * açýya denk gelen noktayý  (r*cos(a), r*sin(a)) formülü ile hesaplayýnýz.
 */

public class B04S06 {

	public static void main(String[] args) {
		final double RADIUS = 40;
		
		double aci1 = Math.random() * (2 * Math.PI);
		double aci2 = Math.random() * (2 * Math.PI);
		double aci3 = Math.random() * (2 * Math.PI);
		
		double x1 = RADIUS * Math.cos(aci1);
		double y1 = RADIUS * Math.sin(aci1);
		double x2 = RADIUS * Math.cos(aci2);
		double y2 = RADIUS * Math.sin(aci2);
		double x3 = RADIUS * Math.cos(aci3);
		double y3 = RADIUS * Math.sin(aci3);	
		
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		double aciA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double aciB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double aciC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		
		System.out.println("3 açý eþittir = " + 
					Math.round(aciA * 100) / 100.0 + " " + 
					Math.round(aciB * 100) / 100.0 + " " +
					Math.round(aciC * 100) / 100.0);
	}
}
