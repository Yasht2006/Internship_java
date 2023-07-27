public class Pr12 {
    public static void main(String[] args) {
        String s = "w3resource";

        String shiftedString = shiftAlphabet(s);
        System.out.println("Original string: " + s);
        System.out.println("Shifted string: " + shiftedString);
    }

    public static String shiftAlphabet(String s) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            // Check if the character is a letter (uppercase or lowercase)
            if (Character.isLetter(currentChar)) {
                // Determine the case of the letter (uppercase or lowercase)
                boolean isUpperCase = Character.isUpperCase(currentChar);

                // Shift the letter by one in the alphabet
                char shiftedChar = (char) (currentChar + 1);

                // Handle 'z' and 'Z' cases to loop back to 'a' and 'A', respectively
                if ((isUpperCase && shiftedChar > 'Z') || (!isUpperCase && shiftedChar > 'z')) {
                    shiftedChar -= 26;
                }

                // Update the character in the charArray
                charArray[i] = shiftedChar;
            }
        }

        return new String(charArray);
    }
}
