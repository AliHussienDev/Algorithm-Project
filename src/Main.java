import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (n): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = scanner.nextInt();

                if (value <= -100 || value >= 100) {
                    System.out.println("Error: Value " + value + " is out of bounds (-100 < value < 100).");
                    return;
                }
                matrix[i][j] = value;
            }
        }

        int iterativeResult = calculateDifferenceIterative(matrix, n);
        System.out.println("\n--- Results ---");
        System.out.println("Iterative Algorithm Result: " + iterativeResult);

        int recursiveResult = calculateDifferenceRecursive(matrix, n, 0, 0, 0);
        System.out.println("Recursive Algorithm Result: " + recursiveResult);

        scanner.close();
    }

    // Algorithm 1: Iterative
    public static int calculateDifferenceIterative(int[][] matrix, int n) {
        int sumPrimary = 0;
        int sumSecondary = 0;

        for (int i = 0; i < n; i++) {
            sumPrimary = sumPrimary + matrix[i][i];
            sumSecondary = sumSecondary + matrix[i][n - 1 - i];
        }

        int difference = sumPrimary - sumSecondary;

        if (difference < 0) {
            difference = difference * -1;
        }

        return difference;
    }

    // Algorithm 2: Recursive
    public static int calculateDifferenceRecursive(int[][] matrix, int n, int currentRow, int sumPrimary, int sumSecondary) {
        if (currentRow == n) {
            int difference = sumPrimary - sumSecondary;
            
            if (difference < 0) {
                difference = difference * -1;
            }
            
            return difference;
        }

        int currentPrimary = sumPrimary + matrix[currentRow][currentRow];
        int currentSecondary = sumSecondary + matrix[currentRow][n - 1 - currentRow];

        return calculateDifferenceRecursive(matrix, n, currentRow + 1, currentPrimary, currentSecondary);
    }
}
