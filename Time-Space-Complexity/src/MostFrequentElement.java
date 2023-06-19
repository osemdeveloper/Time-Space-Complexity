import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
	
	public static int findMostFrequent(int[] array) {
		
		//Create a Hashmap to store the frequency of each element
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		
		//Iterate over the array and update the frequency count
		for(int num: array) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0));
		}
		
		//Find the element with the highest count
		int mostFrequent = array[0];
		int highestFrequency = 0;
		for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()) {
			if(entry.getValue() > highestFrequency) {
				mostFrequent = entry.getKey();
				highestFrequency = entry.getValue();
			}
		}
		
		return mostFrequent;
	}

	public static void main(String[] args) {
		
		int[] array = {11, 11, 11, 9, 1, 11, 6, 2, 5, 11, 8, 3, 4, 11, 7, 10, 2, 6, 1, 9};
		int mostFrequent = findMostFrequent(array);
		System.out.println("Most frequent element => "+ mostFrequent);
		

	}

}
