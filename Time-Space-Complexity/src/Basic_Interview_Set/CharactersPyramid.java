package Basic_Interview_Set;

public class CharactersPyramid {
	public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }
}



