package Basic_Interview_Set;

public class StringReverse_StringBuilder {
	public static String reverseString(String str) {
		if (str == null)
			return null;

		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String str = "I am reversing the String using the string builder approach";
		String reversed = reverseString(str);

		
		System.out.println("Reversed String :" + reversed);
		System.err.println("Original String :" + str);
	}

}
