import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of characters:");
        String input = scanner.nextLine();
        scanner.close();

        String result = generateWordFrequencyString(input);

        System.out.println("Number of occurrences of words:");
        System.out.println(result);
    }
    public static String generateWordFrequencyString(String input) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        
        
        String[] words = input.split("\\s+");
        
        
        for (String word : words) {
            word = word.toLowerCase();
            
            if (wordFrequencyMap.containsKey(word)) {
               
                int frequency = wordFrequencyMap.get(word);
                wordFrequencyMap.put(word, frequency + 1);
            } else {
                
                wordFrequencyMap.put(word, 1);
            }
        }
        
        StringBuilder resultBuilder = new StringBuilder();
        for (String word : wordFrequencyMap.keySet()) {
            int frequency = wordFrequencyMap.get(word);
            resultBuilder.append(word).append(": ").append(frequency).append("\n");
        }
        return resultBuilder.toString();
    }
}
