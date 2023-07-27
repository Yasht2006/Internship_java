import java.util.Scanner;
public class Pr12 {
    public static void main(String[] args) {
        String s;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = inp.nextLine();

        String shiftedString = shiftAlphabet(s);
        System.out.println("Original string: " + s);
        System.out.println("Shifted string: " + shiftedString);
    }

    public static String shiftAlphabet(String s) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

         
            if (Character.isLetter(currentChar)) {
 
                boolean isUpperCase = Character.isUpperCase(currentChar);

              
                char shiftedChar = (char) (currentChar + 1);

                
                if ((isUpperCase && shiftedChar > 'Z') || (!isUpperCase && shiftedChar > 'z')) {
                    shiftedChar -= 26;
                }

                charArray[i] = shiftedChar;
            }
        }

        return new String(charArray);
    }
}
