package Basic_Interview_Set;

import java.util.*;

/* Time Complexity: O(n) - The time complexity is proportional to the size of the input list since we iterate through each element once.

Space Complexity: O(1) - The space complexity is constant since no additional memory is used beyond the input list.
*/
public class OddNumberCheck {
	public static boolean containsOnlyOddNumbers(List<Integer> numbers) {
		if (numbers == null || numbers.isEmpty())
			return false;

		for (int number : numbers) {
			if ((number & 1) != 1) // bit operation
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 3, 5, 7, 9);
		boolean containsOnlyOdd = containsOnlyOddNumbers(numbers);
		System.out.println("Numbers :" + numbers);
		System.out.println("Contains only odd numbers ? ," + containsOnlyOdd);
	}

}
