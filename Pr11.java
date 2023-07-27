import java.util.HashSet;
import java.util.Scanner;

public class Pr11 {

    public static int countUniqueCharacters(String str) {
        HashSet<Character> uniqueCharacters = new HashSet<>();
        for (char ch : str.toCharArray()) {
            uniqueCharacters.add(ch);
        }
        return uniqueCharacters.size();
    }

    public static void main(String[] args) {
        String str1;
        String str2;
        
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter a first string: ");
        str1 = inp.nextLine();
        System.out.print("Enter a second string: ");
        str2 = inp.nextLine();

        int uniqueCharactersCount1 = countUniqueCharacters(str1);
        int uniqueCharactersCount2 = countUniqueCharacters(str2);

        System.out.println("String 1: " + str1);
        System.out.println("Number of unique characters in String 1: " + uniqueCharactersCount1);

        System.out.println("String 2: " + str2);
        System.out.println("Number of unique characters in String 2: " + uniqueCharactersCount2);
    }
}
