import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of characters:");
        String input = scanner.nextLine();
        scanner.close();

        int wordCount = countWords(input);
        System.out.println("The number of words in the string is: " + wordCount);
    }
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        input = input.trim();
        String[] words = input.split("\\s+");

        return words.length;
    }
}
