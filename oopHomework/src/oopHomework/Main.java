package oopHomework;

public class Main {

	public static void main(String[] args) {
		// �zellik nesnesi 1: �st men�
		// �zellik nesnesi 2: E�itimler alan�
		// i� s�n�f�: Men� d�zenleme alan�

		// �zellik nesnesi 1 i�in:

		JavaCampProperty javaCampProperty1 = new JavaCampProperty(1, "C# + ANGULAR", "2 ay s�recek...", "Engin Demiro�",
				0);
		JavaCampProperty javaCampProperty2 = new JavaCampProperty(2, "JAVA + REACT", "2 ay s�recek...", "Engin Demiro�",
				0);
		JavaCampProperty javaCampProperty3 = new JavaCampProperty(3, "Temel Kurs", "PYTHON, JAVA...", "Engin Demiro�",
				0);

		JavaCampProperty[] javaCampProperties = { javaCampProperty1, javaCampProperty2, javaCampProperty3 };

		for (JavaCampProperty javaCampProperty : javaCampProperties) {
			System.out.println(javaCampProperty.name + " isimli e�itim, " + javaCampProperty.creator
					+ " taraf�ndan haz�rlanm��t�r.");
		}

		System.out.println("------------------");
		
		// �zellik nesnesi 2 i�in:

		Menu menu1 = new Menu(1, "Kampa Haz�rl�k");
		Menu menu2 = new Menu(2, "S�k Sorulan Sorular");
		Menu menu3 = new Menu(3, "Giri� Yap");
		Menu menu4 = new Menu(4, "Kay�t Ol");

		Menu[] menus = { menu1, menu2, menu3, menu4 };

		for (Menu menu : menus) {
			System.out.println("Burada bir men� bile�eni olarak " + menu.name + " yer almaktad�r.");
		}

		System.out.println("------------------");
		
		// i� s�n�f� i�in:
		
		MenuManager menuManager = new MenuManager();
		menuManager.changeVisibility(menu1);
		menuManager.changePriorty(menu2);

	}

}
