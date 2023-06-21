package Basic_Interview_Set;

import java.math.BigInteger;
/*The time complexity of the algorithm is still O(n) as it iterates n times in the loop.

The space complexity has increased to O(log n) as the BigInteger objects are created to store the factorial result, and the space required depends on the number of digits in the result.*/

public class Factorial {
	
	public static BigInteger findFactorial (int number) {
		if(number < 0) {
			throw new IllegalArgumentException("Factorial is not defined for -ve");
			
		}
		
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i<= number; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		return result;
			
	}
	
	public static void main(String[] args) {
		int number = 44;
		BigInteger factorialOfNumber = findFactorial(number);
		
		System.out.println("Given Number :"+number);
        System.err.println("Factorial is "+factorialOfNumber);
	}

}
