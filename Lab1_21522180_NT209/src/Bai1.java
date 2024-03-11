public class Bai1{
    public static void main(String[] args) {
        findNumbers();
    }
    public static StringBuilder findNumbers() {
        StringBuilder result = new StringBuilder();

        for (int i = 10; i <= 200; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                result.append(i).append(",");
            }
        }

        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }

        System.out.println(result.toString());
        return result;
    }
}
