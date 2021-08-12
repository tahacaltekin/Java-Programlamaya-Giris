package bolum07.sorular;

/*
 * ​ (​Cebir: İkinci dereceden denklem çözümü) İkinci dereceden bir denklemi çözen, aşağıdaki bildirime
 * sahip bir metod yazınız.
 * 
 * public static int​ solveQuadratic(​double​[] eqn,​ double​[] roots)
 * 
 * İkinci dereceden  ​ax2​ +​ bx +​ c = 0 denkleminin sabitleri  ​eqn​ dizisine geçilecek ve gerçek kökleri
 * de roots dizisinde tutulacaktır. Metod gerçek köklerin sayısını geri döndürecektir. İkinci
 * dereceden denklemlerin çözümü için, Programlama Alıştırması 3.1’e bakınız.
 * Kullanıcıdan a, b, c değerlerini alan ve gerçek köklerin sayısını ve gerçek kökleri
 * gösteren bir program yazınız.
 */

import java.util.Scanner;

public class B07S25 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		double[] eqn = new double[3];
		double[] kok = new double[2];
		
		System.out.println("ikinci derece denklemin çözümü için a,b,c değerlerini giriniz: ");
		for (int i = 0; i < eqn.length; i++) {
			eqn[i] = girdi.nextDouble();
		}
		
		int kokSayisi = denkleminCozumu(eqn, kok);
		
		if(kokSayisi == 0) {
			System.out.println("Denklemin gerçek kökü yoktur");
		} else {
			for (int i = 0; i < kokSayisi; i++) {
				System.out.print("Kök " + (i + 1) + ": " + kok[i] + "\n");
			}
		}
	}
	
	
	public static int denkleminCozumu(double[] eqn, double[] kokler) {
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		
		int kokSayisi = 0;
		
		double diskrimanant = Math.pow(b, 2) - 4 * a * c;
		
		if(diskrimanant > 0) {
			kokler[0] = (-b + Math.pow(diskrimanant, 0.5)) / (2 * a);
			kokler[1] = (-b - Math.pow(diskrimanant, 0.5)) / (2 * a);
			kokSayisi = 2;
		}
		
		if(diskrimanant == 0) {
			
			kokler[0] = -b / (2 * a);
			kokSayisi = 1;
		}
		
		return kokSayisi;
	}
}
