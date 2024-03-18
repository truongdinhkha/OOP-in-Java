import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n: ");
        n = scanner.nextInt();
      Tinh_Giai_Thua(n);
    }
    public static int Tinh_Giai_Thua(int n){
        int result = 1;
        
        for(int i = 1; i<=n;i++ )
        {
            result *= i;
        }
        System.out.println(result);
        return result;
    }
}
