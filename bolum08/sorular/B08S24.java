package bolum08.sorular;


/*
 * (​Sudoku çözümü doğru mu?) Madde 8.4 girilen rakamların geçerli olup olmadığını kontrol
 * ediyordu. Bu programı, her bir satır, sütun ve kutucukta olan sayıların 1’den 9’a kadar olup olmadığını
 * kontrol edecek şekilde yeniden yazınız.
 */
import java.util.Scanner;

public class B08S24 {

	public static void main(String[] args) {
		int[][] sudoku = cozumuAl();
		
		if (gecerliBirSudokuCozumuMu(sudoku)) {
			System.out.println("Geçerli bir sudoku çözümü");
		} else {
			System.out.println("Geçersiz bir sudoku çözümü");
		}
	}
	
	public static int[][] cozumuAl() {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Sudoku çözümünüzü giriniz: ");
		int[][] sudoku = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = girdi.nextInt();
			}
		}
		
		return sudoku;
	}
	public static boolean gecerliBirSudokuCozumuMu(int[][] sudoku) {
		if (gecerliSayiKontrolu(sudoku) == false) {
			return false;
		}
		
		if (satirKontrol(sudoku) == false) {
			return false;
		}
		
		if (sutunKontrol(sudoku) == false) {
			return false;
		}
		
		
		if (kutuKontrolu(sudoku)) {
			return false;
		}
		
		return true;
	}

	public static boolean gecerliSayiKontrolu(int[][] sudoku) {
		for (int satir = 0; satir < sudoku.length; satir++) {
			for (int sutun = 0; sutun < sudoku[satir].length; sutun++) {
				if(sudoku[satir][sutun] < 1 || sudoku[satir][sutun] > 9) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean satirKontrol(int[][] sudoku) {
		for (int satir = 0; satir < sudoku.length; satir++) {
			boolean[] kontrol = new boolean[9];
			for (int sutun = 0; sutun < sudoku.length; sutun++) {
				kontrol[sudoku[satir][sutun] - 1] = true;
			}
			
			for (boolean b : kontrol) {
				if (b == false) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean sutunKontrol(int[][] sudoku) {
		for (int sutun = 0; sutun < sudoku.length; sutun++) {
			boolean[] kontrol = new boolean[9];
			for (int satir = 0; satir < sudoku.length; satir++) {
				kontrol[sudoku[satir][sutun] - 1] = true;
			}
			
			for (boolean b : kontrol) {
				if (b == false) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean kutuKontrolu(int[][] sudoku) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				boolean[] kontrol = new boolean[9];
				for (int satir = i * 3; satir < i * 3 + 3; satir++) {
					for (int sutun = j * 3; sutun < j * 3 + 3; sutun++) {
						kontrol[sudoku[satir][sutun] - 1] = true;
					}
				}
				for (boolean b : kontrol) {
					if (b == false) {
						return false;
					}
				}
			}
		}
		return false;
	}
}

