import java.util.Arrays;

public class Pr15 {
    public static void main(String[] args) {
        String s = "python";
        String sortedString = sortCharacters(s);
        System.out.println("Original string: " + s);
        System.out.println("Sorted string: " + sortedString);
    }

    public static String sortCharacters(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        char[] chars = s.replaceAll("[^a-zA-Z]", "").toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}
