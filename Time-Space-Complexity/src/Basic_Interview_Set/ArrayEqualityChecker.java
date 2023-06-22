package Basic_Interview_Set;

import java.util.Arrays;

public class ArrayEqualityChecker {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 5, 6, 87 };
		int[] array2 = { 34, 56, 98, 75, 87 };
		
		boolean areEqual = checkArrayEquality(array1, array2);
		if(areEqual) {
			System.out.println(" the arrays contain the same elements");
		}else {
			System.out.println(" Arrays do not contain same elements");
		}
	

	}
	
	private static boolean checkArrayEquality(int[] array1, int[] array2) {
		//sort arrays
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		//Compare the sorted arrays
		return Arrays.equals(array1, array2);
	}

}
