package bolum04.sorular;

/*
 * (�ember �zerinde rastgele noktalar) Merkezi (0, 0) ve yar��ap� 40 olan bir �ember �zerinde ��
 * tane rastgele nokta �retiniz ve �ekil 4.7a daki gibi bu noktalar�n olu�turdu�u ��genin a��lar�n� g�steriniz.
 * (�pucu: �ekil 4.7b �de g�sterildi�i gibi 0 � 2 pi aral���nda radyan cinsinden rastgele bir a�� �retiniz ve bu
 * a��ya denk gelen noktay�  (r*cos(a), r*sin(a)) form�l� ile hesaplay�n�z.
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
		
		System.out.println("3 a�� e�ittir = " + 
					Math.round(aciA * 100) / 100.0 + " " + 
					Math.round(aciB * 100) / 100.0 + " " +
					Math.round(aciC * 100) / 100.0);
	}
}
