package Basic_Interview_Set;

public class FibonacciSequence {
	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void printFibonacciSequence(int count) {
		System.out.println("Fibonacci Sequence :");

		for (int i = 0; i < count; i++) {
			System.out.println(fibonacci(i) + " ");
		}
	}

	public static void main(String[] args) {
		int count = 10;
		printFibonacciSequence(count);

	}

}
