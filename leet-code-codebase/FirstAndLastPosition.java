import java.util.Scanner;
import java.util.Arrays;

public class FirstAndLastPosition {

    public static int[] findFirstAndLastPosition(int[] numbers, int target) {

        int size = numbers.length;
        int[] result = new int[2];

        // Find first position
        int low = 0, high = size - 1;
        int firstPosition = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (numbers[mid] == target) {
                if (mid > 0 && numbers[mid] == numbers[mid - 1]) {
                    high = mid - 1;
                } else {
                    firstPosition = mid;
                    break;
                }
            } else if (numbers[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Find last position
        int lastPosition = -1;
        low = 0;
        high = size - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (numbers[mid] == target) {
                if (mid + 1 < size && numbers[mid] == numbers[mid + 1]) {
                    low = mid + 1;
                } else {
                    lastPosition = mid;
                    break;
                }
            } else if (numbers[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        result[0] = firstPosition;
        result[1] = lastPosition;
        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter sorted array elements:");
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = scanner.nextInt();

        int[] answer = findFirstAndLastPosition(numbers, target);

        System.out.println("First and Last Position: " + Arrays.toString(answer));

        scanner.close();
    }
}
