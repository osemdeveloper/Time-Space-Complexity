public class SpaceComplexityExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Example 1: Constant space complexity (O(1))
        printSum(numbers);

        // Example 2: Linear space complexity (O(n))
        reverse(numbers);
    }

    // Example 1: Constant space complexity (O(1))
    public static void printSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }

    // Example 2: Linear space complexity (O(n))
    public static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
            System.out.println(reversed[i]);
        }
        return reversed;
    }
}
