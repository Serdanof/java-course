package abstractClasses;

public abstract class GameCalculator {
	// abstract olursa overwrite edilmesi zorunlu
	// abstarct classlar asla newlenemez
	public abstract void hesapla();

	// final olursa overwrite edilemez, oldu�u gibi kullan�l�r
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
