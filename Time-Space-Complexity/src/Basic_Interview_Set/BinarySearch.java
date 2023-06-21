package Basic_Interview_Set;

/* The time complexity of binary search is O(log n), where n is the size of the array. Since the search space is halved at each step, the algorithm quickly converges to the target value. This makes binary search very efficient for large sorted arrays.

The space complexity of binary search is O(1) as it only uses a constant amount of extra space to store the variables for indices and target comparisons.*/

public class BinarySearch {
	
	public static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(array[mid] == target) {
				return mid; // target found at index mid
			} else if(array[mid] < target) {
				left = mid+1; // search in right half
			} else {
				right = mid - 1; // search in left half
			}
		}
		
		return -1; // Target not found
	}
	
	public static void main(String[] args) {
		int[] array = {1,3,5,7,9,11,13,15};
		int target = 23;
		
		int result = binarySearch(array, target);
		
		if (result != -1) {
			System.out.println("Target found at index : " + result);
		} else {
			System.out.println("Target not found");
		}
		
	}

}
