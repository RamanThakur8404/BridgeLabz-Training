import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // taking input from user
        System.out.print("Enter number of rows and columns: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
		int min = 0, max = 9;

        // Create random matrices
        int[][] matrixA = createRandomMatrix(rows, columns,min,max);
        int[][] matrixB = createRandomMatrix(rows, columns,min,max);
        displayMatrix(matrixA, "Matrix A");
        displayMatrix(matrixB, "Matrix B");
        int[][] sum = addMatrices(matrixA, matrixB);
        displayMatrix(sum, "Addition of A and B");
        int[][] difference = subtractMatrices(matrixA, matrixB);
        displayMatrix(difference, "Subtraction of A and B");
        if (columns == rows) {
            int[][] product = multiplyMatrices(matrixA, matrixB);
            displayMatrix(product, "Multiplication of A and B");
        } else {
            System.out.println("\nMatrix multiplication not possible for given dimensions.");
        }
    }
	 // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int columns, int min, int max) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * (max - min + 1)) + min;
            }
        }
        return matrix;
    }

    //method to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++){
            for (int j = 0; j < colsB; j++) {
                result[i][j] += matrixA[i][k] * matrixB[k][j];
            }
        }
    return result;
    }

    // method to display a matrix
    public static void displayMatrix(int[][] matrix, String title) {
		for (int value : row) {
            System.out.print(value + "\t");
		}
       System.out.println();
    }
 }
}