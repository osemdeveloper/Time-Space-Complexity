package Basic_Interview_Set;

public class MaximumDifference {
	public static int maximumDifferences(int[] numbers) {
		if (numbers == null || numbers.length < 2)
			return 0;

		int maxDifference = Integer.MIN_VALUE;
		int minimumDifference = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			maxDifference = Math.max(maxDifference, numbers[i] - minimumDifference);
			minimumDifference = Math.min(minimumDifference, numbers[i]);

		}

		return maxDifference;
	}

	public static void main(String[] args) {
		int[] numbers = { 8, 4, 5, 67, 21, 86, 43, 65, 7, 0, 7 };
		int maxDifference = maximumDifferences(numbers);
		System.out.println("Maximum Difference: " + maxDifference);
	}

}
