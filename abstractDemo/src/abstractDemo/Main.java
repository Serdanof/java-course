package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDatabaseManager();
		customerManager.getCustomers();

	}

}
// SOLID'in O'su: Sisteme yeni bir �zellik getirildi�inde mevcut kodun hi�bir yerine dokunamazs�n