package inheritance2;

public class CustomerManager {
	public void add() {
		// m��teri ekleme kodlar�
		// bir i� yapan s�n�f, ba�ka bir i� yapan s�n�f� kullanacaksa, asla somut
		// s�n�ftan gidilmez. bunlar asla new'lenmemeli.
		System.out.println("M��teri eklendi.");
		DatabaseLogger logger = new DatabaseLogger(); //bu kullan�m yanl��
		logger.log();
	}
		public void add2(Logger logger) {
			// m��teri ekleme kodlar�
			System.out.println("M��teri eklendi.");
			logger.log();
		}
}
