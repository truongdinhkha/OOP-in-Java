import java.util.Scanner;

public class Bai5 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to find: ");
        int n = scanner.nextInt();
        

        System.out.print("The first Fibonacci numbers are: ");
        printFibonacci(n);
    }

    public static StringBuilder printFibonacci(int n) {
        int first = 0;
        int second = 1;
        StringBuilder result= new StringBuilder();
        if (n >= 1) {
            System.out.print(first + " ");
            result.append(first).append(' ');
        }
        if (n >= 2) {
            System.out.print(second + " ");
            result.append(second).append(' ');
        }

        for (int i = 2; i < n; i++) {
            int current = first + second;
            System.out.print(current + " ");
            first = second;
            second = current;
            result.append(current).append(' ');
        }

        return result;
    }
}
