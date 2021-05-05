package staticDemo;
// ara� amac�yla kullan�lanacak yap�larda static kullan�labilir
// static methodlar class ismiyle direkt �a��r�l�r.
// manager s�n�flar� hi�bir zaman static yap�lmaz
public class ProductManager {
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("�r�n bilgileri ge�ersizdir");
		}
	}
	
}
