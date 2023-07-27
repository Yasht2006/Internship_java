import java.util.Scanner;

public class Pr13 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = inp.nextLine();

        String largestWord = findLargestWord(s);
        System.out.println("The largest word in the string is: " + largestWord);
    }

    public static String findLargestWord(String s) {
        if (s == null || s.trim().isEmpty()) {
            return null; 
        }

        String[] words = s.split("\\s+"); 
        String largestWord = words[0];

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        return largestWord;
    }
}
