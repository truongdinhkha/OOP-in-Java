import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

    

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      do  {
            System.out.println("__________MENU__________");
            System.out.println("0. Exit");
            System.out.println("1. Find all numbers that are divisible by 7 but are not multiples of 5");
            System.out.println("2. Program to calculate the factorial of a positive integer n.");
            System.out.println("3.Program to create a map containing (i, i*i)");
            System.out.println("4.Write a program to convert a natural number in base 10 to a number in base B");
            System.out.print("Please choose a number corresponding to each request: ");
            int a = scanner.nextInt();
            if(a==1) bai1();
            else if(a==2) bai2();
            else if(a==3) bai3();
            else if(a==4) bai4();
            else if(a==0) break;
        } while(true);
scanner.close();
        }
public static void log(Object obj) {

            String logFilePath = "log.txt";
    

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String timestamp = dtf.format(now);

            String logContent = timestamp + " - " + obj.toString();
    
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true))) {
                writer.write(logContent);
                writer.newLine();
                System.out.println("Đã ghi log thành công: " + obj.toString());
            } catch (IOException e) {
                System.err.println("Lỗi khi ghi log: " + e.getMessage());
            }
            
        }
        public static void log_int(int number) {
            log(Integer.valueOf(number)); // Gọi lại hàm log(Object obj) với một đối tượng Integer
        }
    public static void bai1()
    {
    // StringBuilder c = findNumbers();       
    //    log (c);
    log(Bai1.findNumbers());
    }
    public static void bai2()
    {
        
          int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n: ");
        n = scanner.nextInt();
     int a = Bai2.Tinh_Giai_Thua(n);
        log_int((a));
        
    }
    public static void bai3()
    {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n: ");
        n = scanner.nextInt();
     StringBuilder a = Bai3.map(n);
     log(a);
    }


    public static void bai4()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so he 10: ");
        int number = scanner.nextInt();
        System.out.print("Nhap he co so B (2 <= B <= 16): ");
        int baseB = scanner.nextInt();
       

        if (baseB < 2 || baseB > 16) {
            System.out.println("He co so B khong hop le.");

        }

        String result = Bai4.convertToBaseB(number, baseB);
        String a = ("So " + number + " o he co so 10 chuyen sang he co so " + baseB + " la: " + result);
        System.out.println(a);
        log(a);
    }
}
// public static void log(String message) {
//     // Đường dẫn tới file log, bạn có thể thay đổi tùy ý
//     String logFilePath = "log.txt";

//     // Format thời gian
//     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//     LocalDateTime now = LocalDateTime.now();
//     String timestamp = dtf.format(now);

//     // Tạo nội dung log
//     String logContent = timestamp + " - " + message;

//     // Ghi log vào file
//     try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true))) {
//         writer.write(logContent);
//         writer.newLine();
//         System.out.println("Đã ghi log thành công.");
//     } catch (IOException e) {
//         System.err.println("Lỗi khi ghi log: " + e.getMessage());
//     }
// }