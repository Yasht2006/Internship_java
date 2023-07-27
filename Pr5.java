import java.util.Scanner;

public class Pr5 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = inp.nextLine();


        System.out.print("Enter the character to count: ");
        char charToCount = inp.next().charAt(0);

        int count = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == charToCount) 
            {
                count++;
            }
        }

        System.out.println("The character '" + charToCount + "' occurs " + count + " times in the string.");
    }
}
