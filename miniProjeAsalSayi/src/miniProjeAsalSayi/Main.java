package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;

		if (number == 1) {
			System.out.println(number + ": Asal Say� De�ildir");
			return;
		}

		if (number < 1) {
			System.out.println(number + ": Ge�ersiz Say�d�r");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println(number + ": Asal Say�d�r");
		} else {
			System.out.println(number + ": Asal Say� De�ildir");
		}

	}

}
