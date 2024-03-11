import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        map(n);
    }
    public static StringBuilder map(int n) {
        StringBuilder result= new StringBuilder();
        for(int i = 1; i<=n;i++)
        {
            result.append(i).append(":").append(i*i).append(",");
        }
        if (result.length() > 0) 
            result.deleteCharAt(result.length() - 1);
            System.out.println(result);
        return result;
    }
}
