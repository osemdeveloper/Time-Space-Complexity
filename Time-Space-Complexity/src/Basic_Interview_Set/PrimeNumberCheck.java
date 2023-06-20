package Basic_Interview_Set;

public class PrimeNumberCheck {

	public static boolean isNumberIsPrime(int number) {
		if (number <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int number = 27;
		boolean isPrime = isNumberIsPrime(number);

		if (isPrime == false) {
			System.out.println("The Number " + number + " is not Prime");
		} else {
			System.out.println("The Number " + number + " is Prime");
		}
	}

}
