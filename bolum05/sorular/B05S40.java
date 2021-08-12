package bolum05.sorular;

/*
 * (Sim�lasyon : yaz��tura) 1 milyon kez yaz� tura atmay� simule eden ve toplam yaz��tura say�lar�n� g�steren
 * bir program yaz�n�z.
 */

public class B05S40 {

	public static void main(String[] args) {
		int yazi;
		int tura;
		int para;
		
		yazi = tura = 0;
		
		System.out.println("Paray� 1 milyon kere atarsak ");
		
		for (int i = 0; i < 1000000; i++) {
			para = ((int)(Math.random() * 2) == 0 ? yazi++ : tura++);
		}
		
		System.out.println("tura say�s�: " + tura + 
				"\nyaz� say�s�: " + yazi);
	}
}
