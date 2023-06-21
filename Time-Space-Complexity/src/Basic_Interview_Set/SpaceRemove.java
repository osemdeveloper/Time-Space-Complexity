package Basic_Interview_Set;
/* The time complexity of the replaceAll() method in this case is O(n), where n is the length of the string. The method scans the entire string to find and replace spaces.

The space complexity is also O(n), as the method creates a new string with the spaces removed. The space required is proportional to the length of the input string.*/

public class SpaceRemove {

	public static String spaceRemoval(String str) {
		String ifNoStringProvided = "Please provide a String";
		if (str == null || str.isEmpty()) {
			return ifNoStringProvided;
		}

		return str.replaceAll("\\s", "");

	}

	public static void main(String[] args) {
		String str = "";
		String afterSpaceRemoval = spaceRemoval(str);
		System.out.println("After space removal :" + afterSpaceRemoval);
	}

}
