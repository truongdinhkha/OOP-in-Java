import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

    

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      do  {
            System.out.println("\n\n\n__________MENU__________");
            System.out.println("0. Exit");
            System.out.println("1. Find all numbers that are divisible by 7 but are not multiples of 5");
            System.out.println("2. Program to calculate the factorial of a positive integer n.");
            System.out.println("3. Program to create a map containing (i, i*i)");
            System.out.println("4. Write a program to convert a natural number in base 10 to a number in base B");
            System.out.println("5. Write a program to find the first n Fibonacci numbers.");
            System.out.println("6. Find the greatest common divisor (USCLN) and least common multiple (BSCNN)");
            System.out.println("7. Write a program to list all prime numbers less than n.");
            System.out.println("8. Write a program to list all 5-digit prime numbers.");
            System.out.println("9. Write a program to decompose the integer n into prime factors.");
            System.out.println("10. Count the number of words in that string.");
            System.out.println("11. List the number of occurrences of the words of that worm.");
            System.out.println("12. Check if worm s1 contains s2.");
            System.out.println("13. a) Find the first and second largest elements in the array with their indices (first index found).\r\n" + //
                                  "b) Sort the array in ascending order.\r\n" + //
                                  "c) Enter the integer x and insert x into array A to still ensure increasing properties for array A.");
            System.out.print("Please choose a number corresponding to each request: ");
            int a = scanner.nextInt();
                 if(a==1) bai1();
            else if(a==2) bai2();
            else if(a==3) bai3();
            else if(a==4) bai4();
            else if(a==5) bai5();
            else if(a==6) bai6();
            else if(a==7) bai7();
            else if(a==8) bai8();
            else if(a==9) bai9();
            else if(a==10) bai10();
            else if(a==11) bai11();
            else if(a==12) bai12();
            else if(a==13) bai13();
            else break;
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
            log(Integer.valueOf(number)); 
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
        System.out.print("Enter the base 10 number system: ");
        int number = scanner.nextInt();
        System.out.print("Enter the B base number system (2 <= B <= 16): ");
        int baseB = scanner.nextInt();
       

        if (baseB < 2 || baseB > 16) {
            System.out.println("Entering an invalid base B number system!");

        }

        String result = Bai4.convertToBaseB(number, baseB);
        String a = ("Nunber " + number + " is converted from base 10 to base " + baseB + " is: " + result);
        System.out.println(a);
        log(a);
    }
    public static void bai5()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to find: ");
        int n = scanner.nextInt();
        

        System.out.print("The first Fibonacci numbers are: ");
       StringBuilder a = new StringBuilder(); 
       a = Bai5.printFibonacci(n);
       System.out.println(a);

       log("Task 5: The first Fibonacci numbers are: " + a);
    }
    public static void bai6()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter number b: ");
        int b = scanner.nextInt();
        System.out.println("The greatest common divisor of two numbers a and b is: "+Bai6.USCLN(a,b));
        log("Task 6: The greatest common divisor of two numbers a and b is: "+Bai6.USCLN(a,b));
        System.out.println("The least common multiple of two numbers a and b is: "+Bai6.BSCNN(a,b));
        log("Task 6: The least common multiple of two numbers a and b is: "+Bai6.BSCNN(a,b));
    }
    public static void bai7()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
    

        System.out.println("Smaller prime numbers " + n + " is: "+Bai7.listPrimeNumbers(n));
        log("Task 7: Smaller prime numbers " + n + " is: " + Bai7.listPrimeNumbers(n));
    }
    public static void bai8()
    {
        System.out.print("Prime numbers with 5 digits are:");
        System.out.println(Bai8.listPrimeNumbers());
        log("Task 8: Prime numbers with 5 digits are:" + Bai8.listPrimeNumbers());
    }
    public static void bai9()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer n: ");
        int n = scanner.nextInt();
        if (Bai9.isPrime(n)){
        System.out.println("Decompose the number " + n + " into prime factors: "+ n +" * 1 ");
        log("Task 9: Decompose the number " + n + " into prime factors: "+ n +" * 1 ");
        }
        
        else{
        System.out.print("Decompose the number " + n + " into prime factors: ");
        System.out.println(Bai9.factorize(n));
        log("Task 9: Decompose the number " + n +  " into prime factors: " + Bai9.factorize(n));
        }
       
    }
    public static void bai10()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of characters:");
        String input = scanner.nextLine();

        int wordCount = Bai10.countWords(input);
        System.out.println("The number of words in the string is: " + wordCount);
        log("Task 10: The number of words in the string is: " + wordCount);
    }
    public static void bai11()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of characters:");
        String input = scanner.nextLine();
        scanner.close();

        String result = Bai11.generateWordFrequencyString(input);

        System.out.println("Number of occurrences of words:");
        System.out.println(result);
        log("Number of occurrences of words:" + result);
    }
    public static void bai12()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = scanner.nextLine();
  
        if ( s1.contains(s2)) {
            System.out.println("String s1 contains string s2.");
            log("String s1 contains string s2.");
        } else {
            System.out.println("String s1 does not contain string s2.");
            log("String s1 does not contain string s2.");
        }
    }
    public static void bai13()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] A = new int[n];
        
        System.out.println("Enter the elements of the array (must be integers greater than 0 and less than 100):");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        
        String result = Bai13.findFirstAndSecondLargest(A);
        System.out.println(result);
        log(result);
        result = Bai13.sortArrayAscending(A);
        System.out.println(result);
        log(result);
        
    }
}
