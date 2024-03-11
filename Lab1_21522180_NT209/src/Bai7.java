import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
      

        System.out.println("Smaller prime numbers " + n + " iss:");
        System.out.print(listPrimeNumbers(n));
    }
    public static StringBuilder listPrimeNumbers(int n) {
        StringBuilder a = new StringBuilder();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                a.append(i).append(' ');
            }
        }
        System.out.println();
        return a;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
