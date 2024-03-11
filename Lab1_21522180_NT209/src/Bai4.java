import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so he 10: ");
        int number = scanner.nextInt();
        System.out.print("Nhap he co so B (2 <= B <= 16): ");
        int baseB = scanner.nextInt();
        scanner.close();

        if (baseB < 2 || baseB > 16) {
            System.out.println("He co so B khong hop le.");
            return;
        }

        String result = convertToBaseB(number, baseB);
        System.out.println("So " + number + " o he co so 10 chuyen sang he co so " + baseB + " la: " + result);
    }

    public static String convertToBaseB(int number, int baseB) {
        if (number == 0) {
            return "0"; 
        }

        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % baseB;
            char digit;
            if (remainder < 10) {
                digit = (char) ('0' + remainder);
            } else {
                digit = (char) ('A' + remainder - 10);
            }
            result.insert(0, digit); 
            number /= baseB;
        }
        return result.toString();
    }
}
