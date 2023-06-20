package Basic_Interview_Set;

import java.util.*;

public class FirstNonRepeatingCharacter {
	public static char firstNonRepeatingCharacter(String str) {
		if (str == "" || str.isEmpty())
			return '\0';

		Map<Character, Integer> charCount = new HashMap<>();

		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		for (char c : str.toCharArray()) {
			if (charCount.get(c) == 1)
				return c;
		}

		return '\0';
	}

	public static void main(String[] args) {
		String str = "om bagavate vasudevaya namah";
		char firstNonRepeatingChar = firstNonRepeatingCharacter(str);
		System.out.println("First non repeating character :" + firstNonRepeatingChar);
	}

}
