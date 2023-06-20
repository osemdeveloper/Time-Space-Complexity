package Basic_Interview_Set;

public class VowelPresence {
	
	public static boolean isVowelPresent(String str) {
		if (str == null)
			return false;
		
		String vowels = "aeiouAEIOU";
		 for(int i = 0; i< str.length(); i++) {
			 if(vowels.indexOf(str.charAt(i)) != -1)
				 return true;
		 }
		 
		 return false;
	}
	
	public static void main(String[] args) {
		String str = "Shrinivas";
		boolean isVowel = isVowelPresent(str);
		
		System.err.println("Given String :"+ str);
		
		if(str == "") {
			System.out.println("Please provide String!!");
		}else if(isVowel == true) {
			System.out.println("Yes,"+ isVowel+"."+" the vowel is present in the given string");
		} else {
			System.out.println("No,"+ isVowel+"."+" none of the vowels found in the string");
		} 
				
	}

}
