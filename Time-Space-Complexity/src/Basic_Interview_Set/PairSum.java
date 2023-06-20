package Basic_Interview_Set;

import java.util.*;

public class PairSum {
	public static List<List<Integer>> findPairs(int[] numbers, int target) {
		List<List<Integer>> result = new ArrayList<>();
		if (numbers == null || numbers.length < 2)
			return result;

		Map<Integer, Integer> numbersCount = new HashMap<>();

		for (int number : numbers) {
			int complement = target - number;
			if (numbersCount.containsKey(complement)) {
				List<Integer> pair = new ArrayList<>();
				pair.add(complement);
				pair.add(number);
				result.add(pair);
			}

			numbersCount.put(number, numbersCount.getOrDefault(number, 0) + 1);

		}

		return result;

	}

	public static void main(String[] args) {
		int[] numbers = { 2, 5, 6, 1, 8, 3, 0, 4, 3, 6, 1 };
		int target = 9;
		List<List<Integer>> pairs = findPairs(numbers, target);

		System.out.println("Pairs with sum : " + target + ":");
		for (List<Integer> pair : pairs) {
			System.out.println(pair);
		}
	}

}
