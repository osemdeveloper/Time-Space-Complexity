package Basic_Interview_Set;

import java.util.Arrays;

public class MultiArrayEqualityCheck {

	private static boolean checkArraysEquality(int[]... arrays) {
		// sort each array
		for (int[] array : arrays) {
			Arrays.sort(array);
		}

		// compare the sorted arrays
		for (int i = 1; i < arrays.length; i++) {
			if (!Arrays.equals(arrays[0], arrays[i])) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 3, 2, 5, 1, 4 };
		int[] array3 = { 2, 1, 3, 5, 4 };
		int[] array4 = { 4, 5, 2, 1, 3 };
		
		boolean  allAreEqual= checkArraysEquality(array1, array2, array3, array4);
		
		if(allAreEqual) {
			System.out.println(" All arrays have the same elements");
		} else {
			System.out.println(" All arrays do not have the same elements");
		}
		
	}
}
