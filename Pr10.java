import java.util.Arrays;
import java.util.Scanner;
public class Pr10 {
        public static boolean areAnagrams(String str1, String str2) {
        
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

      
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1;
        String str2;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a first string: ");
        str1=inp.nextLine();
        System.out.print("Enter a second string: ");
        str2=inp.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
