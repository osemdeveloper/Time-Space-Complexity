package Basic_Interview_Set;

/* The time complexity of this approach is O(n), where n is the length of the string. This is because we need to iterate through half of the string to compare characters from both ends.

The space complexity is O(1) since we only use a constant amount of extra space for the left and right pointers.*/

public class PalindromeCheck {
	
	public static boolean isPalindrome(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}

		
		int left = 0;
		int right = str.length() -1;
		
		while(left< right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		 String str = "gadag";
		 boolean isPalindromeString = isPalindrome(str);
		 
		 System.out.println("String palindrome? :"+ isPalindromeString);
	}

}
