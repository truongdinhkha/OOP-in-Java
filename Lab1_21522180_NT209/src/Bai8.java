public class Bai8 {
    public static void main(String[] args) {
        System.out.print("Prime numbers with 5 digits are:");
        System.out.println(listPrimeNumbers());
    }
    public static StringBuilder listPrimeNumbers() {
        StringBuilder a = new StringBuilder();
        for (int i = 10001; i <= 99999; i += 2) {
            if (isPrime(i)) {
                a.append(i).append(", ");
            }
        }
        if (a.length() > 0) {
            a.deleteCharAt(a.length() - 1);
        }
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
