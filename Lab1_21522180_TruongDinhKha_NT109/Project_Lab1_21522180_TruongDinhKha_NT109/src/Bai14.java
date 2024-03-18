import java.util.Scanner;

public class Bai14 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of columns (m): ");
        int m = scanner.nextInt();

        // Input matrix elements
        int[][] matrix = new int[n][m];
        System.out.println("Enter the elements of the matrix (positive integers less than 100):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // a) Find the largest element and its index
        int maxElement = matrix[0][0];
        int rowIndex = 0, colIndex = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        System.out.println("The largest element is " + maxElement + " at position (" + rowIndex + ", " + colIndex + ")");

        // b) Find and print prime elements of the matrix
        System.out.println("Prime elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPrime(matrix[i][j])) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        // c) Sort columns of the matrix in ascending order
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n - 1; i++) {
                for (int k = 0; k < n - i - 1; k++) {
                    if (matrix[k][j] > matrix[k + 1][j]) {
                        int temp = matrix[k][j];
                        matrix[k][j] = matrix[k + 1][j];
                        matrix[k + 1][j] = temp;
                    }
                }
            }
        }

        // Print sorted matrix
        System.out.println("Matrix after sorting columns:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // d) Find the column with the most prime numbers
        int maxPrimeCount = 0;
        int maxPrimeColumn = -1;
        for (int j = 0; j < m; j++) {
            int primeCount = 0;
            for (int i = 0; i < n; i++) {
                if (isPrime(matrix[i][j])) {
                    primeCount++;
                }
            }
            if (primeCount > maxPrimeCount) {
                maxPrimeCount = primeCount;
                maxPrimeColumn = j;
            }
        }
        if (maxPrimeColumn != -1) {
            System.out.println("Column with the most prime numbers is column " + maxPrimeColumn);
        } else {
            System.out.println("No prime numbers found in any column.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
