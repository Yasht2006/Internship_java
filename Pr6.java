public class Pr6 {

    public static String reverseString(String s) {
        int length = s.length();
        StringBuilder reversed = new StringBuilder(length);

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String s = "Hello, World!";
        String revStr = reverseString(s);

        System.out.println("Original string: " + s);
        System.out.println("Reversed string: " + revStr);
    }
}
