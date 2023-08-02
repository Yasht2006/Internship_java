import java.util.Scanner;
public class Pr1 
{
    public static void main(String[] args) 
    {
       Scanner inp = new Scanner(System.in);
       // int n = 7;
       System.out.print("Enter the number of lines: ");
       int n = inp.nextInt();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) 
            {
                System.out.print((char) ('A' + k));
            }
           for (int l = i - 1; l >= 0; l--) 
            {
                System.out.print((char) ('A' + l));
            }
            System.out.println();
        }
        
        for (int i = n - 2; i >= 0; i--)
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) 
            {
                System.out.print((char) ('A' + k));
            }
            for (int l = i - 1; l >= 0; l--) 
            {
                System.out.print((char) ('A' + l));
            }
            System.out.println();
        }
    }
}