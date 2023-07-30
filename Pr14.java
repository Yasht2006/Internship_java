import java.util.Scanner;

public class Pr14 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        
        int n, i, j, m1, u1;
  
        System.out.print("Enter the number of lines in odd numbers: ");
        n = inp.nextInt();

        if (n % 2 != 0) 
        {
            m1 = (n - 1) / 2;
            u1 = 3 * n / 2 - 1;

            for (i = 0; i < n; i++) 
            {
                for (j = 0; j < n; j++) 
                {
                    if (i + j == m1 || i - j == m1 || j - i == m1 || i + j == u1 || i == m1 || j == m1)
                        System.out.print(" * ");
                    else
                        System.out.print("   ");
                }
                System.out.println(); 
            }
        } 
        else 
        {
            System.out.println("please enter odd number! "); 
        }
    }
}
