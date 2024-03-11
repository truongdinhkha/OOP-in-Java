import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer n: ");
        int n = scanner.nextInt();
        if (isPrime(n))
        System.out.print("Decompose the number " + n + " into prime factors: "+n+" * 1 ");
    
        else{
        System.out.print("Decompose the number " + n + " into prime factors: ");
        System.out.println(factorize(n));
        }
       
    }
    public static String factorize(int n) {
        StringBuilder factors = new StringBuilder();
        int divisor = 2;

        while (n > 1) {
            if (n % divisor == 0) {
                factors.append(divisor).append(" * ");
                n /= divisor;
            } else {
                divisor++;
            }
        }
        if (factors.length() > 0) {
            factors.deleteCharAt(factors.length() - 2);
        }
        return factors.toString();
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
