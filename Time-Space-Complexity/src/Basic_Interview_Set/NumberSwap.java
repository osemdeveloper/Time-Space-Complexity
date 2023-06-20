package Basic_Interview_Set;

public class NumberSwap {
	public static void swapNumbers(int a, int b) {
		System.out.println("Before swapping :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// XORing a value twice with the same number will result in the original value.
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swapping :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void main(String[] args) {
		int a = 44;
		int b = 99;

		swapNumbers(a, b);
	}

}
