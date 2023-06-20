package Basic_Interview_Set;
import java.util.*;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] numbers) {
		if (numbers == null || numbers.length == 0)
			return 0;

		HashSet<Integer> set = new HashSet<>();

		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (!set.contains(numbers[i])) {
				set.add(numbers[i]);
				numbers[index] = numbers[i];
				index++;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 6, 5, 2, 5, 3, 9, 6, 3, 0 };
		int newLength = removeDuplicates(nums);
		System.out.println("New Length :" + newLength);
		System.out.println("Array after removing duplicates :");
		for (int i = 1; i < newLength; i++) {
			System.out.println(nums[i] + " ");
		}
	}

}
