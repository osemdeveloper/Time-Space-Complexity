public class TimeComplexity {
	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Linear time complexity (O(n))
		printNumbers(numbers);
		
		//Quadratic time complexity (O(n^2))
		printNumberPairs(numbers);

	}

	// Linear time complexity (O(n))
	public static void printNumbers(int[] numbers) {
		for (int number : numbers) {
			System.out.println("numbers :" + number);
		}
	}
	
	// Quadratic time complexity (O (n^2)
	public static void printNumberPairs(int[] numbers) {
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j< numbers.length; j++) {
				System.out.println("number pairs :"+ numbers[i] +'&'+ numbers[j]);
			}
		}
	}
}
