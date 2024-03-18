import java.util.Arrays;
import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] A = new int[n];
        
        System.out.println("Enter the elements of the array (must be integers greater than 0 and less than 100):");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        
        String result = findFirstAndSecondLargest(A);
        System.out.println(result);
        
        result = sortArrayAscending(A);
        System.out.println(result);
        
        System.out.print("Enter an integer x: ");
        int x = scanner.nextInt();
        insertAndSort(A, x);
        System.out.println(result);

    }

    public static String findFirstAndSecondLargest(int[] A) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int indexMax1 = -1;
        int indexMax2 = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1;
                indexMax2 = indexMax1;
                max1 = A[i];
                indexMax1 = i;
            } else if (A[i] > max2) {
                max2 = A[i];
                indexMax2 = i;
            }
        }

        return "The first largest element is " + max1 + " (index " + indexMax1 + ")\n" +
               "The second largest element is " + max2 + " (index " + indexMax2 + ")";
    }

    public static String sortArrayAscending(int[] A) {
        Arrays.sort(A);
        return "Array after sorting in ascending order:\n" + Arrays.toString(A);
    }

    public static void insertAndSort(int[] A, int x) {
        int i = A.length - 1;

        while (i >= 0 && A[i] > x) {
            A[i + 1] = A[i];
            i--;
        }
   
        A[i + 1] = x;
      
        Arrays.sort(A, 0, i + 2);
    }
}
