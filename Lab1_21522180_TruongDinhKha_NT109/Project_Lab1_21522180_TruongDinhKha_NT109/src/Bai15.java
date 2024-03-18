import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai15 {
   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] codes = new String[5];

        System.out.println("Enter 5 codes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Code " + (i + 1) + ": ");
            codes[i] = scanner.nextLine();
        }
        scanner.close();


        String regex = "00[2-5]L\\d{4}";

        for (String code : codes) {
            if (!isValidCode(code, regex)) {
                System.out.println("Code " + code + " is in the wrong format");
            } else {
                System.out.println("Code " + code + " is correct");
            }
        }
    }

    public static boolean isValidCode(String code, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);
        return matcher.matches();
    }
}
