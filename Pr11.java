import java.util.HashSet;

public class Pr11 {

    public static int countUniqueCharacters(String str) {
        HashSet<Character> uniqueCharacters = new HashSet<>();
        for (char ch : str.toCharArray()) {
            uniqueCharacters.add(ch);
        }
        return uniqueCharacters.size();
    }

    public static void main(String[] args) {
        String str1 = " python";
        String str2 = "Java";

        int uniqueCharactersCount1 = countUniqueCharacters(str1);
        int uniqueCharactersCount2 = countUniqueCharacters(str2);

        System.out.println("String 1: " + str1);
        System.out.println("Number of unique characters in String 1: " + uniqueCharactersCount1);

        System.out.println("String 2: " + str2);
        System.out.println("Number of unique characters in String 2: " + uniqueCharactersCount2);
    }
}
