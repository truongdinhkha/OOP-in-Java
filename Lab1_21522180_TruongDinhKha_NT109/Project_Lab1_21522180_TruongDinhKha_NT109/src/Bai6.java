public class Bai6 {
    public static void main(String[] args) {
        
    }
    public static int USCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}

