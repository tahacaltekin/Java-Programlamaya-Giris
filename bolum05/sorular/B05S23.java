package bolum05.sorular;


/*
 * (Yuvarlama hataları) Çok büyük sayılarla çok küçük sayılar aynı işlemde kullanıldığında yuvarlama
 * hataları oluşabilir. Büyük sayı küçük sayının değerini saf dışı bırakabilir. Örneğin, 100000000.0 + 0.000000001
 * işleminin sonucu 100000000.0​ dur. Yuvarlama hatalarından kaçınmak ve daha kesin sonuçlar elde etmek için
 * hesaplamanın sırasına dikkat etmelisiniz. Örneğin, aşağıdaki seriyi hesaplarken, sağdan sola işlem yapmak soldan
 * sağa doğru işlem yapmaktan daha kesin sonuçlar verecektir:
 * 
 * 1 + 1 / 2 +  1 / 3 + ... +  1 / n
 * 
 * Yukarıdaki seriyi n = 50000​ iken soldan sağa ve sağdan sola toplayıp sonuçları karşılaştıran bir program yazınız. 
 */
public class B05S23 {

	public static void main(String[] args) {
		double soldanSagaToplama = 0.0;
		
		for (double i = 1.0; i <= 50000.0; i++) {
			soldanSagaToplama += 1 / i;
			
		}
		
		System.out.println("Soldan sağa toplamanın sonucu: " + soldanSagaToplama);
		
		double sagdanSolaToplama = 0.0;
		
		for (double i = 50000.0; i >= 1.0; i--) {
			sagdanSolaToplama += 1 / i;
		}
		
		System.out.println("Sağdan sola toplamanın sonucu: " + sagdanSolaToplama);
		
		
		System.out.println("Sağdan sola toplamanın sonucu - " + "Soldan sağa toplamanın sonucu: " + (sagdanSolaToplama - soldanSagaToplama));
	}
}
