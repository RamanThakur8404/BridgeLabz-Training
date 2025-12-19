import java.util.Scanner;

public class TwoDArrayToOneD {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        // Take input from user, create 2D array
        System.out.print("Enter number of rows: ");
        int rows = read.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = read.nextInt();
        int[][] matrix = new int[rows][columns];
		int[] array = new int[rows * columns];

        // Take input for 2D array
        System.out.println("Enter elements of the two dimensional array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = read.nextInt();
            }
        }
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // print the result , close scanner
        System.out.println("Elements of the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        read.close();
    }
}
