package Basic_Interview_Set;

public class StringReverse_Recursion {
	public static String reverseString(String str) {
		if (str == null || str.length() <= 1)
			return str;

		return reverseString(str.substring(1)) + str.charAt(0);

	}

	public static void main(String[] args) {
		String str = "I am reversing the string using recursion";
		String reversed = reverseString(str);

		System.out.println("Original String :" + str);
		System.err.println("Reversed String :" + reversed);
	}

}
