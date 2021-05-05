package interfaces2;

public class Main {

	public static void main(String[] args) {
		// bir class birden fazla interface i implement edebiliyor, 1 class'� extend edebilir
		// 3 temel katman var, aray�z, i�, veri eri�im katmanlar�. katmanlar aras� ge�i�ler genellikle ba��ml�l�klar� �nlemek i�in interface ile yap�l�r.
		// interface newlenemez!
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();

	}

}
