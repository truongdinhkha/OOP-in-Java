import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = scanner.nextLine();
  

        boolean containsSubstring = checkSubstring(s1, s2);

        if ( s1.contains(s2)) {
            System.out.println("String s1 contains string s2.");
        } else {
            System.out.println("String s1 does not contain string s2.");
        }
    }
    public static boolean checkSubstring(String s1, String s2) {
        return s1.contains(s2);
    }
}
