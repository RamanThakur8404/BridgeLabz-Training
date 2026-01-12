import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {

    public static void moveZeroes(int[] numbers) {
        int insertIndex = 0;

        // Move non-zero elements forward
        for (int value : numbers) {
            if (value != 0) {
                numbers[insertIndex++] = value;
            }
        }

        // Fill remaining positions with zero
        while (insertIndex < numbers.length) {
            numbers[insertIndex++] = 0;
        }
    }

    // Main method for testing
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        moveZeroes(numbers);

        System.out.println("Array after moving zeroes: " + Arrays.toString(numbers));

        scanner.close();
    }
}
